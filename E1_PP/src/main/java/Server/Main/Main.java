package Server.Main;

import Server.fabrica_galletas.Empaquetador;
import Server.fabrica_galletas.Cafeteria;
import Server.fabrica_galletas.Horno;
import Server.fabrica_galletas.Repostero;
import Server.fabrica_galletas.Almacen;
import Server.misc.Logger;
import Server.GUI.Principal;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        /****************************************
        *   CONSTANTES
        ****************************************/
        final int MAX_GALLETAS_HORNO = 200;
        final int NUMERO_REPOSTEROS = 5;

        
        /****************************************
        *   BOOLEANOS POR SI SE QUIERE DESACTIVAR GUI/RMI
        ****************************************/
        final boolean GUI_ACTIVADO = true;
        final boolean RMI_ACTIVADO = true;

        /****************************************
        *   INSTANCIAS DE CLASES FABRICA
        ****************************************/
        
        Logger logger = new Logger("../evolucionGalletas.txt", true);
        Almacen almacen = new Almacen("ALMACEN1", 1000, logger);

        Horno[] hornos = {new Horno("Horno1", MAX_GALLETAS_HORNO, logger),
            new Horno("Horno2", MAX_GALLETAS_HORNO, logger),
            new Horno("Horno3", MAX_GALLETAS_HORNO, logger)};

        for (Horno horno : hornos) {
            horno.start();
        }

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

        /****************************************
        *   PARTE DE GUI 
        ****************************************/
        if (GUI_ACTIVADO) {
            logger.add("Sistema", "GUI Activandose");
            Principal principal = new Principal(cafeteria, reposteros, hornos, empaquetadores, almacen);
            principal.setVisible(true);
            Thread thread = new Thread(principal); // Pasar Principal como Runnable a un Thread
            thread.start(); // Inicia el hilo, llamando al método run
            logger.add("Sistema", "GUI listo...");
        }

        
        /****************************************
        *   PARTE DE RMI SERVIDOR
        ****************************************/
        if (RMI_ACTIVADO) {
            try {
                logger.add("Sistema", "RMI INCIANDOSE");
                // Crear el objeto remoto
                FabricaGalletasImpl fabrica = new FabricaGalletasImpl(reposteros, hornos, almacen);

                // Crear un registro RMI en el puerto 1099 (puerto predeterminado)
                LocateRegistry.createRegistry(1099);

                // Registrar el objeto en el registro RMI bajo el nombre "Servicio"
                Naming.rebind("//localhost/fabrica", fabrica);

                logger.add("Sistema", "Servidor RMI listo...");
                System.out.println("READY!");

            } catch (Exception e) {
                logger.addE("Sistema", "Error en el servidor RMI: " + e.getMessage());
                System.out.println(e.getMessage());
            }
        }
    }
}
