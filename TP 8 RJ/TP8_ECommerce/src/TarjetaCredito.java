public class TarjetaCredito implements PagoConDescuento {
    
    private final double descuentoPorcentaje;

    public TarjetaCredito(double descuentoPorcentaje) {
        this.descuentoPorcentaje = descuentoPorcentaje;
    }


    @Override
    public double aplicarDescuento(double monto) {
        double descuento = monto * (descuentoPorcentaje / 100);
        double montoFinal = monto - descuento;
        System.out.println("[Tarjeta] Aplicando descuento de " + descuentoPorcentaje + "%. Total con desc.: " + montoFinal);
        return montoFinal;
    }

    @Override
    public boolean procesarPago(double monto) {
        System.out.println("[Tarjeta] Procesando pago por " + monto);
        System.out.println("[Tarjeta] pago exitoso");
        return true;
    }
}