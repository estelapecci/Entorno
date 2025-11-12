package PRACTICA_4_5;

import java.util.ArrayList;
import java.util.List;

public class SalaLectura extends Sala {
    private List<Libro> libros;

    public SalaLectura(int numero, int aforoMaximo) {
        super(numero, aforoMaximo, "Lectura");
        this.libros = new ArrayList<>();
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Libros en sala: " + libros.size());
        for (Libro libro : libros) {
            System.out.println("  - " + libro.getTitulo());
        }
    }
}