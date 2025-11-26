package PROYECTO;
/**
 * Clase para productos físicos (hereda de Producto)
 * Tiene coste de envío adicional
 */
public class ProductoFisico extends Producto {
    private double costeEnvio;
    
    // Constructor
    public ProductoFisico(String nombre, double precio, double costeEnvio) {
        super(nombre, precio); // Llama al constructor de Producto
        this.costeEnvio = costeEnvio;
    }
    
    // Implementación del método abstracto
    @Override
    public double calcularPrecioFinal() {
        // Precio base + coste de envío
        return precio + costeEnvio;
    }
    
    // Getter y Setter específico
    public double getCosteEnvio() {
        return costeEnvio;
    }
    
    public void setCosteEnvio(double costeEnvio) {
        this.costeEnvio = costeEnvio;
    }
    
    // Método toString mejorado
    @Override
    public String toString() {
        return super.toString() + " - Coste envío: " + costeEnvio + "€ - Total: " + calcularPrecioFinal() + "€";
    }
}
