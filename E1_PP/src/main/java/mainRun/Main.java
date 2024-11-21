package mainRun;

import misc.Logger;
import fabrica_galletas.*;

public class Main {
    public static void main(String[] args) {
        // Instancia inicial objeto logger, pasar por parametro a toda clase instanciada
        // Nota: Se ha puesto directorio anterior para que se muestre fuera del proyecto
        Logger logger = new Logger("../evolucionGalletas.txt",false); 
        
        Almacen almacen = new Almacen("ALMACEN1",1000,logger);
        
    }
}
