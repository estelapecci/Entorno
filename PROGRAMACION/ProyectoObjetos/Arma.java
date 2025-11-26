package PROGRAMACION.ProyectoObjetos;

public class Arma {
    private int municion;
    private int potencia;
    private double peso;
    private int municionMax;

    // Constructor vacío
    public Arma() {
        this.municion = 0;
        this.potencia = 1;
        this.peso = 1.0;
        this.municionMax = 10;
    }

    // Constructor con parámetros
    public Arma(int municion, int potencia, double peso, int municionMax) {
        this.municion = municion;
        this.potencia = potencia;
        this.peso = peso;
        this.municionMax = municionMax;
    }

    // Getters y Setters
    public int getMunicion() { return municion; }
    public void setMunicion(int municion) { this.municion = municion; }
    
    public int getPotencia() { return potencia; }
    public void setPotencia(int potencia) { this.potencia = potencia; }
    
    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }
    
    public int getMunicionMax() { return municionMax; }
    public void setMunicionMax(int municionMax) { this.municionMax = municionMax; }

    public boolean recargar() {
        if (municion == municionMax) {
            return false;
        }
        municion = municionMax;
        return true;
    }
}
