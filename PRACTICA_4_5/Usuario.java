package PRACTICA_4_5;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends Persona {
    private String numSocio;
    private List<Libro> librosPrestados;

    public Usuario(String nombre, String apellido, String dni, int edad, String email, String telefono, String numSocio) {
        super(nombre, apellido, dni, edad, email, telefono);
        this.numSocio = numSocio;
        this.librosPrestados = new ArrayList<>();
    }

    public String getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(String numSocio) {
        this.numSocio = numSocio;
    }

    public List<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void prestarLibro(Libro libro) {
        librosPrestados.add(libro);
        System.out.println("Libro '" + libro.getTitulo() + "' prestado a " + getNombre());
    }

    public void devolverLibro(Libro libro) {
        librosPrestados.remove(libro);
        System.out.println("Libro '" + libro.getTitulo() + "' devuelto por " + getNombre());
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de socio: " + numSocio);
        System.out.println("Libros prestados: " + librosPrestados.size());
        for (Libro libro : librosPrestados) {
            System.out.println("  - " + libro.getTitulo());
        }
    }
}