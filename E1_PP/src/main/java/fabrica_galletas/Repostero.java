/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabrica_galletas;

/**
 *
 * @author David Serrano
 */

import java.util.Random;

public class Repostero extends Thread {
    private String id;
    private int galletasProducidas;
    private int tandasProducidas;
    private boolean descansando;
    private Horno hornoActual;
    private Random random;
    private AdministradorHornos adm;

    public Repostero(String id, AdministradorHornos adm) {
        this.id = id;
        this.galletasProducidas = 0;
        this.tandasProducidas = 0;
        this.descansando = false;
        this.random = new Random();
        this.adm = adm;
    }

    public void producirGalletas() throws InterruptedException {
        Thread.sleep(2000 + random.nextInt(2000)); // Simula entre 2 y 4 segundos de producción
        int galletas = 37 + random.nextInt(9); // Genera entre 37 y 45 galletas
        galletasProducidas += galletas;
        tandasProducidas++;
        System.out.println(id + " produjo " + galletas + " galletas. Total producidas: " + galletasProducidas);
    }

    public synchronized void depositarEnHorno() throws InterruptedException {
        System.out.println(id + " intentar depositar " + galletasProducidas + " galletas.");
        adm.introducirGalletas(galletasProducidas); 
        galletasProducidas = 0; // Resetea la cantidad tras depositar

    }

    public void descansar() throws InterruptedException {
        System.out.println(id + " está descansando.");
        Thread.sleep(2000); // Prepara café (2 segundos)
        Thread.sleep(3000 + random.nextInt(4000)); // Descanso entre 3 y 6 segundos
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
            System.out.println(id + " fue interrumpido.");
        }
    }

}

