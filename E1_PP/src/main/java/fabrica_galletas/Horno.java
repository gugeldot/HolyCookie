package fabrica_galletas;

/*
*   Objetivo: Implementacion del horno
    Notas: 
        + 
*   Autor: Rodrigo Palomo 
 */
import misc.Logger;

public class Horno implements Runnable {
    
    private final int DURACION_HORNEO = 8 * 1000;   // CONST
    private String ID;                              // READONLY
    private int capacidadMAX;                       // READONLY
    private Logger logger; 
    
    public Horno(String ID, int capacidadMAX,Logger logger) {
        this.ID = ID;
        this.capacidadMAX = capacidadMAX;
        this.logger = logger;
    }

    public String getID() {
        return ID;
    }
   
    public int getCapacidadMAX() {
        return capacidadMAX;
    }
 
    
    
    
    @Override 
    public void run() {
        logger.add(ID, " Arrancado");
    }
    

}
