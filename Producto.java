// Clase general Producto
public abstract class Producto {
    private String nombre;
    private String descripcion;
    private double precio;
    private String codigo;

    public Producto(String nombre, String descripcion, double precio, String codigo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.codigo = codigo;
    }

    // Metodos abstractos, implementados por las subclases
    public abstract double calcularPrecioFinal();
    public abstract String getTipoProducto();

    // Get
    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public double getPrecio() { return precio; }
    public String getCodigo() { return codigo; }

    @Override
    public String toString() {
        return String.format("%s - %s - $%.2f", codigo, nombre, precio);
    }
}