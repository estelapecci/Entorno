package PRACTICA_4_5;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Central", "Plaza Mayor 1");
        
        LibroFisico libro1 = new LibroFisico("Cien años de soledad", "Gabriel García Márquez", "978-8437604947", 1967, "Sudamericana", 471, "Estantería A1");
        LibroDigital libro2 = new LibroDigital("1984", "George Orwell", "978-8499890944", 1949, "Debolsillo", "PDF", 2.5);
        LibroFisico libro3 = new LibroFisico("El Quijote", "Miguel de Cervantes", "978-8424114966", 1605, "Alfaguara", 863, "Estantería B2");
        
        SalaLectura sala1 = new SalaLectura(1, 20);
        SalaEstudio sala2 = new SalaEstudio(2, 30, 15);
        SalaInformatica sala3 = new SalaInformatica(3, 15, 10);
        
        Usuario usuario1 = new Usuario("Juan", "Pérez", "12345678A", 25, "juan@email.com", "600111222", "SOC001");
        Usuario usuario2 = new Usuario("María", "Gómez", "87654321B", 30, "maria@email.com", "600333444", "SOC002");
        Empleado empleado1 = new Empleado("Carlos", "López", "11223344C", 35, "carlos@biblioteca.com", "600555666", "Bibliotecario", 25000);
        
        biblioteca.addSala(sala1);
        biblioteca.addSala(sala2);
        biblioteca.addSala(sala3);
        
        biblioteca.addLibro(libro1);
        biblioteca.addLibro(libro2);
        biblioteca.addLibro(libro3);
        
        biblioteca.addPersona(usuario1);
        biblioteca.addPersona(usuario2);
        biblioteca.addPersona(empleado1);
        
        biblioteca.asignarResponsable(sala1, empleado1);
        
        sala1.agregarLibro(libro1);
        sala1.agregarLibro(libro3);
        
        usuario1.prestarLibro(libro2);
        
        biblioteca.registrarVisita(usuario1);
        biblioteca.registrarVisita(usuario2);
        
        sala1.entrarPersona();
        sala1.entrarPersona();
        sala2.entrarPersona();
        
        System.out.println("INFORMACIÓN COMPLETA DE LA BIBLIOTECA");
        System.out.println("=====================================");
        biblioteca.mostrarInformation();
        
        System.out.println("\nINFORMACIÓN ESPECÍFICA DE USUARIOS");
        System.out.println("===================================");
        usuario1.mostrarInformacion();
        System.out.println();
        usuario2.mostrarInformacion();
        System.out.println();
        empleado1.mostrarInformacion();
    }
}