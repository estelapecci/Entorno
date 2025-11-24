package PROYECTO;
import java.util.Date;
import java.util.Date;

/**
 * Clase base para Persona con datos básicos
 */
public class Persona {
    private String dni;
    private String nombre;
    private Date fechaNacimiento;
    
    // Constructor
    public Persona(String dni, String nombre, Date fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    // Método para calcular edad
    public int getEdad() {
        // Por implementar
        return 0;
    }
    
    // Getters y setters
    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }
    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public Date getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(Date fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }
}