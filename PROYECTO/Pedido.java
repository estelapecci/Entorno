package PROYECTO;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase para gestionar pedidos de clientes
 * Relación con Cliente (asociación) y con Producto (agregación)
 */
public class Pedido {
    private Cliente cliente;
    private List<Producto> productos;
    private String fecha;
    
    // Constructor
    public Pedido(Cliente cliente, String fecha) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.productos = new ArrayList<>();
    }
    
    // Método para agregar producto al pedido
    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado: " + producto.getNombre());
    }
    
    // Método para calcular el total del pedido
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularPrecioFinal();
        }
        return total;
    }
    
    // Método para mostrar resumen del pedido
    public void mostrarResumen() {
        System.out.println("\n=== RESUMEN DEL PEDIDO ===");
        System.out.println("Fecha: " + fecha);
        System.out.println(cliente.toString());
        System.out.println("\nProductos en el pedido:");
        
        for (int i = 0; i < productos.size(); i++) {
            System.out.println((i + 1) + ". " + productos.get(i).toString());
        }
        
        System.out.println("\nTOTAL DEL PEDIDO: " + calcularTotal() + "€");
        System.out.println("==========================\n");
    }
    
    // Getters y Setters
    public Cliente getCliente() {
        return cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public List<Producto> getProductos() {
        return productos;
    }
    
    public String getFecha() {
        return fecha;
    }
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}