package mainRun;

import misc.Logger;
import fabrica_galletas.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        final int  MAX_GALLETAS_HORNO = 200;
        final int NUMERO_REPOSTEROS = 5;
        
        // Instancia inicial objeto logger, pasar por parametro a toda clase instanciada
        // Nota: Se ha puesto directorio anterior para que se muestre fuera del proyecto
        Logger logger = new Logger("../evolucionGalletas.txt", true);
        Almacen almacen = new Almacen("ALMACEN1", 1000, logger);

        
        Horno[] arrayHornos = {new Horno("Horno1", MAX_GALLETAS_HORNO, logger),
                               new Horno("Horno2", MAX_GALLETAS_HORNO, logger),
                               new Horno("Horno3", MAX_GALLETAS_HORNO, logger)};
        AdministradorHornos adminHornos = new AdministradorHornos(arrayHornos, logger);

        adminHornos.arrancarHornos();

        Cafeteria cafeteria = new Cafeteria(logger);
                
        // Indexados en array para no perder acceso a cualquiera de ellos
        Repostero[] reposteros = new Repostero[NUMERO_REPOSTEROS]; 
        for (int i = 0; i < reposteros.length; i++) {
            reposteros[i] = new Repostero("Repostero" + (i + 1), adminHornos, logger, cafeteria);
            reposteros[i].start();
        }

        /*
        // Pruebas con hornos (habria que hacer el metodo de adminHornos para 
        // que gestionen ellos las adiciones
        
        arrayHornos[0].agregarGalletas(180);
        Thread.sleep(2000);
        System.out.println("Ahora si");
        arrayHornos[0].agregarGalletas(20);
        
        Thread.sleep (2000);
        System.out.println("Ahora2");
        arrayHornos[0].retirarGalletas(50);
        arrayHornos[0].retirarGalletas(250);
         */
        
        System.out.println("Todo arrancado!");
    }
}
