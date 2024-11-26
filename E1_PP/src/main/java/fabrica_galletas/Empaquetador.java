package fabrica_galletas;

import misc.Logger;
import misc.Utilidades;

public class Empaquetador extends Thread {
    private String id;
    private Horno hornoAsignado;
    private Almacen almacen;
    private int galletasEmpaquetadas;
    private Logger logger;
    private String estado;
    
    public Empaquetador(String id, Horno hornoAsignado, Almacen almacen, Logger logger) {
        this.id = id;
        this.hornoAsignado = hornoAsignado;
        this.almacen = almacen;
        this.galletasEmpaquetadas = 0;
        this.logger = logger;
        estado = "Iniciado";
    }

    public String getEstado() {
        return estado;
    }

    /**
     * OBJ: Recoger galletas del horno asignado y actualizarlas al contador del empaquetador.
     * PRE: El horno debe estar inicializado y asignado correctamente.
     * POST: Si hay galletas disponibles en el horno, las recoge y las suma al total del empaquetador.
     *       Si no hay galletas, espera un tiempo antes de reintentar.
     *
     * @throws InterruptedException si ocurre una interrupción durante la espera.
     */
    public void recogerGalletas() throws InterruptedException {
        int galletasRetiradas = hornoAsignado.retirarGalletas(20);
        if (galletasRetiradas > 0) {
            estado = "Recogiendo tanda";
            galletasEmpaquetadas += galletasRetiradas;
            String mensaje = id + " recogio " + galletasRetiradas + " galletas del " + hornoAsignado.getID() +
                             ". Total empaquetadas: " + galletasEmpaquetadas;
            logger.add(id, mensaje);
            Thread.sleep(Utilidades.numeroRandom(500, 1000));
        } else {
            estado = "Esperando";
            String mensaje = id + " esperando porque el horno esta vacio.";
            logger.add(id, mensaje);
            Thread.sleep(Utilidades.numeroRandom(1000, 1500));
        }
    }

    /**
     * OBJ: Transportar las galletas empaquetadas al almacén cuando se alcanzan 100 unidades.
     * PRE: El almacén debe estar inicializado y el contador de galletas empaquetadas debe ser igual o mayor a 100.
     * POST: Las galletas empaquetadas son almacenadas y el contador del empaquetador se reinicia.
     *
     * @throws InterruptedException si ocurre una interrupción durante el transporte.
     */
    public void transportarAlmacen() throws InterruptedException {
        if (galletasEmpaquetadas >= 100) {
            estado = "Transportando";
            String mensaje = id + " transporta " + galletasEmpaquetadas + " galletas al almacen.";
            logger.add(id, mensaje);
            Thread.sleep(Utilidades.numeroRandom(2000, 4000));
            almacen.almacenar(galletasEmpaquetadas, id);
            galletasEmpaquetadas = 0;
        }
    }

    /**
     * OBJ: Ciclo principal del empaquetador que recoge galletas y las transporta al almacén.
     * PRE: Debe haberse inicializado correctamente el horno, el almacén y el logger.
     * POST: La operación se realiza indefinidamente hasta que el hilo sea interrumpido.
     */
    @Override
    public void run() {
        try {
            while (true) {
                recogerGalletas();
                transportarAlmacen();
            }
        } catch (InterruptedException e) {
            String mensaje = id + " fue interrumpido.";
            logger.addE(id, mensaje);
        }
    }
}
