package fabrica_galletas;

/**
 *
 * @author David Serrano
 */
import java.util.Random;
import misc.Utilidades;
import misc.Logger;

public class Repostero extends Thread {

    private String id;
    private int galletasProducidas;
    private int tandasProducidas;
    private boolean descansando;
    private Horno hornoActual;
    private Random random;
    private AdministradorHornos adm;
    private Logger logger;

    public Repostero(String id, AdministradorHornos adm, Logger logger) {
        this.id = id;
        this.galletasProducidas = 0;
        this.tandasProducidas = 0;
        this.descansando = false;
        this.random = new Random();
        this.adm = adm;
        this.logger = logger;
    }

    public void producirGalletas() throws InterruptedException {

        Thread.sleep(Utilidades.numeroRandom(2000, 4000)); // Simula entre 2 y 4 segundos de producción

        int galletas = Utilidades.numeroRandom(37, 45); // Genera entre 37 y 45 galletas
        galletasProducidas += galletas;
        tandasProducidas++;
        System.out.println(id + " produjo " + galletas + " galletas. Total producidas: " + galletasProducidas);
        logger.add(id, " produjo " + galletas + " galletas. Total producidas: " + galletasProducidas);
    }

    public synchronized void depositarEnHorno() throws InterruptedException {
        System.out.println(id + " intentar depositar " + galletasProducidas + " galletas.");
        logger.add(id, " intentar depositar " + galletasProducidas + " galletas.");
        adm.introducirGalletas(galletasProducidas);
        galletasProducidas = 0; // Resetea la cantidad tras depositar

    }

    public void descansar() throws InterruptedException {
        System.out.println(id + " está descansando.");
        logger.add(id, " está descansando.");
        Thread.sleep(2000); // Prepara café (2 segundos)
        Thread.sleep(Utilidades.numeroRandom(3000, 6000)); // Descanso entre 3 y 6 segundos

        logger.add(id, " terminó de descansar.");
        System.out.println(id + " terminó de descansar.");
    }

    @Override
    public void run() {
        try {
            while (true) {
                int tandas = random.nextInt(3) + 3; // De 3 a 5 tandas antes de descansar

                for (int i = 0; i < tandas; i++) {
                    producirGalletas();  // Produce una tanda
                    depositarEnHorno(); // Deposita las galletas
                }

                descansar();
                tandasProducidas = 0;

            }
        } catch (InterruptedException e) {
            logger.add(id, " fue interrumpido.");
            System.out.println(id + " fue interrumpido.");
        }
    }

}
