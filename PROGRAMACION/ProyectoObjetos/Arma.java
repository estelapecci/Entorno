package PROGRAMACION.ProyectoObjetos;

/**
 * Represents a weapon with ammunition, power and weight.
 *
 * @author Estela
 * @version 1.0
 */
public class Arma {
    /** Current ammunition in the weapon. */
    private int municion;
    /** Power of the weapon (damage base). */
    private int potencia;
    /** Weight of the weapon. */
    private double peso;
    /** Maximum ammunition the weapon can hold. */
    private int municionMax;

    /**
     * Creates an empty weapon with default values.
     */
    public Arma() {
        this.municion = 0;
        this.potencia = 1;
        this.peso = 1.0;
        this.municionMax = 10;
    }

    /**
     * Creates a weapon with the given values.
     *
     * @param municion the current ammunition
     * @param potencia the power of the weapon
     * @param peso the weight of the weapon
     * @param municionMax the maximum ammunition
     */
    public Arma(int municion, int potencia, double peso, int municionMax) {
        this.municion = municion;
        this.potencia = potencia;
        this.peso = peso;
        this.municionMax = municionMax;
    }

    /**
     * Gets the current ammunition.
     *
     * @return the current ammunition
     */
    public int getMunicion() { return municion; }

    /**
     * Sets the current ammunition.
     *
     * @param municion the new ammunition
     */
    public void setMunicion(int municion) { this.municion = municion; }

    /**
     * Gets the power of the weapon.
     *
     * @return the power
     */
    public int getPotencia() { return potencia; }

    /**
     * Sets the power of the weapon.
     *
     * @param potencia the new power
     */
    public void setPotencia(int potencia) { this.potencia = potencia; }

    /**
     * Gets the weight of the weapon.
     *
     * @return the weight
     */
    public double getPeso() { return peso; }

    /**
     * Sets the weight of the weapon.
     *
     * @param peso the new weight
     */
    public void setPeso(double peso) { this.peso = peso; }

    /**
     * Gets the maximum ammunition.
     *
     * @return the maximum ammunition
     */
    public int getMunicionMax() { return municionMax; }

    /**
     * Sets the maximum ammunition.
     *
     * @param municionMax the new maximum ammunition
     */
    public void setMunicionMax(int municionMax) { this.municionMax = municionMax; }

    /**
     * Reloads the weapon up to its maximum ammunition.
     *
     * @return true if the weapon was reloaded, false if it was already full
     */
    public boolean recargar() {
        if (municion == municionMax) {
            return false;
        }
        municion = municionMax;
        return true;
    }
}