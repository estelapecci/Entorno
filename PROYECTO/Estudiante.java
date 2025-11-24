package PROYECTO;

import java.util.Date;

/**
 * Clase Estudiante que hereda de Persona
 */
public class Estudiante extends Persona {
    private boolean repetidor;
    
    public Estudiante(String dni, String nombre, Date fechaNacimiento, boolean repetidor) {
        super(dni, nombre, fechaNacimiento);
        this.repetidor = repetidor;
    }
    
    // Método para inscribirse en curso
    public Matricula inscribirse(Curso c) {
        // Por implementar
        return new Matricula();
    }
    
    public boolean isRepetidor() { return repetidor; }
    public void setRepetidor(boolean repetidor) { this.repetidor = repetidor; }
}