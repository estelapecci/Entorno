package PROYECTO;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== SISTEMA DE GESTIÓN DE PEDIDOS — VERSIÓN FINAL ===");

        // 1. Crear cliente
        Cliente cliente = new Cliente(
                "Ana García",
                "ana@mail.com",
                "Calle Mayor 123",
                6,              // años de antigüedad
                true,           // es VIP
                "España"        // país
        );

        // 2. Crear productos
        ProductoDigital antivirus = new ProductoDigital(
                "Antivirus Pro",
                49.99,
                500,
                "Licencia 1 año",
                "GENERAL"
        );

        ProductoFisico teclado = new ProductoFisico(
                "Teclado Mecánico",
                45.99,
                1.2
        );

        ProductoFisico raton = new ProductoFisico(
                "Ratón Inalámbrico",
                25.50,
                0.5
        );

        // 3. Crear pedido
        Pedido pedido = new Pedido(cliente, "2026-03-15");

        pedido.agregarProducto(antivirus, 1);
        pedido.agregarProducto(teclado, 2);
        pedido.agregarProducto(raton, 1);

        // 4. Crear tienda y procesar venta
        Tienda tienda = new Tienda();
        Factura factura = tienda.realizarVenta(cliente, pedido);

        // 5. Mostrar factura
        System.out.println(factura);

        System.out.println("\n=== SISTEMA FINALIZADO ===");
    }
}
