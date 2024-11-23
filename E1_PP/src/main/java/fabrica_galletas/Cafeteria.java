/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabrica_galletas;

import misc.Logger;


public class Cafeteria {
    
    private boolean cafeteraOcupada;
    private Logger logger;

    public Cafeteria(Logger logger) {
        this.cafeteraOcupada = false;
        this.logger = logger;
    }

    // Método para acceder a la cafetera
    public synchronized void usarCafetera(String idRepostero) throws InterruptedException {
        while (cafeteraOcupada) {
            logger.add("Cafeteria", "Cafeteria ocupada");
            wait(); // Espera hasta que la cafetera esté libre
        }

        // Ocupa la cafetera
        cafeteraOcupada = true;
        logger.add("Cafeteria", idRepostero + " usando cafetera");
        Thread.sleep(2000); // Simula el tiempo para preparar café
        logger.add("Cafeteria",idRepostero + " terminó de usar la cafetera.");

        // Libera la cafetera
        cafeteraOcupada = false;
        notifyAll(); // Notifica a otros reposteros que pueden usar la cafetera
    }
}