package fabrica_galletas;

import misc.Logger;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AdministradorHornos {

    private final String ID = "adminHorno";
    private final Horno[] arrayDeHornos;
    private final Logger logger;

    private Lock lock = new ReentrantLock();
    private final Condition hornosDisponibles = lock.newCondition();

    public AdministradorHornos(Horno[] arrayDeHornos, Logger logger) {
        this.arrayDeHornos = arrayDeHornos;
        this.logger = logger;
    }

    // Metodo a mejorar -> Programacion estrucurada
    private boolean todosLlenos() {
        for (Horno horno : arrayDeHornos) {
            if (!horno.estaLleno()) {
                //hornosDisponibles.signalAll();
                return false;
            }
        }
        return true;
    }

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
                    logger.add(ID, horno.getID() + "Lleno, pasando al siguiente");
                }
            }

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            logger.add(ID, "Interrumpido mientras intentaba introducir galletas.");
        } finally {
            lock.unlock();
        }
    }

public int retirarGalletas(int cantidad) {
        int retiradas = 0;
        lock.lock();
        try {
            // Caluclar retiradas para que no salga negativo
            retiradas = arrayDeHornos[0].retirarGalletas(cantidad);
            hornosDisponibles.signalAll();
            System.out.println("Signal hecha");
        } 
        catch(Exception e){
            System.out.println(e);
        }    
        finally {
            lock.unlock();
        }
        return retiradas;
    }
    

    

    public void arrancarHornos() {
        for (Horno horno : arrayDeHornos) {
            horno.start();
        }
        logger.add("AdminHornos", "Todos los hornos arrancados");
    }
    
    
}
