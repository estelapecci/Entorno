package test.java.PROYECTO;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class TestParametrizadosPedido {

    @ParameterizedTest
    @CsvSource({
            "50, 2, 100",
            "20, 3, 60",
            "15.5, 4, 62"
    })
    void testTotalPedido(double precio, int cantidad, double esperado) {

        Cliente c = new Cliente("Ana", "a@a.com", "dir", 1, false, "España");
        Pedido p = new Pedido(c, "2026-01-01");

        ProductoFisico prod = new ProductoFisico("Test", precio, 1);

        p.agregarProducto(prod, cantidad);

        assertEquals(esperado, p.calcularTotal(), 0.001);
    }
}
