import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {
    
    private final List<Producto> productos; 
    private Cliente cliente;

    public Pedido() {
        this.productos = new ArrayList<>(); 
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }
    
    @Override
    public double calcularTotal() {
        double total = 0.0;
        
        for (Producto p : productos) {
            total += p.calcularTotal(); 
        }
        
        return total;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void cambiarEstadoYNotificar(String nuevoEstado) {
        System.out.println("--- El estado del pedido ha cambiado a: " + nuevoEstado + " ---");

        if (this.cliente != null) {
 
            this.cliente.notificar("Estado actualizado: " + nuevoEstado);
        } else {
            System.out.println("No se pudo notificar: Cliente no asignado al pedido.");
        }
    }
}