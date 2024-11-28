package RMI;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Gugeldot
 */
public interface FabricaGalletasRemote extends Remote {
    String getAlmacenNombre() throws RemoteException;
    int getCapacidadAlmacen() throws RemoteException;
}
