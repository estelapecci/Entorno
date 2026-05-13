package PROYECTO;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private int idPedido;
    private Cliente cliente;
    private List<Producto> productos;
    private List<Integer> cantidades;
    private String fecha;

    private static int contadorIds = 1;

    public Pedido(Cliente cliente, String fecha) {
        this.idPedido = contadorIds++;
        this.cliente = cliente;
        this.fecha = fecha;
        this.productos = new ArrayList<>();
        this.cantidades = new ArrayList<>();
    }

    public void agregarProducto(Producto producto, int cantidad) {
        if (cantidad <= 0) throw new IllegalArgumentException("Cantidad inválida");
        productos.add(producto);
        cantidades.add(cantidad);
    }

    public double calcularTotal() {
        if (productos.isEmpty()) {
            throw new IllegalStateException("Un pedido vacío no puede procesarse");
        }

        double total = 0;

        for (int i = 0; i < productos.size(); i++) {
            Producto p = productos.get(i);
            int cant = cantidades.get(i);
            total += p.calcularPrecioFinal(cliente.getPais()) * cant;
        }

        return total;
    }

    public Cliente getCliente() { return cliente; }

    @Override
    public String toString() {
        return "Pedido{id=" + idPedido + ", cliente=" + cliente.getId() +
                ", fecha='" + fecha + "', total=" + calcularTotal() + "}";
    }
}
