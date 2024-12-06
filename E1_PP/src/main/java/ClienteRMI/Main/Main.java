package ClienteRMI.Main;

/*
*   Objetivo: Clase principal del cliente encargada de recibir el objeto 
              remoto y de iniciar la interfaz con él
 */

import ClienteRMI.GUI.MenuCliente;
import RMI.FabricaGalletasRemote;

import java.rmi.Naming;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Main {

    public static void main(String[] args) throws NotBoundException, MalformedURLException, RemoteException {
        
        // Objeto remoto
        FabricaGalletasRemote fabrica = (FabricaGalletasRemote) Naming.lookup("//localhost/fabrica");
        
        // Instancia de una interfaz
        MenuCliente menuCliente = new MenuCliente(fabrica);
        menuCliente.setVisible(true);
        Thread thread = new Thread(menuCliente); 
        thread.start(); 
    }
}
