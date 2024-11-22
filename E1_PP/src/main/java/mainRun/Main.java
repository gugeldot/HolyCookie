package mainRun;

import misc.Logger;
import fabrica_galletas.*;
import java.util.logging.Level;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        final int MAX_GALLETAS_HORNO = 200;
        final int NUMERO_REPOSTEROS = 5;

        // Instancia inicial objeto logger, pasar por parametro a toda clase instanciada
        // Nota: Se ha puesto directorio anterior para que se muestre fuera del proyecto
        Logger logger = new Logger("../evolucionGalletas.txt", true);
        Almacen almacen = new Almacen("ALMACEN1", 1000, logger);
        
        AdministradorHornos adminHorno; 
        
        Horno[] arrayHornos = {new Horno("Horno1", MAX_GALLETAS_HORNO,adminHornos, logger),
            new Horno("Horno2", MAX_GALLETAS_HORNO, adminHornos,logger),
            new Horno("Horno3", MAX_GALLETAS_HORNO, adminHornos,logger)};
        adminHornos = new AdministradorHornos(arrayHornos, logger);

        adminHornos.arrancarHornos();

        /*
        // Indexados en array para no perder acceso a cualquiera de ellos
        Repostero[] reposteros = new Repostero[NUMERO_REPOSTEROS]; 
        for (int i = 0; i < reposteros.length; i++) {
            reposteros[i] = new Repostero("Repostero" + (i + 1), adminHornos, logger);
            reposteros[i].start();
        }
         */
        
        Thread thread = new Thread(() -> {
            adminHornos.introducirGalletas(500);
            adminHornos.introducirGalletas(500);
            adminHornos.introducirGalletas(500);
            adminHornos.introducirGalletas(500);
        });

        Thread thread2 = new Thread(() -> {
            try {
                Thread.sleep(2000);
                arrayHornos[0].retirarGalletas(300);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        });

        thread.start();
        thread2.start();

        System.out.println("Todo arrancado!");
    }
}
