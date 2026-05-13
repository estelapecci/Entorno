package PROYECTO;

public class ProductoFisico extends Producto {

    private double peso;

    public ProductoFisico(String nombre, double precioBase, double peso) {
        super(nombre, precioBase);
        this.peso = peso;
    }

    public double calcularCosteEnvio(String pais) {

        if (pais == null) return 10;

        String p = pais.toUpperCase();

        if (p.equals("ESPAÑA")) return 0;
        if (p.equals("FRANCIA") || p.equals("ITALIA") || p.equals("PORTUGAL")) return 5;

        return 10;
    }

    @Override
    public double calcularPrecioFinal(String paisCliente) {
        return precioBase + calcularCosteEnvio(paisCliente);
    }

    @Override
    public String toString() {
        return super.toString() +
                " | Físico -> Peso: " + peso + "kg | Total: " +
                calcularPrecioFinal(null) + "€";
    }
}
