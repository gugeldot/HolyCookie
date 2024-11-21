package fabrica_galletas;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import misc.Logger;
import misc.Utilidades;

/*
*   Objetivo: Implementacion del almace
    Notas: 
        + Aproximación mediante locks 
        + He usado locks y no semaforos porque veia poco intuitivo de entender
            e interorizar.
    USO GENERAL: 
*   Autor: Rodrigo Palomo 
 */
public class Almacen {

    private Logger logger;
    private int CAPACIDAD_MAXIMA;
    private int capacidad_actual = 0; //READONLY por el resto
    private String ID; //READONLY

    private final ReentrantLock lock = new ReentrantLock();
    private final Condition noLleno = lock.newCondition();
    private final Condition noVacio = lock.newCondition();

    public Almacen(String ID, int CAPACIDAD_MAXIMA, Logger logger) {
        this.CAPACIDAD_MAXIMA = CAPACIDAD_MAXIMA;
        this.ID = ID;
        this.logger = logger;
    }

    public synchronized int getCapacidad_actual() {
        //Usado synchronized porque se lee mejor que lock con try y finally
        return capacidad_actual;
    }

    public String getID() {
        return ID;
    }

    public void almacenar(int cantidad, String autor) {
        lock.lock();
        try {
            while (capacidad_actual + cantidad > CAPACIDAD_MAXIMA) {
                logger.add(ID,autor, " Capacidad maxima, esperando turno...");
                noLleno.await();
            }
            // Fin de la espera, "Ha entrado"
            capacidad_actual += cantidad;

            Thread.sleep(Utilidades.numeroRandom(2, 4));

            logger.add(ID,autor, "Se almacenaron " + cantidad + " galletas. Capacidad actual: " + capacidad_actual);
            noVacio.signalAll();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            lock.unlock();
        }

    }

    public void comer() {
        String autor = "Usuario";
        lock.lock();
        try {
            while (capacidad_actual < 100) {
                logger.add(ID,autor, "No hay suficientes galletas para consumir. Esperando...");
                noVacio.await();
            }

            // Fin de la espera, "Ha entrado"
            capacidad_actual -= 100;

            logger.add(ID,autor, "Se consumieron 100 galletas. Capacidad actual: " + capacidad_actual);
            noLleno.signalAll();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            lock.unlock();
        }
    }

}
