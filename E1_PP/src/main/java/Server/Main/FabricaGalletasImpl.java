package Server.Main;

/**************************************************************************************
* IMPLEMENTACION DE INTERFAZ RMI (para pasar todos los objs y poner metodos)
**************************************************************************************/

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

    // Reposteros ==============================================================
    public int getGalletasGeneradas(int indiceRepostero) throws RemoteException {
        return reposteros[indiceRepostero].getGalletasProducidas();
    }

    public int getGalletasDesperdiciadas(int indiceRepostero) throws RemoteException {
        return reposteros[indiceRepostero].getGalletasDesperdiciadas();
    }

    public void parar(int indiceRepostero) throws RemoteException {
        reposteros[indiceRepostero].parar();
    }

    public void reanudar(int indiceRepostero) throws RemoteException {
        reposteros[indiceRepostero].reanudar();
    }

    // Hornos ==============================================================
    public boolean isHorneando(int indiceHornos) throws RemoteException {
        return hornos[indiceHornos].isHorneando();
    }

    public boolean isHorneado(int indiceHornos) throws RemoteException {
        return hornos[indiceHornos].isHorneadas();
    }

    public int getGalletasHorneadas(int indiceHornos) throws RemoteException {
        return hornos[indiceHornos].getHistoricoGalletas();
    }

    // Almacen ==============================================================
    public int getCapacidadAlmacen() throws RemoteException {
        return almacen.getCapacidad_actual();
    }

    public int getGalletasConsumidas() throws RemoteException {
        return almacen.getConsumidas();
    }

}
