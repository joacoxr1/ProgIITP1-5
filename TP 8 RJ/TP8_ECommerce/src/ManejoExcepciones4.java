import java.util.Scanner;

public class ManejoExcepciones4 {

    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0) {
            throw new EdadInvalidaException("La edad no puede ser negativa: " + edad);
        }
        if (edad > 120) {
            throw new EdadInvalidaException("La edad no puede ser mayor a 120: " + edad);
        }
        System.out.println("Edad validada con exito: " + edad);
    }

    public static void main(String[] args) {
        System.out.println("--- Parte 2.4: Excepcion personalizada   ---");

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese una edad para validar: ");
            int edadIngresada = scanner.nextInt();
            validarEdad(edadIngresada);

        } catch (EdadInvalidaException e) {
            System.err.println("\n Error de validacion: Excepcion personalizada capturada.");
            System.err.println("Mensaje: " + e.getMessage());

        } catch (Exception e) {
            System.err.println("\n Ocurrio un error inesperado.");
        }

        System.out.println("\n El sistema de validacion ha finalizado.");
    }
}