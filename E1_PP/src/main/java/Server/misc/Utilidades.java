package Server.misc;

/*
*   Objetivo: Metodos para funciones sin un contexto especifico y potencialmente
                muy usadas.
    Notas: 
        + 
*   Autor: Rodrigo Palomo 
 */

import java.util.Random;


public class Utilidades {
    
    public static int numeroRandom (int minimo,int maximo){
        /*
            OBJ: Devuelve numero entero comprendido entre minimo y maximo
                    (ambos inclusive)
            PRE: maximo >= minimo
            POST: -  
         */
        Random random = new Random();
        return random.nextInt((maximo - minimo) + 1) + minimo;
    }
    
}
