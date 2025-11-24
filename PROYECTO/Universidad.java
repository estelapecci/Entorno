package PROYECTO;

/**
 * Clase para representar una universidad
 */
public class Universidad {
    private String nombre;
    
    public Universidad(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
}