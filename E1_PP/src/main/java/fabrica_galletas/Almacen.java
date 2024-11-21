package fabrica_galletas;

/*
*   Objetivo: 
    Notas: 
        + 
    USO GENERAL: 
*   Autor: Rodrigo Palomo 
 */

public class Almacen {
    private int CAPACIDAD_MAXIMA;
    private int capacidad_actual = 0; //READONLY por el resto

    public Almacen(int CAPACIDAD_MAXIMA, int capacidad_actual) {
        this.CAPACIDAD_MAXIMA = CAPACIDAD_MAXIMA;
    }
    
    public int getCapacidad_actual() {
        return capacidad_actual;
    }

    public void almacenar(int cantidad) {}
    public void comer() {}
    
}
