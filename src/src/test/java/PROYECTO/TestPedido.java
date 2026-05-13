package PROYECTO;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import PROYECTO.Cliente;
import PROYECTO.Pedido;
import PROYECTO.ProductoFisico;

public class TestPedido {

    @Test
    void testCalculoTotalPedido() {
        Cliente c = new Cliente("Ana", "a@a.com", "dir", 1, false, "España");
        Pedido p = new Pedido(c, "2026-01-01");
        ProductoFisico prod = new ProductoFisico("Producto", 30, 1);
        p.agregarProducto(prod, 2);
        assertEquals(60, p.calcularTotal());
    }
}