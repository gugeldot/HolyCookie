package fabrica_galletas;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import misc.Logger;
import misc.Utilidades;

/*
*   Objetivo: Implementacion del almacen
    Notas: 
        + Aproximación mediante locks 
        + He usado locks y no semaforos porque veia poco intuitivo de entender
            e interorizar.
*   Autor: Rodrigo Palomo 
 */
public class Almacen {

    // Atributos
    private Logger logger;
    private int CAPACIDAD_MAXIMA;
    private int capacidad_actual = 0; //READONLY por el resto
    private String ID; //READONLY

    // Locks & Conditions
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition noLleno = lock.newCondition();
    private final Condition noVacio = lock.newCondition();

    public Almacen(String ID, int CAPACIDAD_MAXIMA, Logger logger) {
        this.CAPACIDAD_MAXIMA = CAPACIDAD_MAXIMA;
        this.ID = ID;
        this.logger = logger;
    }

    /*
            OBJ: getter capacidad total
            PRE: -
            POST: -  
            EXTRA: Usado synchronized porque se lee mejor que lock con try y finally
     */
    public synchronized int getCapacidad_actual() {
        return capacidad_actual;
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
            OBJ: Almacena en capacidad actual en numero de galletas indicado
                 Usa exclusion mutua mendiante locks y conditions
            PRE: -
            POST: Capacidad actual actualizada o hilo en espera para ello  
     */
    public void almacenar(int cantidad, String autor) {
        lock.lock();
        try {
            while (capacidad_actual + cantidad > CAPACIDAD_MAXIMA) {
                logger.add(ID, autor, " Capacidad maxima, esperando turno...");
                noLleno.await();
            }

            // Fin de la espera, "Ha entrado"
            capacidad_actual += cantidad;

            Thread.sleep(Utilidades.numeroRandom(2, 4) * 1000);

            logger.add(ID, autor, "Se almacenaron " + cantidad + " galletas. Capacidad actual: " + capacidad_actual);

            noVacio.signalAll();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            lock.unlock();
        }

    }

    /*
            OBJ: Consume galletas del almacen
                 Usa exclusion mutua mendiante locks y conditions
            PRE: Pensada para interaccion por boton en interfaz "Comer"
            POST: Capacidad actual actualizada o hilo en espera para ello 
     */
    public void comer() {
        String autor = "Usuario";
        if ((capacidad_actual >= 100)) {
            capacidad_actual -= 100;
            logger.add(ID, autor, "Se consumieron 100 galletas. Capacidad actual: " + capacidad_actual);
        }
        /*
        // Antigua implementacion
        lock.lock();
        try {
            while (capacidad_actual < 100) {
                logger.add(ID,autor, "No hay suficientes galletas para consumir. Esperando...");
                noVacio.await(); // En un futuro es probable que no haya que dejar el hilo congelado, si no descartar la solicitud
            }

            // Fin de la espera, "Ha entrado"
            capacidad_actual -= 100;

            logger.add(ID,autor, "Se consumieron 100 galletas. Capacidad actual: " + capacidad_actual);
            noLleno.signalAll();
            
        }
        catch (Exception e) { System.out.println(e); } 
        finally { lock.unlock(); }*/
    }

}
