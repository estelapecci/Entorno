package PROYECTO;

/**
 * Clase abstracta Producto - clase padre para todos los productos
 */
public abstract class Producto {
    // Atributos protegidos (accesibles por las subclases)
    protected String nombre;
    protected double precio;
    
    // Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    // Método abstracto que deben implementar las subclases
    public abstract double calcularPrecioFinal();
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    // Método toString para mostrar información
    @Override
    public String toString() {
        return nombre + " - Precio base: " + precio + "€";
    }
}