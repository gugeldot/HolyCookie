package fabrica_galletas;

import misc.Logger;

public class AdministradorHornos {

    private String ID = "adminHorno"; 
    private Horno[] arrayDeHornos;
    private Logger logger;

    public AdministradorHornos(Horno[] arrayDeHornos, Logger logger) {
        this.arrayDeHornos = arrayDeHornos;
        this.logger = logger;
    }

    public synchronized void introducirGalletas(int nGalletas) {
        int galletas = nGalletas;
        int lengthH = arrayDeHornos.length;
        
        for (Horno horno : arrayDeHornos) {
            if (!horno.estaLleno()) {
                logger.add(ID,galletas + " colocadas en " + horno.getID());
                horno.agregarGalletas(galletas);
                
                System.out.println("Metiendo " + galletas + " en " + horno.getID() );
                break; //Sale del for, ya no hace falta que siga iterando
            }
            else{
                logger.add(ID,horno.getID()+ " lleno, pasando al siguiente");
                
                System.out.println(horno.getID()+ " lleno, pasando al siguiente");
            }
            
        }
    }

    public void arrancarHornos() {
        for (Horno horno : arrayDeHornos) {
            horno.start();
        }
        logger.add("AdminHornos", "Todos los hornos arrancados");
    }
}
