package mainRun;

import misc.Logger;
import fabrica_galletas.*;

public class Main {
    public static void main(String[] args) {
        // Instancia inicial objeto logger, pasar por parametro a toda clase instanciada
        // Nota: Se ha puesto directorio anterior para que se muestre fuera del proyecto
        Logger logger = new Logger("../evolucionGalletas.txt",false); 
        
        Almacen almacen = new Almacen("ALMACEN1",1000,logger);
        
        int MAX_GALLETAS_HORNO = 200;
        Horno[] arrayHornos = {new Horno("Horno1",MAX_GALLETAS_HORNO,logger),
                               new Horno("Horno2",MAX_GALLETAS_HORNO,logger),
                               new Horno("Horno3",MAX_GALLETAS_HORNO,logger) };
        
        AdministradorHornos adminHornos = new AdministradorHornos(arrayHornos,logger);
        
        
        adminHornos.arrancarHornos();
        
    }
}
