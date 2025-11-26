package PROYECTO;

/**
 * Clase para representar a un cliente
 */
public class Cliente {
    private String nombre;
    private String correo;
    private String direccion;
    
    // Constructor
    public Cliente(String nombre, String correo, String direccion) {
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getCorreo() {
        return correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    // Método toString
    @Override
    public String toString() {
        return "Cliente: " + nombre + " - Email: " + correo + " - Dirección: " + direccion;
    }
}