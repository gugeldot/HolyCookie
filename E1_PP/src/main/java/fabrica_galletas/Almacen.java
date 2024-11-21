package fabrica_galletas;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import misc.Logger;

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

    private final ReentrantLock lock = new ReentrantLock();
    private final Condition noLleno = lock.newCondition();
    private final Condition noVacio = lock.newCondition();

    public Almacen(int CAPACIDAD_MAXIMA,  Logger logger) {
        this.CAPACIDAD_MAXIMA = CAPACIDAD_MAXIMA;
        this.logger = logger;
    }

    public synchronized int getCapacidad_actual() { 
       //Usado synchronized porque se lee mejor que lock con try y finally
       return capacidad_actual;
    }

    public void almacenar(int cantidad) {
        lock.lock();
        try {
            while (capacidad_actual + cantidad > CAPACIDAD_MAXIMA) {
                System.out.println("Almacén lleno. Esperando a que se libere espacio...");
                noLleno.await();
            }
            // Fin de la espera, "Ha entrado"
            capacidad_actual += cantidad;
            System.out.println("Se almacenaron " + cantidad + " galletas. Capacidad actual: " + capacidad_actual);
            noVacio.signalAll(); 
        }
        catch (Exception e) { System.out.println(e); }
        finally { lock.unlock(); }
        

    }

    public void comer() {
        lock.lock();
        try {
            while (capacidad_actual < 100) {
                System.out.println("No hay suficientes galletas para consumir. Esperando...");
                noVacio.await();
            }
            
            // Fin de la espera, "Ha entrado"
            capacidad_actual -= 100;
            System.out.println("Se consumieron 100 galletas. Capacidad actual: " + capacidad_actual);
            noLleno.signalAll(); 
        } 
        catch (Exception e) { System.out.println(e); }
        finally { lock.unlock(); }
    }

}
