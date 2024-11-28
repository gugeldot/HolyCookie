package Server.Main;
        
import Server.fabrica_galletas.Almacen;
import RMI.FabricaGalletasRemote;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class FabricaGalletasImpl extends UnicastRemoteObject implements FabricaGalletasRemote {

    private Almacen almacen;

    public FabricaGalletasImpl(Almacen almacen) throws RemoteException {
        this.almacen = almacen;
    }

    public String getAlmacenNombre() throws RemoteException {
        return almacen.getID();
    }

    public int getCapacidadAlmacen() throws RemoteException {
        return almacen.getCapacidad_actual();
    }

    // Implementa otros métodos según sea necesario
}
