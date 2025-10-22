public class MainApp {

    public static void main(String[] args) {
        System.out.println("=============== Ecomerce Part 1 Rodriguez J ==================");

        Producto libro = new Producto("Libro de Java", 50.0);
        Producto teclado = new Producto("Teclado Mecanico", 75.0);
        
        Pedido pedido = new Pedido();
        pedido.agregarProducto(libro);
        pedido.agregarProducto(teclado);
        
        double subTotal = pedido.calcularTotal();
        System.out.println("1. Subtotal del Pedido: $" + subTotal); 
        System.out.println("-------------------------------------------------");


        System.out.println("2.a Procesando con Tarjeta de Credito (10% desc.):");
        TarjetaCredito tarjeta = new TarjetaCredito(10.0); 
        double montoFinalTC = tarjeta.aplicarDescuento(subTotal); 
        tarjeta.procesarPago(montoFinalTC); 
        System.out.println("-------------------------------------------------");

        System.out.println("2.b Procesando con PayPal (Monto sin descuento):");
        PayPal paypal = new PayPal();
        paypal.procesarPago(subTotal); 
        System.out.println("-------------------------------------------------");

        Cliente cliente = new Cliente("Sofia Gomez");
        pedido.setCliente(cliente); 
        
        System.out.println("3. Simulacion de Notificaciones:");
        pedido.cambiarEstadoYNotificar("Recibido y en Revision");
        pedido.cambiarEstadoYNotificar("Enviado al Domicilio");
        System.out.println("=================================================");
    }
}