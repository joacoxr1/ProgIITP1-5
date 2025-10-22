import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ManejoExcepciones5 {
    
    public static void main(String[] args) {
        System.out.println("--- Parte 2.5: Uso de try-with-resources ---");
        
        String nombreArchivo = "documento.txt";
        String linea;

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            
            System.out.println("Leyendo archivo con BufferedReader:");
            
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            
        } catch (IOException e) {
            System.err.println("\n Error ENTRADA/SALIDA: IOException capturada.");
            System.err.println("Ocurrio un error al intentar leer el archivo " + nombreArchivo);
            System.err.println("Mensaje: " + e.getMessage());
        }
        
        System.out.println("\n El sitema ha finalizado el uso de try-with-resources.");
    }
}