package PRACTICA_6;
import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Departamento> departamentos;

    public Universidad() {
        this.departamentos = new ArrayList<>();
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public List<Departamento> getDepartamentos() { return departamentos; }
}