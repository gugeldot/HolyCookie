package Server.fabrica_galletas;

import Server.misc.Logger;

/*
*   Objetivo: Manejar el uso de la cafetera 
 */


public class Cafeteria {
    
    private boolean cafeteraOcupada;
    private Logger logger;
    private String idOcupado = "  ";
    
    public Cafeteria(Logger logger) {
        this.cafeteraOcupada = false;
        this.logger = logger;
    }

    public String getIdOcupado() {
        return idOcupado;
    }
    
    // Método para acceder a la cafetera
    public synchronized void usarCafetera(String idRepostero) throws InterruptedException {
        while (cafeteraOcupada) {
            logger.add("Cafeteria", "Cafeteria ocupada");
            wait(); // Espera hasta que la cafetera esté libre
        }

        // Ocupa la cafetera
        cafeteraOcupada = true;
        idOcupado = idRepostero;
        logger.add("Cafeteria", idRepostero + " usando cafetera");
        Thread.sleep(2000); // Simula el tiempo para preparar café
        logger.add("Cafeteria",idRepostero + " terminó de usar la cafetera.");

        // Libera la cafetera
        cafeteraOcupada = false;
        idOcupado = "  ";
        notifyAll(); // Notifica a otros reposteros que pueden usar la cafetera
    }
}