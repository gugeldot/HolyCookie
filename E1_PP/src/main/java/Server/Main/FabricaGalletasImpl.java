package Server.Main;

import Server.fabrica_galletas.*;
import RMI.FabricaGalletasRemote;
import java.awt.Color;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import javax.swing.JProgressBar;

public class FabricaGalletasImpl extends UnicastRemoteObject implements FabricaGalletasRemote {

    private Repostero[] reposteros;
    private Horno[] hornos;
    private Almacen almacen;

    public FabricaGalletasImpl(Repostero[] reposteros, Horno[] hornos, Almacen almacen) throws RemoteException {
        this.hornos = hornos;
        this.reposteros = reposteros;
        this.almacen = almacen;
    }

    // Reposteros 
    public int getGalletasGeneradas(int indiceRepostero) throws RemoteException {
        return 0;
    }

    public int getGalletasDesperdiciadas(int indiceRepostero) throws RemoteException {
        return 0;
    }

    public void parar(int indiceRepostero) throws RemoteException {
        // A implementar
    }

    public void reanudar(int indiceRepostero) throws RemoteException {
        // A implementar
    }

    // Hornos
    public boolean isHorneando(int indiceHornos) throws RemoteException {
        return hornos[indiceHornos].isHorneando();
    }

    public boolean isHorneado(int indiceHornos) throws RemoteException {
        return hornos[indiceHornos].isHorneadas();
    }

    public int getGalletasHorneadas(int indiceHornos) throws RemoteException {
        return hornos[indiceHornos].getHistoricoGalletas();
    }

    // Almacen
    public int getCapacidadAlmacen() throws RemoteException {
        return almacen.getCapacidad_actual();
    }

    public int getGalletasConsumidas() throws RemoteException {
        return 0;
    }

}
