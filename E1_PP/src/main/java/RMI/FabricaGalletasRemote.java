package RMI;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Interfaz compartida entre Cliente y Servidor 
 * (Por eso está en un paquete separado del resto)
 */
public interface FabricaGalletasRemote extends Remote {
    
    
    // Funciones de repostero 
    //NOTA: Trabaja sobre array reposteros, de ahi el indice
    int getGalletasGeneradas(int indiceRepostero) throws RemoteException;
    int getGalletasDesperdiciadas(int indiceRepostero)throws RemoteException;
    void parar(int indiceRepostero) throws RemoteException;
    void reanudar(int indiceRepostero) throws RemoteException;
    
    // Funciones de hornos
    //NOTA: Trabaja sobre array hornos, de ahi el indice
    int getGalletasHorneadas(int indiceHornos) throws RemoteException;
    boolean isHorneado(int indiceHornos) throws RemoteException;
    boolean isHorneando(int indiceHornos) throws RemoteException;
    
    // Funciones de almacen
    int getCapacidadAlmacen() throws RemoteException;
    int getGalletasConsumidas() throws RemoteException;
    
}
