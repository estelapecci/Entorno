package test.java.PROYECTO;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestCliente {

    @Test
    void testCreacionCliente() {
        Cliente c = new Cliente("Ana", "ana@mail.com", "dir", 5, true, "España");
        assertTrue(c.getEsVip());
        assertEquals("España", c.getPais());
    }
}
