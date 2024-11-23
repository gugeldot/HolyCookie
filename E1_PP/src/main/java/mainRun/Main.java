package mainRun;

import misc.Logger;
import fabrica_galletas.*;
import java.util.logging.Level;
import misc.Utilidades;

public class Main {
    // PRUEBAS 
    public static void proc_Simulador_repostero(Horno[] hornos){
         // Crear y lanzar un hilo usando una expresión lambda
        Thread hilo = new Thread(() -> {
            while(true){
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    java.util.logging.Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                hornos[Utilidades.numeroRandom(0, 2)].retirarGalletas(200);
            }
        });

        // Iniciar el hilo
        hilo.start();
    }
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
        

        // Indexados en array para no perder acceso a cualquiera de ellos
        Repostero[] reposteros = new Repostero[NUMERO_REPOSTEROS];
        for (int i = 0; i < reposteros.length; i++) {
            reposteros[i] = new Repostero("Repostero" + (i + 1), hornos, logger);
            reposteros[i].start();
        }

        
        //proc_Simulador_repostero(hornos);
    }
}
