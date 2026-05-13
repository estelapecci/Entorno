package PROYECTO;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import PROYECTO.Cliente;
import PROYECTO.Pedido;
import PROYECTO.ProductoDigital;

public class TestExcepciones {

    @Test
    void precioNegativoLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> {
            new ProductoDigital("Soft", -5, 100, "Lic", "GENERAL");
        });
    }

    @Test
    void pedidoVacioLanzaExcepcion() {
        Cliente c = new Cliente("Ana", "a@a.com", "dir", 1, false, "España");
        Pedido p = new Pedido(c, "2026-01-01");
        assertThrows(IllegalStateException.class, p::calcularTotal);
    }
}
