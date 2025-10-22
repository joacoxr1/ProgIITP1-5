public class PayPal implements Pago {
    @Override
    public boolean procesarPago(double monto) {

        System.out.println("[PayPal] Iniciando sesion para el pago " + monto);

        if (monto < 0) {
            System.out.println("[PayPal] Monto invalido.");
            return false;
        }
        
        System.out.println("[PayPal] Pago procesado con exito");
        return true;
    }
}