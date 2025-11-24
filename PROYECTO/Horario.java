package PROYECTO;

import java.sql.Time;

/**
 * Clase para el horario de cursos
 */
public class Horario {
    private String diaSemana;
    private Time horaInicio;
    private Time horaFin;
    
    public Horario(String diaSemana, Time horaInicio, Time horaFin) {
        this.diaSemana = diaSemana;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }
    
    // Getters y setters
    public String getDiaSemana() { return diaSemana; }
    public void setDiaSemana(String diaSemana) { this.diaSemana = diaSemana; }
    
    public Time getHoraInicio() { return horaInicio; }
    public void setHoraInicio(Time horaInicio) { this.horaInicio = horaInicio; }
    
    public Time getHoraFin() { return horaFin; }
    public void setHoraFin(Time horaFin) { this.horaFin = horaFin; }
}
