package fabrica_galletas;

/**
 *
 * @author David Serrano
 */
import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import misc.Utilidades;
import misc.Logger;

public class Repostero extends Thread {

    private String ID;
    private int galletasProducidas = 0;
    private int tandasProducidas = 0;
    private boolean descansando = false;
    
   
    private Logger logger;
    private Cafeteria cafeteria;
    private Horno[] arrayDeHornos;
  
    private final Lock lock = new ReentrantLock();
    private final Condition hornosDisponibles = lock.newCondition();

    public Repostero(String ID, Horno[] arrayDeHornos, Cafeteria cafeteria, Logger logger) {
        this.ID = ID;
        this.logger = logger;
        this.arrayDeHornos = arrayDeHornos;
        this.cafeteria = cafeteria;
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
    public synchronized void introducirGalletas(int nGalletas) throws InterruptedException {
        int galletas = nGalletas;
        // Intentar colocar las galletas en el primer horno disponible
        
        
        /*
        AYUDA AQUI YA! PROBLEMA! -> Si bloqueo aqui el hilo con un condition
        y el condition solo lo puede levantar el sacar cosas del horno entonces que hacemos
        porque desde horno no se puede acceder a esta condition
        
        Por ahora esta la chapuza esta del while y sleep
        */
        while (todosLlenos()) {
            logger.add(ID, "Todos los hornos llenos. Esperando...");
            System.out.println("Todos los hornos llenos. Esperando...");
            Thread.sleep(Utilidades.numeroRandom(1500, 2000));
            //hornosDisponibles.await();
        }

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
    }

    public void producirGalletas() throws InterruptedException {

        Thread.sleep(Utilidades.numeroRandom(2000, 4000)); // Simula entre 2 y 4 segundos de producción

        int galletas = Utilidades.numeroRandom(37, 45); // Genera entre 37 y 45 galletas
        galletasProducidas += galletas;
        tandasProducidas++;
        System.out.println(ID + " produjo " + galletas + " galletas. Total producidas: " + galletasProducidas);
        logger.add(ID, " produjo " + galletas + " galletas. Total producidas: " + galletasProducidas);
    }

    public synchronized void depositarEnHorno() throws InterruptedException {
        System.out.println(ID + " intentar depositar " + galletasProducidas + " galletas.");
        logger.add(ID, " intentar depositar " + galletasProducidas + " galletas.");
        introducirGalletas(galletasProducidas);
        galletasProducidas = 0; // Resetea la cantidad tras depositar
    }

    public void descansar() throws InterruptedException {
        System.out.println(id + " esta descansando.");
        logger.add(id, " está descansando.");
        cafeteria.usarCafetera(id);
        Thread.sleep(Utilidades.numeroRandom(3000, 6000)); // Descanso entre 3 y 6 segundos

        logger.add(id, " termino de descansar.");
        System.out.println(id + " termino de descansar.");
    }

    @Override
    public void run() {
        try {
            while (true) {
                int tandas = Utilidades.numeroRandom(3, 5); // De 3 a 5 tandas antes de descansar

                for (int i = 0; i < tandas; i++) {
                    producirGalletas();  // Produce una tanda
                    depositarEnHorno(); // Deposita las galletas
                }

                descansar();
                tandasProducidas = 0;
            }
        } catch (InterruptedException e) {
            logger.add(ID, " fue interrumpido.");
            System.out.println(ID + " fue interrumpido.");
        }
    }

}
