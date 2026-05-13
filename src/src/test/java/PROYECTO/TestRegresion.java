package PROYECTO;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import PROYECTO.Cliente;
import PROYECTO.Pedido;
import PROYECTO.ProductoFisico;

public class TestRegresion {

    @Test
    void testRegresionCalculoPedido() {
        Cliente c = new Cliente("Luis", "l@l.com", "dir", 1, false, "España");
        Pedido p = new Pedido(c, "2026-01-01");
        ProductoFisico f = new ProductoFisico("Libro", 20, 1);
        p.agregarProducto(f, 2);
        assertEquals(40, p.calcularTotal(), 0.001);
    }
}