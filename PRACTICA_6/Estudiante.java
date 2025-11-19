package PRACTICA_6;
import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona {
    private boolean repetidor;
    private List<Matricula> matriculas;

    public Estudiante() {
        super();
        this.matriculas = new ArrayList<>();
    }

    public Estudiante(String dni, String nombre, java.util.Date fechaNacimiento, boolean repetidor) {
        super(dni, nombre, fechaNacimiento);
        this.repetidor = repetidor;
        this.matriculas = new ArrayList<>();
    }

    public Matricula inscribirse(Curso c) {
        if (c != null) {
            Matricula m = c.inscribir(this);
            if (m != null) {
                matriculas.add(m);
            }
            return m;
        }
        return null;
    }

    public boolean isRepetidor() { return repetidor; }
    public void setRepetidor(boolean repetidor) { this.repetidor = repetidor; }
    public List<Matricula> getMatriculas() { return matriculas; }

    @Override
    public String toString() {
        return "Estudiante{" +
                "dni='" + getDni() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", repetidor=" + repetidor +
                ", matriculas=" + matriculas.size() +
                '}';
    }
}