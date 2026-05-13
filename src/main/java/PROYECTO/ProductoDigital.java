package PROYECTO;

public class ProductoDigital extends Producto {

    private double tamanoDescarga;
    private String licencia;
    private String tipoIVA; // GENERAL, REDUCIDO, SUPER

    public ProductoDigital(String nombre, double precioBase, double tamanoDescarga, String licencia, String tipoIVA) {
        super(nombre, precioBase);
        this.tamanoDescarga = tamanoDescarga;
        this.licencia = licencia;
        this.tipoIVA = tipoIVA;
    }

    public double aplicarIVA(String tipo) {
        switch (tipo.toUpperCase()) {
            case "GENERAL": return precioBase * 0.21;
            case "REDUCIDO": return precioBase * 0.10;
            case "SUPER": return precioBase * 0.04;
            default: throw new IllegalArgumentException("Tipo de IVA inválido");
        }
    }

    @Override
    public double calcularPrecioFinal(String paisCliente) {
        return precioBase + aplicarIVA(tipoIVA);
    }

    @Override
    public String toString() {
        return super.toString() +
               " | Digital -> Tamaño: " + tamanoDescarga +
               "MB | Licencia: " + licencia +
               " | IVA: " + tipoIVA +
               " | Total: " + calcularPrecioFinal(null) + "€";
    }
}
