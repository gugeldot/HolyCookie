/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabrica_galletas;

import java.util.Random;
import misc.Logger;
import misc.Utilidades;

public class Empaquetador extends Thread {
    private String id;
    private Horno hornoAsignado;
    private Almacen almacen;
    private int galletasEmpaquetadas;
    private Logger logger;

    public Empaquetador(String id, Horno hornoAsignado, Almacen almacen, Logger logger) {
        this.id = id;
        this.hornoAsignado = hornoAsignado;
        this.almacen = almacen;
        this.galletasEmpaquetadas = 0;
        this.logger = logger;
    }

    public void recogerGalletas() throws InterruptedException {
        // Intentar retirar 20 galletas del horno
        int galletasRetiradas = hornoAsignado.retirarGalletas(20);
        if (galletasRetiradas > 0) {
            galletasEmpaquetadas += galletasRetiradas;
            String mensaje = id + " recogio " + galletasRetiradas + " galletas del " + hornoAsignado.getID() +
                             ". Total empaquetadas: " + galletasEmpaquetadas;
            System.out.println(mensaje);
            logger.add(id, mensaje);
            Thread.sleep(Utilidades.numeroRandom(500, 1000)); // Simula el tiempo de recogida (0.5 a 1 segundo)
        } else {
            String mensaje = id + " esperando porque el horno esta vacio.";
            System.out.println(mensaje);
            logger.add(id, mensaje);
            Thread.sleep(1000); // Espera un poco antes de reintentarlo
        }
    }

    public void transportarAlmacen() throws InterruptedException {
        // Transporta las galletas empaquetadas al almacen
        if (galletasEmpaquetadas >= 100) {
            String mensaje = id + " transporta " + galletasEmpaquetadas + " galletas al almacen.";
            System.out.println(mensaje);
            logger.add(id, mensaje);
            Thread.sleep(Utilidades.numeroRandom(2000, 4000)); // Simula transporte (2-4 segundos)
            almacen.almacenar(galletasEmpaquetadas, id); // Metodo en Almacen para añadir galletas
            galletasEmpaquetadas = 0; // Resetea despues de transportar
        }
    }

    @Override
    public void run() {
        try {
            while (true) {
                recogerGalletas(); // Recoge galletas del horno asignado
                transportarAlmacen(); // Transporta al almacen si tiene 100 galletas
            }
        } catch (InterruptedException e) {
            String mensaje = id + " fue interrumpido.";
            System.out.println(mensaje);
            logger.add(id, mensaje);
        }
    }
}
