package Server.fabrica_galletas;

/**
 * ****************************
 * IMPLEMENTACION DE REPOSTERO
 ******************************
 */
import Server.misc.Utilidades;
import Server.misc.Logger;

public class Repostero extends Thread {

    private String ID;
    private int galletasProducidas = 0;
    private int historicoProducidas = 0;
    private int galletasDesperdiciadas = 0;

    private int tandasProducidas = 0;

    private boolean descansando = false;
    private String situacion;

    private Logger logger;
    private Cafeteria cafeteria;
    private Horno[] arrayDeHornos;
    private int tandas = 0;

    private boolean enPausa = false; // Flag para controlar la pausa
    private final Object lock = new Object(); // Objeto de bloqueo para sincronización

    public Repostero(String ID, Horno[] arrayDeHornos, Cafeteria cafeteria, Logger logger) {
        this.ID = ID;
        this.logger = logger;
        this.arrayDeHornos = arrayDeHornos;
        this.cafeteria = cafeteria;
        situacion = "Iniciado";
    }
    
     public int getTandasProducidas() {
        return tandasProducidas;
    }

    public String getSituacion() {
        return situacion;
    }

    public int getTandas() {
        return tandas;
    }

    public String getID() {
        return ID;
    }
    
    public int getGalletasProducidas() {
        return historicoProducidas;
    }

    public int getGalletasDesperdiciadas() {
        return galletasDesperdiciadas;
    }
    
    
    public boolean isDescansando() {
        return descansando;
    }
    
    // Método para pausar el hilo
    public void parar() {
        synchronized (lock) {
            enPausa = true; // Cambia el estado a pausa
        }
        situacion = "PARADO";
    }

    // Método para reanudar el hilo
    public void reanudar() {
        synchronized (lock) {
            enPausa = false; // Cambia el estado a reanudado
            lock.notify(); // Despierta al hilo bloqueado en el wait()
        }
        situacion = "REANUDANDO";
    }

    /*
        OBJ: Bloquea hilo hasta que se le indique que reanude
        PRE: -
        POST: -
     */
    public void checkPausa() throws InterruptedException {
        synchronized (lock) {
            while (enPausa) {
                lock.wait(); 
            }
        }
    }
    
    /*
        OBJ: Verificar si todos los hornos están llenos.
        PRE: El array de hornos debe estar inicializado.
        POST: Devuelve true si todos los hornos están llenos, false en caso contrario.
     */
    private boolean todosLlenos() {
        for (Horno horno : arrayDeHornos) {
            if (!horno.estaLleno() && !horno.isHorneadas()) {
                return false;
            }
        }
        return true;
    }

    /*
        OBJ: Introducir galletas en el primer horno disponible, manejando desperdicios si es necesario.
        PRE: El array de hornos debe estar inicializado y no estar vacío.
        POST: Las galletas se depositan en el horno disponible o el hilo espera si todos los hornos están llenos.
     */
    public synchronized void introducirGalletas(int nGalletas) throws InterruptedException {
        int galletas = nGalletas;

        while (todosLlenos()) {
            situacion = "Esperando";
            logger.add(ID, "Todos los hornos llenos. Esperando...");
            Thread.sleep(Utilidades.numeroRandom(1000, 1500));
        }

        for (Horno horno : arrayDeHornos) {
            if (!horno.estaLleno() && !horno.isHorneadas()) {
                galletasDesperdiciadas += horno.agregarGalletas(galletas);

                logger.add(ID, galletas + " colocadas en " + horno.getID());
                break;
            } else {
                logger.add(ID, horno.getID() + " Lleno, pasando al siguiente");
            }
        }
    }

    /*
        OBJ: Simular la producción de una tanda de galletas.
        PRE: -
        POST: Incrementa el contador de galletas producidas y tandas realizadas.
     */
    public void producirGalletas() throws InterruptedException {
        tandasProducidas++;
        situacion = "Produciendo (" + tandasProducidas + "/" + tandas + ")";
        Thread.sleep(Utilidades.numeroRandom(2000, 4000)); // Simula entre 2 y 4 segundos de producción

        int galletas = Utilidades.numeroRandom(37, 45); // Genera entre 37 y 45 galletas
        galletasProducidas = galletas;
        historicoProducidas += galletas;

        logger.add(ID, " Produjo " + galletas + " galletas. Total producidas: " + historicoProducidas);
    }

    /*
        OBJ: Depositar las galletas producidas en un horno disponible.
        PRE: Debe haber galletas producidas y al menos un horno debe tener espacio disponible.
        POST: Las galletas producidas se depositan en un horno y el contador se reinicia.
     */
    public synchronized void depositarEnHorno() throws InterruptedException {
        situacion = "Depositando";
        logger.add(ID, " Intenta depositar " + galletasProducidas + " galletas.");
        introducirGalletas(galletasProducidas);
        galletasProducidas = 0; // Resetea la cantidad tras depositar
    }

    /*
        OBJ: Simular el descanso del repostero usando la cafetería.
        PRE: La cafetería debe estar inicializada.
        POST: El hilo descansa durante un tiempo aleatorio antes de retomar la producción.
     */
    public void descansar() throws InterruptedException {
        descansando = true;
        situacion = "Descansando";
        logger.add(ID, " Está descansando.");
        cafeteria.usarCafetera(ID);
        Thread.sleep(Utilidades.numeroRandom(3000, 6000)); // Descanso entre 3 y 6 segundos
        logger.add(ID, " Terminó de descansar.");
        descansando = false;
    }

    /*
        OBJ: Ciclo principal del repostero, alternando entre producción, depósito y descanso.
        PRE: Todos los objetos asociados deben estar inicializados.
        POST: Ejecuta el ciclo de forma indefinida hasta que el hilo sea interrumpido.
     */
    @Override
    public void run() {
        try {
            while (true) {
                tandas = Utilidades.numeroRandom(3, 5); // De 3 a 5 tandas antes de descansar

                for (int i = 0; i < tandas; i++) {
                    // Antes de cada tarea, comprobamos si el hilo está en pausa
                    checkPausa();
                    producirGalletas();  // Produce una tanda
                    checkPausa();
                    depositarEnHorno(); // Deposita las galletas
                    // Pausar después de cada tarea, si es necesario
                    checkPausa();
                }

                descansar();

                // Pausar al final de cada ciclo de tandas, si es necesario
                checkPausa();

                tandasProducidas = 0;
            }
        } catch (InterruptedException e) {
            logger.addE(ID, " fue interrumpido.");
        }
    }    
}
