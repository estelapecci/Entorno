package test.java.PROYECTO;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestProductoFisico {

    @Test
    void testEnvioEspana() {
        ProductoFisico p = new ProductoFisico("Teclado", 50, 1.0);
        assertEquals(50, p.calcularPrecioFinal("España"));
    }

    @Test
    void testEnvioEuropa() {
        ProductoFisico p = new ProductoFisico("Teclado", 50, 1.0);
        assertEquals(55, p.calcularPrecioFinal("Italia"));
    }
}
