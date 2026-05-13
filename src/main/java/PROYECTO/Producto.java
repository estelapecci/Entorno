package PROYECTO;

public abstract class Producto {

    protected int id;
    protected String nombre;
    protected double precioBase;

    private static int contadorIds = 1;

    public Producto(String nombre, double precioBase) {
        if (precioBase < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }

        this.id = contadorIds++;
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        if (precioBase < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
        this.precioBase = precioBase;
    }

    public abstract double calcularPrecioFinal(String paisCliente);

    @Override
    public String toString() {
        return "Producto{id=" + id + ", nombre='" + nombre + "', precioBase=" + precioBase + "€}";
    }
}
