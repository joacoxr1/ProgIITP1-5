public class MainPart2 {

    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("--- Prueba  Parte 2 Rodriguez J ---");
        System.out.println("=================================================");

  
        System.out.println("\n --- (2.1) ---");
        try {
            int numerador = 10;
            int divisor = 0; 
            int resultado = numerador / divisor;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.err.println(" ArithmeticException.");
        }


        System.out.println("\n ---  (2.2) ---");
        try {
            String cadena = "error";
            int numero = Integer.parseInt(cadena);
            System.out.println("Numero: " + numero);
        } catch (NumberFormatException e) {
            System.err.println("NumberFormatException.");
        }

        System.out.println("\n ---  (2.3 - 2.5) ---");
        try {
     
            java.io.File archivo = new java.io.File("archivo_inexistente.txt");
            try (java.util.Scanner scanner = new java.util.Scanner(archivo)) {
                scanner.nextLine();
            }
        } catch (java.io.IOException e) { 
            System.err.println("IOException manejada.");
        }

        System.out.println("\n--- (2.4) ---");
        try {
            ManejoExcepciones4.validarEdad(150); 
        } catch (EdadInvalidaException e) {
            System.err.println("Excepcion personalizada capturada. Mensaje: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error  en validacion de edad.");
        }

        System.out.println("\n =================================================");
        System.out.println("Pruebas Finalizadas.");
    }
}