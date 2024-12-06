package Server.misc;

/*
*   Objetivo: Clase especifica para poder annadir eventos al log de ejecución
    Notas: 
        + Opcion habilitada para que a cada arranque se resetee el log
            + Seleccionable que lo haga o no en instanciación
        + Pasar como parametro en la instancia de cualquier clase el logger 
        instanciado en Main.
    USO GENERAL: logger.add("ADMIN", "Esto es una "); 
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    private String path;

    public Logger(String path, boolean reset) {
        this.path = path;

        // Borrar el antiguo log segun usuario decida
        if (reset) {
            borrar();
        }

        // Checkea si el archivo existe para crear el banner
        checkExist();
    }

    private void borrar() {
        /*
            OBJ: Procedimineto privado que borra el archivo si existe
            PRE: -
            POST: Archivo borrado
         */

        File archivo = new File(this.path);
        if (archivo.exists()) {
            if (!archivo.delete()) { // Error si se bloquea el borrado
                System.err.println("Error al eliminar el archivo.");
            }
        }
    }

    private void checkExist() {
        /*
            OBJ: Procedimiento privado que si el archivo existe introduce en el
                    un banner de fecha de creación del mismo
            PRE: - 
            POST: Archivo creado con banner nuevo 
         */

        File archivo = new File(this.path);
        try {
            if (archivo.createNewFile()) { // Devuelve true si  existe y entra en if
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                write("========== ARCHIVO LOG CREADO [" + LocalDateTime.now().format(formato) + "] ==========");
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    private void write(String msg) {
        /*
            OBJ: Metodo privado exclusivamente dedicado a cargar el archivo y 
                    volcar los datos en él
            PRE: Archivo existe
            POST: Datos escritos
         */

        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(this.path, true))) {
            escritor.write(msg);
            escritor.newLine();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
    
    
    public void add(String author, String msg) {
        /*
            OBJ: Metodo publico para que cualquiera pueda introducir linea nueva
                    al log. 
                    Nota: Se introduce la fecha de creacion)
            PRE: Introducir Autor y el propio mensaje
            POST:  Datos escritos
         */

        String cadena;
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String date = LocalDateTime.now().format(formato);

        cadena = "[" + author + "] [" + date + "]: " + msg;

        write(cadena);
    }

    // Sobrecarga de metodo para aceptar dos autores
    public void add(String author, String author2, String msg) {
        /*
            OBJ: Metodo publico para que cualquiera pueda introducir linea nueva
                    al log. 
                    Nota: Se introduce la fecha de creacion)
            PRE: Introducir Autor (2) y el propio mensaje
            POST:  Datos escritos
         */

        String cadena;
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String date = LocalDateTime.now().format(formato);

        cadena = "[" + author + "] [" + author2 + "] [" + date + "]: " + msg;

        write(cadena);
    }
    
    // Pseudo-sobrecarga de metodo, es un add pero con el código de error
    // Para buscar más facilmente en el log errores.
    public void addE(String author,String msg){
        add(author,"[[ERROR]]--"+ msg + "--[[ERROR]]");
    }
}
