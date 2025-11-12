package PRACTICA_4_5;

public class SalaInformatica extends Sala {
    private int numEquipos;

    public SalaInformatica(int numero, int aforoMaximo, int numEquipos) {
        super(numero, aforoMaximo, "Informática");
        this.numEquipos = numEquipos;
    }

    public int getNumEquipos() {
        return numEquipos;
    }

    public void setNumEquipos(int numEquipos) {
        this.numEquipos = numEquipos;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de equipos: " + numEquipos);
    }
}