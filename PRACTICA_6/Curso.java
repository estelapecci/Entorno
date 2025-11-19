package PRACTICA_6;
import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String codigo;
    private String nombre;
    private int cupoMaximo;
    private List<Matricula> inscripciones;
    private List<Horario> horarios;
    private List<Profesor> profesores;

    public Curso() {
        this.inscripciones = new ArrayList<>();
        this.horarios = new ArrayList<>();
        this.profesores = new ArrayList<>();
    }

    public Curso(String codigo, String nombre, int cupoMaximo) {
        this();
        this.codigo = codigo;
        this.nombre = nombre;
        this.cupoMaximo = cupoMaximo;
    }

    public Matricula inscribir(Estudiante e) {
        if (e != null && inscripciones.size() < cupoMaximo) {
            // Verificar si ya está inscrito
            for (Matricula m : inscripciones) {
                if (m.getEstudiante().equals(e)) {
                    return m; // Ya está inscrito
                }
            }
            Matricula m = new Matricula(e, this);
            inscripciones.add(m);
            return m;
        }
        return null; // Cupo lleno o estudiante nulo
    }

    public void agregarHorario(Horario h) {
        if (h != null) {
            horarios.add(h);
        }
    }

    public void agregarProfesor(Profesor p) {
        if (p != null && !profesores.contains(p)) {
            profesores.add(p);
            p.asignarCurso(this);
        }
    }

    // Getters y setters
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getCupoMaximo() { return cupoMaximo; }
    public void setCupoMaximo(int cupoMaximo) { this.cupoMaximo = cupoMaximo; }
    public List<Matricula> getInscripciones() { return inscripciones; }
    public List<Horario> getHorarios() { return horarios; }
    public List<Profesor> getProfesores() { return profesores; }

    public int getCuposDisponibles() {
        return cupoMaximo - inscripciones.size();
    }

    @Override
    public String toString() {
        return "Curso{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cupoMaximo=" + cupoMaximo +
                ", inscripciones=" + inscripciones.size() +
                ", cuposDisponibles=" + getCuposDisponibles() +
                '}';
    }
}