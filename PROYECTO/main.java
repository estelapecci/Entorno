package PROYECTO;

public class Main {
    public static void main(String[] args) {
        
        System.out.println(" SISTEMA DE GESTIÓN DE PEDIDOS ");
        
        // Crear clientes
        Cliente cliente1 = new Cliente("Ana Garcia", "ana.garcia@email.com", "Calle Mayor 123, Cadiz");
        Cliente cliente2 = new Cliente("Carlos Lopez", "carlos.lopez@email.com", "Avenida del Mar 45, Cadiz");
        
        System.out.println("Clientes creados correctamente");
        
        // Crear productos físicos
        ProductoFisico teclado = new ProductoFisico("Teclado Mecánico", 45.99, 4.99);
        ProductoFisico monitor = new ProductoFisico("Monitor 24 pulgadas", 189.99, 12.50);
        ProductoFisico raton = new ProductoFisico("Ratón Inalámbrico", 25.50, 3.99);
        
        // Crear productos digitales
        ProductoDigital software = new ProductoDigital("Software Antivirus", 49.99, 250, "Licencia anual");
        ProductoDigital ebook = new ProductoDigital("eBook Programación Java", 19.99, 15, "Licencia perpetua");
        ProductoDigital curso = new ProductoDigital("Curso Online Python", 89.99, 0, "Acceso 1 año");
        
        System.out.println("Productos creados correctamente");
        
        // Crear pedidos
        Pedido pedido1 = new Pedido(cliente1, "2025-01-15");
        Pedido pedido2 = new Pedido(cliente2, "2025-01-16");
        
        // Agregar productos al pedido 1 (mezcla física y digital)
        System.out.println("\n PROCESANDO PEDIDO 1 ");
        pedido1.agregarProducto(teclado);
        pedido1.agregarProducto(software);
        pedido1.agregarProducto(ebook);
        
        // Agregar productos al pedido 2 (solo productos físicos)
        System.out.println("\nPROCESANDO PEDIDO 2");
        pedido2.agregarProducto(monitor);
        pedido2.agregarProducto(raton);
        pedido2.agregarProducto(curso);
        
        // Mostrar resúmenes de los pedidos
        pedido1.mostrarResumen();
        pedido2.mostrarResumen();
        
        // Mostrar información adicional
        System.out.println(" INFORMACIÓN ADICIONAL ");
        System.out.println("Total pedido 1: " + pedido1.calcularTotal() + "€");
        System.out.println("Total pedido 2: " + pedido2.calcularTotal() + "€");
        System.out.println("Número de productos en pedido 1: " + pedido1.getProductos().size());
        System.out.println("Número de productos en pedido 2: " + pedido2.getProductos().size());
        
        System.out.println("\n=== SISTEMA FINALIZADO ===");
    }
}