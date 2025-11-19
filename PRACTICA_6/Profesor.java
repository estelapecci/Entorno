package PRACTICA_6;
import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona {
    private double salario;
    private List<Curso> cursosDictados;

    public Profesor() {
        super();
        this.cursosDictados = new ArrayList<>();
    }

    public Profesor(String dni, String nombre, java.util.Date fechaNacimiento, double salario) {
        super(dni, nombre, fechaNacimiento);
        this.salario = salario;
        this.cursosDictados = new ArrayList<>();
    }

    public void asignarCurso(Curso c) {
        if (c != null && !cursosDictados.contains(c)) {
            cursosDictados.add(c);
        }
    }

    // Getters y setters
    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }
    public List<Curso> getCursosDictados() { return cursosDictados; }

    @Override
    public String toString() {
        return "Profesor{" +
                "dni='" + getDni() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", salario=" + salario +
                ", cursosDictados=" + cursosDictados.size() +
                '}';
    }
}