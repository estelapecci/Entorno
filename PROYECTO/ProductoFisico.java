package PROYECTO;

// Subclase ProductoFisico
public class ProductoFisico extends Producto {
    private double peso; // en kg
    private double dimensiones; // en cm³
    private static final double COSTE_ENVIO_BASE = 5.0;
    private static final double IVA = 0.21;

    public ProductoFisico(String nombre, String descripcion, double precio, 
                         String codigo, double peso, double dimensiones) {
        super(nombre, descripcion, precio, codigo);
        this.peso = peso;
        this.dimensiones = dimensiones;
    }

    @Override
    public double calcularPrecioFinal() {
        double costeEnvio = calcularCosteEnvio();
        double precioConIVA = precio * (1 + IVA);
        return precioConIVA + costeEnvio;
    }

    private double calcularCosteEnvio() {
        return COSTE_ENVIO_BASE + (peso * 0.5) + (dimensiones * 0.01);
    }

    @Override
    public String getTipoProducto() {
        return "Producto Físico";
    }

    // Getters específicos
    public double getPeso() { return peso; }
    public double getDimensiones() { return dimensiones; }
    public double getCosteEnvio() { return calcularCosteEnvio(); }

    @Override
    public String toString() {
        return String.format("%s [Físico] - %s - $%.2f (Envío: $%.2f)", 
                           codigo, nombre, precio, calcularCosteEnvio());
    }
}