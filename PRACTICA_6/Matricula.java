package PRACTICA_6;
public class Matricula {
    private Estudiante estudiante;
    private Curso curso;

    public Matricula(Estudiante estudiante, Curso curso) {
        this.estudiante = estudiante;
        this.curso = curso;
    }

    // Getters
    public Estudiante getEstudiante() { return estudiante; }
    public Curso getCurso() { return curso; }
}