package test.java.PROYECTO;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import PROYECTO.ProductoDigital;
public class TestProductoDigital {
    @Test
    void testIVA_General() {
        ProductoDigital d = new ProductoDigital("Soft", 100, 200, "Licencia", "GENERAL");
        assertEquals(121, d.calcularPrecioFinal("España"), 0.001);
    }
    @Test
    void testIVA_Reducido() {
        ProductoDigital d = new ProductoDigital("Soft", 100, 200, "Licencia", "REDUCIDO");
        assertEquals(110, d.calcularPrecioFinal("España"), 0.001);
    }
}