package ClienteRMI.Main;

import java.rmi.Naming;
import ClienteRMI.GUI.MenuCliente;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import RMI.FabricaGalletasRemote;

public class Main {

    public static void main(String[] args) throws NotBoundException, MalformedURLException, RemoteException {

        FabricaGalletasRemote fabrica = (FabricaGalletasRemote) Naming.lookup("//localhost/fabrica");
        
        MenuCliente menuCliente = new MenuCliente(fabrica);
        menuCliente.setVisible(true);
        Thread thread = new Thread(menuCliente); // Pasar Principal como Runnable a un Thread
        thread.start(); // Inicia el hilo, llamando al método run
    }
}
