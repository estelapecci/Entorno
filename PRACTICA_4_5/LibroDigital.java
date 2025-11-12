package PRACTICA_4_5;

public class LibroDigital extends Libro {
    private String formato;
    private double tamañoMB;

    public LibroDigital(String titulo, String autor, String isbn, int añoPublicacion, String editorial, String formato, double tamañoMB) {
        super(titulo, autor, isbn, añoPublicacion, editorial);
        this.formato = formato;
        this.tamañoMB = tamañoMB;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public double getTamañoMB() {
        return tamañoMB;
    }

    public void setTamañoMB(double tamañoMB) {
        this.tamañoMB = tamañoMB;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Formato: " + formato);
        System.out.println("Tamaño: " + tamañoMB + " MB");
        System.out.println("Tipo: Libro Digital");
    }
}