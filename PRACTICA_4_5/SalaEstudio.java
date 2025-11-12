package PRACTICA_4_5;

public class SalaEstudio extends Sala {
    private int numMesas;

    public SalaEstudio(int numero, int aforoMaximo, int numMesas) {
        super(numero, aforoMaximo, "Estudio");
        this.numMesas = numMesas;
    }

    public int getNumMesas() {
        return numMesas;
    }

    public void setNumMesas(int numMesas) {
        this.numMesas = numMesas;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de mesas: " + numMesas);
    }
}