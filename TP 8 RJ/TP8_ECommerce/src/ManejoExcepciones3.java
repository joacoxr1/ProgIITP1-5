import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ManejoExcepciones3 {
    
    public static void main(String[] args) {
        System.out.println("--- Parte 2.3: Lectura de archivo  ---");
        String nombreArchivo = "datos.txt"; 

        try (Scanner lectorArchivo = new Scanner(new File(nombreArchivo))) { 
            
            System.out.println("Contenido del archivo " + nombreArchivo + ":");
            
            // Leer y mostrar cada linea del archivo
            while (lectorArchivo.hasNextLine()) {
                String linea = lectorArchivo.nextLine();
                System.out.println(linea);
            }
            
        } catch (FileNotFoundException e) {
            System.err.println("\n Error de archivo: FileNotFoundException capturada.");
            System.err.println("El archivo " + nombreArchivo + " no se encontro en la ruta del proyecto.");
            System.err.println("Cree el archivo en la raiz del proyecto.");
            
        }
        System.out.println("\n El sistema ha finalizado la lectura de archivo.");
    }
}