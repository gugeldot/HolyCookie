package fabrica_galletas;

import misc.Logger;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
*   Objetivo: Implementacion de la gestion de hornos, tanto retirada como ingreso
    Notas: 
        + Aproximación mediante locks 
        + He usado locks  para espera si todos hornos llenos 
*   Autor: Rodrigo Palomo 
 */
public class AdministradorHornos {

    private final String ID = "adminHorno";
    private final Horno[] arrayDeHornos;
    private final Logger logger;

    private final Lock lock = new ReentrantLock();
    private final Condition hornosDisponibles = lock.newCondition();

    public AdministradorHornos(Horno[] arrayDeHornos, Logger logger) {
        this.arrayDeHornos = arrayDeHornos;
        this.logger = logger;
    }

    /*
            OBJ: Checker para ver si todos los hornos están llenos
            PRE: -
            POST: -  
            EXTRA:
     */
    private boolean todosLlenos() {
        for (Horno horno : arrayDeHornos) {
            if (!horno.estaLleno()) {
                return false;
            }
        }
        return true;
    }

    /*
            OBJ: Busca un horno donde introducir las galletas, descartando 
                aquellos donde no quepan pero sí los introduce si no estan llenos
                , el propio horno ya se encargará de los desperdicios
            PRE: -
            POST: -  
            EXTRA:
     */
    public void introducirGalletas(int nGalletas) {
        lock.lock(); // Asegurar exclusión mutua
        try {
            int galletas = nGalletas;
            // Mientras todos los hornos estén llenos, el hilo debe esperar
            while (todosLlenos()) {
                logger.add(ID, "Todos los hornos llenos. Esperando...");
                System.out.println("Todos los hornos llenos. Esperando...");
                hornosDisponibles.await();
            }

            // Intentar colocar las galletas en el primer horno disponible
            for (Horno horno : arrayDeHornos) {
                if (!horno.estaLleno()) {
                    logger.add(ID, galletas + " colocadas en " + horno.getID());
                    horno.agregarGalletas(galletas);

                    System.out.println("Metiendo " + galletas + " en " + horno.getID());
                    break; // Sale del bucle cuando logra colocar las galletas
                } else {
                    logger.add(ID, horno.getID() + " Lleno, pasando al siguiente");
                }
            }

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            logger.add(ID, "Interrumpido mientras intentaba introducir galletas.");
        } finally {
            lock.unlock();
        }
    }

    /*
            OBJ: Retirada de galletas de un horno en concreto 
            PRE: -
            POST: -  
            EXTRA: Cuando instancien empaquetadores definir indice del 
                    arrayHornos al que represente su horno predilecto
            ejemplo: Empaquetador em1 = new Empaquetador("E1",0,logger);
     */
    public int retirarGalletas(int index, int cantidad) {
        int retiradas = 0;
        lock.lock();
        try {
            // Caluclar retiradas para que no salga negativo
            retiradas = arrayDeHornos[index].retirarGalletas(cantidad);
            hornosDisponibles.signalAll();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            lock.unlock();
        }
        return retiradas;
    }

    /*
            OBJ: Proceso para arrancar todos los hornos a la vez
            PRE: -
            POST: -  
            EXTRA: 
     */
    public void arrancarHornos() {
        for (Horno horno : arrayDeHornos) {
            horno.start();
        }
        logger.add("AdminHornos", "Todos los hornos arrancados");
    }

}
