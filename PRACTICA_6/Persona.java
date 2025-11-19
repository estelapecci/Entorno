package PRACTICA_6;

import java.util.Date;

public class Persona {
    private String dni;
    private String nombre;
    private Date fechaNacimiento;
    private Direccion direccion;

    public Persona() {}

    public Persona(String dni, String nombre, Date fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        // Lógica para calcular la edad
        return 0;
    }

    // Getters y setters
    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public Date getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(Date fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }
    public Direccion getDireccion() { return direccion; }
    public void setDireccion(Direccion direccion) { this.direccion = direccion; }
}