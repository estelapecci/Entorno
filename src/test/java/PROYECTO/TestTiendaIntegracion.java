package test.java.PROYECTO;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestTiendaIntegracion {

    @Test
    void integracionGeneraFacturaCorrecta() {

        Cliente c = new Cliente("Ana", "a@a.com", "dir", 6, true, "España");

        ProductoDigital dig = new ProductoDigital("Soft", 100, 500, "Lic1", "GENERAL");
        ProductoFisico fis = new ProductoFisico("Teclado", 50, 1);

        Pedido p = new Pedido(c, "2026-01-01");
        p.agregarProducto(dig, 1);
        p.agregarProducto(fis, 1);

        Tienda t = new Tienda();
        Factura f = t.realizarVenta(c, p);

        assertNotNull(f.getCodigoFactura());
        assertTrue(f.getTotalFinal() > 0);
    }
}
