package PROGRAMACION.ProyectoObjetos;

import java.util.Random;

/**
 * Represents a character of the game with a name, position, health and a weapon.
 *
 * @author Estela
 * @version 1.0
 */
public class Personaje {
    /** Direction constant: north. */
    public static final int NORTE = 0;
    /** Direction constant: northeast. */
    public static final int NORESTE = 1;
    /** Direction constant: east. */
    public static final int ESTE = 2;
    /** Direction constant: southeast. */
    public static final int SURESTE = 3;
    /** Direction constant: south. */
    public static final int SUR = 4;
    /** Direction constant: southwest. */
    public static final int SUROESTE = 5;
    /** Direction constant: west. */
    public static final int OESTE = 6;
    /** Direction constant: northwest. */
    public static final int NOROESTE = 7;

    /** Name of the character. */
    private String nombre;
    /** Horizontal position of the character. */
    private int posx;
    /** Vertical position of the character. */
    private int posy;
    /** Current health points of the character. */
    private int puntosVida;
    /** Weight of the character. */
    private double peso;
    /** Height of the character. */
    private double tamanio;
    /** Image file name of the character. */
    private String imagen;
    /** Weapon currently equipped. */
    private Arma arma;
    /** Whether the character is active in the game. */
    public boolean activo;

    /** Random generator used for the default health points. */
    private Random random = new Random();

    /**
     * Creates a character with default values and random health points
     * between 50 and 100 (in steps of 10).
     */
    public Personaje() {
        this.nombre = "";
        this.posx = 0;
        this.posy = 0;
        this.puntosVida = 50 + (random.nextInt(6) * 10);
        this.peso = 70.0;
        this.tamanio = 1.70;
        this.imagen = "";
        this.arma = new Arma();
        this.activo = false;
    }

    /**
     * Creates a character with the given values.
     *
     * @param nombre the name of the character
     * @param posx the horizontal position
     * @param posy the vertical position
     * @param puntosVida the initial health points
     * @param peso the weight of the character
     * @param tamanio the height of the character
     * @param imagen the image file name
     * @param arma the equipped weapon
     * @param activo whether the character is active
     */
    public Personaje(String nombre, int posx, int posy, int puntosVida,
                    double peso, double tamanio, String imagen, Arma arma, boolean activo) {
        this.nombre = nombre;
        this.posx = posx;
        this.posy = posy;
        this.puntosVida = puntosVida;
        this.peso = peso;
        this.tamanio = tamanio;
        this.imagen = imagen;
        this.arma = arma;
        this.activo = activo;
    }

    /**
     * Gets the name of the character.
     *
     * @return the name
     */
    public String getNombre() { return nombre; }

    /**
     * Sets the name of the character.
     *
     * @param nombre the new name
     */
    public void setNombre(String nombre) { this.nombre = nombre; }

    /**
     * Gets the horizontal position.
     *
     * @return the x position
     */
    public int getPosx() { return posx; }

    /**
     * Sets the horizontal position.
     *
     * @param posx the new x position
     */
    public void setPosx(int posx) { this.posx = posx; }

    /**
     * Gets the vertical position.
     *
     * @return the y position
     */
    public int getPosy() { return posy; }

    /**
     * Sets the vertical position.
     *
     * @param posy the new y position
     */
    public void setPosy(int posy) { this.posy = posy; }

    /**
     * Gets the health points.
     *
     * @return the current health points
     */
    public int getPuntosVida() { return puntosVida; }

    /**
     * Sets the health points.
     *
     * @param puntosVida the new health points
     */
    public void setPuntosVida(int puntosVida) { this.puntosVida = puntosVida; }

    /**
     * Gets the weight of the character.
     *
     * @return the weight
     */
    public double getPeso() { return peso; }

    /**
     * Sets the weight of the character.
     *
     * @param peso the new weight
     */
    public void setPeso(double peso) { this.peso = peso; }

    /**
     * Gets the height of the character.
     *
     * @return the height
     */
    public double getTamanio() { return tamanio; }

    /**
     * Sets the height of the character.
     *
     * @param tamanio the new height
     */
    public void setTamanio(double tamanio) { this.tamanio = tamanio; }

    /**
     * Gets the image file name.
     *
     * @return the image file name
     */
    public String getImagen() { return imagen; }

    /**
     * Sets the image file name.
     *
     * @param imagen the new image file name
     */
    public void setImagen(String imagen) { this.imagen = imagen; }

    /**
     * Gets the equipped weapon.
     *
     * @return the weapon
     */
    public Arma getArma() { return arma; }

    /**
     * Sets the equipped weapon.
     *
     * @param arma the new weapon
     */
    public void setArma(Arma arma) { this.arma = arma; }

    /**
     * Checks whether the character is active.
     *
     * @return true if the character is active
     */
    public boolean isActivo() { return activo; }

    /**
     * Sets whether the character is active.
     *
     * @param activo the new active state
     */
    public void setActivo(boolean activo) { this.activo = activo; }

    /**
     * Shoots at another character. Consumes one ammunition and, if the target
     * is aligned (horizontal, vertical or diagonal), deals damage equal to half
     * the weapon power (doubled if the shooter is an enemy in infernal mode).
     * If the target is an enemy, its infernal mode is activated.
     *
     * @param p the character being shot at
     * @return true if the shot hit the target, false otherwise
     */
    public boolean disparar(Personaje p) {
        if (arma == null || arma.getMunicion() <= 0) {
            return false;
        }

        arma.setMunicion(arma.getMunicion() - 1);

        boolean alineadoX = (this.posx == p.getPosx());
        boolean alineadoY = (this.posy == p.getPosy());
        boolean alineadoDiagonal = (Math.abs(this.posx - p.getPosx()) == Math.abs(this.posy - p.getPosy()));

        if (alineadoX || alineadoY || alineadoDiagonal) {
            int danio = arma.getPotencia() / 2;

            if (this instanceof Enemigo && ((Enemigo)this).isModoInfernal()) {
                danio *= 2;
            }

            p.setPuntosVida(p.getPuntosVida() - danio);

            if (p instanceof Enemigo) {
                ((Enemigo)p).setModoInfernal(true);
            }

            return true;
        }
        return false;
    }

    /**
     * Moves the character one position in the given direction. The movement
     * is ignored if the direction is invalid or the new coordinates are negative.
     *
     * @param direccion the direction constant (NORTE, NORESTE, ESTE, SURESTE,
     *                  SUR, SUROESTE, OESTE or NOROESTE)
     */
    public void moverse(int direccion) {
        int newPosx = posx;
        int newPosy = posy;

        switch (direccion) {
            case NORTE: newPosy++; break;
            case NORESTE: newPosx++; newPosy++; break;
            case ESTE: newPosx++; break;
            case SURESTE: newPosx++; newPosy--; break;
            case SUR: newPosy--; break;
            case SUROESTE: newPosx--; newPosy--; break;
            case OESTE: newPosx--; break;
            case NOROESTE: newPosx--; newPosy++; break;
            default: return;
        }

        if (newPosx >= 0 && newPosy >= 0) {
            posx = newPosx;
            posy = newPosy;
        }
    }

    /**
     * Changes the equipped weapon if the new one meets the requirements:
     * full ammunition, weight at most 20% of the character weight, and
     * power between 1 and 100.
     *
     * @param nuevaArma the new weapon to equip
     * @return true if the weapon was changed, false otherwise
     */
    public boolean cambiarArma(Arma nuevaArma) {
        if (nuevaArma == null) return false;

        boolean municionLlena = (nuevaArma.getMunicion() == nuevaArma.getMunicionMax());
        boolean pesoValido = (nuevaArma.getPeso() <= (this.peso * 0.2));
        boolean potenciaValida = (nuevaArma.getPotencia() >= 1 && nuevaArma.getPotencia() <= 100);

        if (municionLlena && pesoValido && potenciaValida) {
            this.arma = nuevaArma;
            return true;
        }
        return false;
    }
}