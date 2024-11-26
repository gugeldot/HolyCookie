package mainRun;

import misc.Logger;
import fabrica_galletas.*;
import INTERFAZ.Principal;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        final int MAX_GALLETAS_HORNO = 200;
        final int NUMERO_REPOSTEROS = 5;
        
        Logger logger = new Logger("../evolucionGalletas.txt", true);
        Almacen almacen = new Almacen("ALMACEN1", 1000, logger);
        
        Horno[] hornos = {  new Horno("Horno1", MAX_GALLETAS_HORNO, logger),
                            new Horno("Horno2", MAX_GALLETAS_HORNO, logger),
                            new Horno("Horno3", MAX_GALLETAS_HORNO, logger)};

        for (Horno horno : hornos) 
            horno.start();

   
        Cafeteria cafeteria = new Cafeteria(logger);
                
        // Indexados en array para no perder acceso a cualquiera de ellos
        Repostero[] reposteros = new Repostero[NUMERO_REPOSTEROS];
        for (int i = 0; i < reposteros.length; i++) {
            reposteros[i] = new Repostero("Repostero" + (i + 1), hornos, cafeteria, logger);
            reposteros[i].start();
        }
           
        // Inicializar los empaquetadores
        Empaquetador[] empaquetadores = new Empaquetador[3];
        for (int i = 0; i < empaquetadores.length; i++) {
            empaquetadores[i] = new Empaquetador("Empaquetador" + (i + 1), hornos[i], almacen, logger);
            empaquetadores[i].start();
        }
        
        
        Principal principal = new Principal(cafeteria,reposteros,hornos,empaquetadores,almacen);
        principal.setVisible(true);
        Thread thread = new Thread(principal); // Pasar Principal como Runnable a un Thread
        thread.start(); // Inicia el hilo, llamando al método run
      
    }
}
