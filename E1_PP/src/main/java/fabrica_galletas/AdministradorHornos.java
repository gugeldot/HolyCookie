package fabrica_galletas;

import misc.Logger;

public class AdministradorHornos {
    private Horno[] arrayDeHornos;
    private Logger logger;
    
    public AdministradorHornos (Horno[] arrayDeHornos, Logger logger) {
        this.arrayDeHornos = arrayDeHornos;
        this.logger = logger;
    }
    
    public int introducirGalletas() { 
        int galletas_desperdiciadas = 0;
        // TO DO!
        return galletas_desperdiciadas;
    }
    
    public void arrancarHornos() {
        for (Horno horno : arrayDeHornos)  {
            horno.start();
        }
        logger.add("AdminHornos", "Todos los hornos arrancados");
    }
}
