
package test;

import java.io.IOException;
import static manejoarchivos.ManejoArchivos.crearArchivo;
import static manejoarchivos.ManejoArchivos.*;

public class Test {
    
    public static void main(String[] args) throws IOException{
        var nombreArchivo = "MiArchivo.txt";
        
        //crearArchivo(nombreArchivo);
        //escribirArchivo(nombreArchivo, "Este es el contenido de mi archivo.");
        //agregarArchivo(nombreArchivo, "Más información");
        leerArchivo(nombreArchivo);
    }
}
