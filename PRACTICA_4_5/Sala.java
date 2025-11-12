package PRACTICA_4_5;

public class Sala {
    private int numero;
    private int aforoMaximo;
    private int numeroActualPersonas;
    private String tipo;
    private Persona responsable;

    public Sala(int numero, int aforoMaximo, String tipo) {
        this.numero = numero;
        this.aforoMaximo = aforoMaximo;
        this.tipo = tipo;
        this.numeroActualPersonas = 0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAforoMaximo() {
        return aforoMaximo;
    }

    public void setAforoMaximo(int aforoMaximo) {
        this.aforoMaximo = aforoMaximo;
    }

    public int getNumeroActualPersonas() {
        return numeroActualPersonas;
    }

    public void setNumeroActualPersonas(int numeroActualPersonas) {
        this.numeroActualPersonas = numeroActualPersonas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Persona getResponsable() {
        return responsable;
    }

    public void setResponsable(Persona responsable) {
        this.responsable = responsable;
    }

    public boolean entrarPersona() {
        if (numeroActualPersonas < aforoMaximo) {
            numeroActualPersonas++;
            return true;
        }
        return false;
    }

    public void salirPersona() {
        if (numeroActualPersonas > 0) {
            numeroActualPersonas--;
        }
    }

    public void mostrarInformacion() {
        System.out.println("Sala " + numero + " - Tipo: " + tipo);
        System.out.println("Aforo: " + numeroActualPersonas + "/" + aforoMaximo);
        if (responsable != null) {
            System.out.println("Responsable: " + responsable.getNombre() + " " + responsable.getApellido());
        } else {
            System.out.println("Responsable: No asignado");
        }
    }
}