
package manejoarchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ManejoArchivos {
    
    public static void crearArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo); //Crear objeto file
        
        try{
            PrintWriter salida = new PrintWriter(archivo);//Para que se guarde en el disco duro
            salida.close(); //Aquí ya se ha creado el archivo
            System.out.println("Se ha creado el archivo");
        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
    }
    
    public static void escribirArchivo(String nombreArchivo, String contenido){
        File archivo = new File(nombreArchivo);
        try{
            PrintWriter salida = new PrintWriter (archivo); //Abrir objeto pw
            salida.println(contenido);//escribir en el archivo
            salida.close();//cerrar despues de escribir
            System.out.println("Se ha escrito en el archivo");
        }catch (FileNotFoundException ex){
            ex.printStackTrace(System.out);
        }
    }
    
    public static void agregarArchivo(String nombreArchivo, String contenido) throws IOException{
        File archivo = new File(nombreArchivo);
        try{
             //Abrir objeto pw+si se hace un append de la info
             PrintWriter salida = new PrintWriter (new FileWriter(archivo, true));
             
             salida.println(contenido);
             salida.close();
             System.out.println("Se ha agregado el contenido nuevo.");
        }catch (FileNotFoundException e){
                e.printStackTrace(System.out);
        }
    }
    
     public static void leerArchivo(String nombreArchivo){
         var archivo = new File(nombreArchivo);
         try{
             //BufferReader nos permite leer lineas completas de nuestro archivo
             //FileReader no usa líneas completas
             var entrada = new BufferedReader(new FileReader(archivo));
             var lectura = entrada.readLine();
             //Recorrer todo el archivo leyendo linea por linea y lo imprimimos
             while(lectura != null){
                 System.out.println("Lectura: "+lectura);
                 lectura = entrada.readLine();
             }
             entrada.close();
         }catch (FileNotFoundException e){
             e.printStackTrace(System.out);
         }catch (IOException e){
             e.printStackTrace(System.out);
         }
     }
    
}
