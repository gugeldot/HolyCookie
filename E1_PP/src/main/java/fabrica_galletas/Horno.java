package fabrica_galletas;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import misc.Logger;

/*
*   Objetivo: Implementacion del horno
    Notas: 
        + Aproximación mediante locks 
        + Se intentó con monitores pero las condiciones con locks lo hacen 
            mucho mas flexible con los signal
*   Autor: Rodrigo Palomo 
*/

public class Horno extends Thread {

    // Variables y constantes
    private final int DURACION_HORNEO = 8 * 1000;   // Constante
    private String ID;                              // READONLY
    private int capacidadMAX;                       // READONLY
    private int capacidad_actual = 0;
    private Logger logger;

    // Lock y condition
    private final Lock lock = new ReentrantLock();
    private final Condition lleno = lock.newCondition();
    private final Condition vacio = lock.newCondition();

    public Horno(String ID, int capacidadMAX, Logger logger) {
        this.ID = ID;
        this.capacidadMAX = capacidadMAX;
        this.logger = logger;
    }
    
    /*
            OBJ: getter ID
            PRE: -
            POST: -  
    */
    public String getID() {
        return ID;
    }

    /*
            OBJ: getter capacidad maxima
            PRE: -
            POST: -  
    */
    public int getCapacidadMAX() {
        return capacidadMAX;
    }
    
    
    /*
            OBJ: Agrega galletas al horno hasta llegar a 200, si eso ocurre
                    entonces libera el condition que inicia el horneado
            PRE: -
            POST: -  
    */
    public int agregarGalletas(int cantidad) {
        int desperdicio = 0;
        lock.lock();
        try {
            desperdicio = (capacidad_actual + cantidad) - capacidadMAX;

            if (desperdicio > 0) {
                logger.add(ID, "No caben todas, galletas a tirar: " + desperdicio);
                capacidad_actual = capacidadMAX;
            } 
            else { capacidad_actual += cantidad; }

            logger.add(ID, " Se han agregado " + cantidad + " galletas. Total: " + capacidad_actual);

            // Si el horno se llena, notificar al hilo del horno
            if (capacidad_actual == capacidadMAX) 
                lleno.signal();
            

        } finally { lock.unlock(); }
        
        return desperdicio;
    }

    /*
            OBJ: Retira galletas, siempre post-horneado, cuando las retire 
                 todas entonces dará la senal para seguir recibiendo nuevas 
                 galletas.
            PRE: -
            POST: -  
    */
    public int retirarGalletas(int cantidad) {
        int retiradas; 
        lock.lock();
        try {
            // Caluclar retiradas para que no salga negativo
            if (cantidad > capacidad_actual) {
                retiradas = capacidad_actual;
                capacidad_actual = 0;
            } 
            else {
                retiradas = cantidad;
                capacidad_actual -= cantidad;
            }
            
            // Logger + signal de lock
            String mensaje = " Se han retirado " + retiradas + " galletas.";
            if (capacidad_actual == 0) {
                mensaje += " El horno está vacío.";
                vacio.signal(); // Señalar que el horno está vacío
            } 
            else { mensaje += " Galletas restantes: " + capacidad_actual; }
            
            logger.add(ID, mensaje);

        } finally { lock.unlock(); }
        return retiradas; 
    }

    /*
            OBJ: Ciclo principal del propio hilo, bloqueo de lock para esperar 
                 horneado y para esperar retirada completa
            PRE: -
            POST: -  
    */
    @Override
    public void run() {
        logger.add(ID, " Encendido!");
        boolean seguir = true;

        while (seguir) {
            lock.lock();
            try {
                // A espera de signal que horno este lleno (agregarGalletas)
                while (capacidad_actual < capacidadMAX) {
                    logger.add(ID, " Esperando a llenarse. Galletas actuales: " + capacidad_actual);
                    lleno.await(); 
                }

                // Proceso de horneado
                logger.add(ID, " Horneando...");
                Thread.sleep(DURACION_HORNEO);
                logger.add(ID, " Horneado completado.");

                //  A espera de signal que horno este vacio (retirarGalletas)
                while (capacidad_actual > 0) {
                    logger.add(ID, " Esperando a que el horno se vacíe. Galletas restantes: " + capacidad_actual);
                    vacio.await(); 
                }

                logger.add(ID, " Horno vacío y listo para recibir nuevas galletas.");

            } 
            catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                logger.add(ID, " Error, Horno detenido.");
                seguir = false;
            }
            finally { lock.unlock(); }
        }
    }
}
