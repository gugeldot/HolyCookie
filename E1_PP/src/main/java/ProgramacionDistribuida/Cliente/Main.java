package ProgramacionDistribuida.Cliente;


import ProgramacionDistribuida.Cliente.INTERFAZ.MenuCliente;

public class Main {

    public static void main(String[] args) {
        
        
        MenuCliente menuCliente = new MenuCliente();
        menuCliente.setVisible(true);
        Thread thread = new Thread(menuCliente); // Pasar Principal como Runnable a un Thread
        thread.start(); // Inicia el hilo, llamando al método run
    }
}
