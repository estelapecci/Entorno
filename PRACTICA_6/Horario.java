package PRACTICA_6;
import java.sql.Time;

public class Horario {
    private String diaSemana;
    private Time horalnicio;
    private Time horaFin;

    public Horario() {}

    // Getters y setters
    public String getDiaSemana() { return diaSemana; }
    public void setDiaSemana(String diaSemana) { this.diaSemana = diaSemana; }
    public Time getHoralnicio() { return horalnicio; }
    public void setHoralnicio(Time horalnicio) { this.horalnicio = horalnicio; }
    public Time getHoraFin() { return horaFin; }
    public void setHoraFin(Time horaFin) { this.horaFin = horaFin; }
}
