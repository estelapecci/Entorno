package PROYECTO;

import java.util.Date;

/**
 * Clase Profesor que hereda de Persona
 */
public class Profesor extends Persona {
    private double salario;
    
    public Profesor(String dni, String nombre, Date fechaNacimiento, double salario) {
        super(dni, nombre, fechaNacimiento);
        this.salario = salario;
    }
    
    // Método para asignar curso
    public void asignarCurso(Curso c) {
        // Por implementar
    }
    
    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }
}