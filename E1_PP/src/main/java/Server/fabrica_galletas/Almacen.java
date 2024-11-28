package Server.fabrica_galletas;


import Server.misc.Logger;


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
        try {
            // Bloque sincronizado para manejar la exclusión mutua
            synchronized (this) {
                // Esperar si no hay suficiente espacio en el almacén
                while (getCapacidad_actual() + cantidad > CAPACIDAD_MAXIMA) {
                    //System.out.println("Capacidad actual: " + getCapacidad_actual());
                    logger.add(ID, autor, "Capacidad máxima alcanzada, esperando turno...");
                    wait();
                }

                // Agregar las galletas al almacén
                capacidad_actual += cantidad;

                //System.out.println("Se almacenaron " + cantidad + " galletas. Capacidad actual: " + capacidad_actual);
                logger.add(ID, autor, "Se almacenaron " + cantidad + " galletas. Capacidad actual: " + capacidad_actual);

                // Notificar a todos los hilos que podrían estar esperando
                notifyAll();
            }

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            logger.addE(ID,"Hilo interrumpido: " + e.getMessage());
        }
    }   
        /*
            OBJ: Consume galletas del almacen
                 Usa exclusion mutua mendiante locks y conditions
            PRE: Pensada para interaccion por boton en interfaz "Comer"
            POST: Capacidad actual actualizada o hilo en espera para ello 
         */
    public synchronized void comer() {
        String autor = "Usuario";
        try {
            if (capacidad_actual >= 100) {
                capacidad_actual -= 100;
                logger.add(ID, autor, "Se consumieron 100 galletas. Capacidad actual: " + capacidad_actual);

                // Notificar a los hilos en espera que la capacidad ha cambiado
                notify();
            } else {
                logger.add(ID, autor, "No hay suficientes galletas para consumir 100. Capacidad actual: " + capacidad_actual);
            }
        } catch (Exception e) {
           logger.addE(autor,"Error en comer: " + e.getMessage());
        }
    }
}
