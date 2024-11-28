package Server.Main;

import Server.fabrica_galletas.*;
import RMI.FabricaGalletasRemote;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class FabricaGalletasImpl extends UnicastRemoteObject implements FabricaGalletasRemote {

    private Repostero[] reposteros;
    private Horno[] hornos;
    private Almacen almacen;

    public FabricaGalletasImpl(Repostero[] reposteros, Horno[] hornos, Almacen almacen) throws RemoteException {
        this.hornos = hornos;
        this.reposteros = reposteros;
        this.almacen = almacen;
    }

    public int getCapacidadAlmacen() throws RemoteException {
        return almacen.getCapacidad_actual();
    }

   
}
