package PROYECTO;
/**
 * Clase para productos digitales (hereda de Producto)
 * No tiene coste de envío pero tiene IVA
 */
public class ProductoDigital extends Producto {
    private double tamanoDescarga; // en MB
    private String licencia;
    
    // Constructor
    public ProductoDigital(String nombre, double precio, double tamanoDescarga, String licencia) {
        super(nombre, precio);
        this.tamanoDescarga = tamanoDescarga;
        this.licencia = licencia;
    }
    
    // Implementación del método abstracto
    @Override
    public double calcularPrecioFinal() {
        // Productos digitales tienen IVA del 21%
        double iva = precio * 0.21;
        return precio + iva;
    }
    
    // Getters y Setters específicos
    public double getTamanoDescarga() {
        return tamanoDescarga;
    }
    
    public void setTamanoDescarga(double tamanoDescarga) {
        this.tamanoDescarga = tamanoDescarga;
    }
    
    public String getLicencia() {
        return licencia;
    }
    
    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }
    
    // Método toString mejorado
    @Override
    public String toString() {
        return super.toString() + " - Tamaño: " + tamanoDescarga + "MB - Licencia: " + licencia + " - Total con IVA: " + calcularPrecioFinal() + "€";
    }
}