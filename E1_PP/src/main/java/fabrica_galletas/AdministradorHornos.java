package fabrica_galletas;

import misc.Logger;

public class AdministradorHornos {

    private final String ID = "adminHorno";
    private final Horno[] arrayDeHornos;
    private final Logger logger;

    public AdministradorHornos(Horno[] arrayDeHornos, Logger logger) {
        this.arrayDeHornos = arrayDeHornos;
        this.logger = logger;
    }

    // Metodo a mejorar -> Programacion estrucurada
    private boolean todosLlenos() {
        for (Horno horno : arrayDeHornos) {
            if (!horno.estaLleno()) {
                return false;
            }
        }
        return true;
    }

    public synchronized void introducirGalletas(int nGalletas) {
        System.out.println(todosLlenos());
        int galletas = nGalletas;
        boolean colocado = false;

        for (Horno horno : arrayDeHornos) {
            if (!horno.estaLleno()) {
                logger.add(ID, galletas + " colocadas en " + horno.getID());
                horno.agregarGalletas(galletas);

                System.out.println("Metiendo " + galletas + " en " + horno.getID());
                colocado = true;
                break; //Sale del for, ya no hace falta que siga iterando
            } else {
                logger.add(ID, horno.getID() + " lleno, pasando al siguiente");
                System.out.println(horno.getID() + " lleno, pasando al siguiente");
            }
        }

        if (!colocado) {

        }

    }

    public void arrancarHornos() {
        for (Horno horno : arrayDeHornos) {
            horno.start();
        }
        logger.add("AdminHornos", "Todos los hornos arrancados");
    }
}
