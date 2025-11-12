package PRACTICA_4_5;

public class LibroFisico extends Libro {
    private int numPaginas;
    private String ubicacion;

    public LibroFisico(String titulo, String autor, String isbn, int añoPublicacion, String editorial, int numPaginas, String ubicacion) {
        super(titulo, autor, isbn, añoPublicacion, editorial);
        this.numPaginas = numPaginas;
        this.ubicacion = ubicacion;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de páginas: " + numPaginas);
        System.out.println("Ubicación: " + ubicacion);
        System.out.println("Tipo: Libro Físico");
    }
}