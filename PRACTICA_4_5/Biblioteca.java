package PRACTICA_4_5;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private String direccion;
    private List<Sala> salas;
    private List<Libro> libros;
    private List<Persona> personas;

    public Biblioteca(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.salas = new ArrayList<>();
        this.libros = new ArrayList<>();
        this.personas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void registrarVisita(Persona persona) {
        System.out.println(persona.getNombre() + " " + persona.getApellido() + " ha entrado a la biblioteca");
    }

    public void addSala(Sala sala) {
        salas.add(sala);
        System.out.println("Sala " + sala.getNumero() + " añadida a la biblioteca");
    }

    public void addLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro '" + libro.getTitulo() + "' añadido a la biblioteca");
    }

    public void asignarResponsable(Sala sala, Persona persona) {
        sala.setResponsable(persona);
        System.out.println(persona.getNombre() + " asignado como responsable de la sala " + sala.getNumero());
    }

    public void addPersona(Persona persona) {
        personas.add(persona);
    }

    public void mostrarInformation() {
        System.out.println("BIBLIOTECA: " + nombre);
        System.out.println("Dirección: " + direccion);
        
        System.out.println("\n--- SALAS ---");
        for (Sala sala : salas) {
            sala.mostrarInformacion();
            System.out.println();
        }
        
        System.out.println("--- LIBROS ---");
        for (Libro libro : libros) {
            libro.mostrarInformacion();
            System.out.println();
        }
        
        System.out.println("--- PERSONAS REGISTRADAS ---");
        for (Persona persona : personas) {
            persona.mostrarInformacion();
            System.out.println();
        }
    }
}