package PROGRAMACION.ProyectoObjetos;

/**
 * Represents an enemy, a special type of character with resurrection,
 * infernal mode and teleportation abilities.
 *
 * @author Estela
 * @version 1.0
 */
public class Enemigo extends Personaje {
    /** Number of times the enemy can resurrect. */
    private int numResucit;
    /** Whether the enemy is in infernal mode. */
    private boolean modoInfernal;
    /** Whether the enemy can teleport. */
    private boolean teletransportacion;

    /**
     * Creates an enemy with default values.
     */
    public Enemigo() {
        super();
        this.numResucit = 0;
        this.modoInfernal = false;
        this.teletransportacion = false;
    }

    /**
     * Creates an enemy with the given values.
     *
     * @param nombre the name of the enemy
     * @param posx the horizontal position
     * @param posy the vertical position
     * @param puntosVida the initial health points
     * @param peso the weight of the enemy
     * @param tamanio the height of the enemy
     * @param imagen the image file name
     * @param arma the equipped weapon
     * @param activo whether the enemy is active
     * @param numResucit the number of resurrections
     * @param modoInfernal whether infernal mode is active
     * @param teletransportacion whether the enemy can teleport
     */
    public Enemigo(String nombre, int posx, int posy, int puntosVida,
                   double peso, double tamanio, String imagen, Arma arma, boolean activo,
                   int numResucit, boolean modoInfernal, boolean teletransportacion) {
        super(nombre, posx, posy, puntosVida, peso, tamanio, imagen, arma, activo);
        this.numResucit = numResucit;
        this.modoInfernal = modoInfernal;
        this.teletransportacion = teletransportacion;
    }

    /**
     * Gets the number of resurrections.
     *
     * @return the number of resurrections
     */
    public int getNumResucit() { return numResucit; }

    /**
     * Sets the number of resurrections.
     *
     * @param numResucit the new number of resurrections
     */
    public void setNumResucit(int numResucit) { this.numResucit = numResucit; }

    /**
     * Checks whether infernal mode is active.
     *
     * @return true if infernal mode is active
     */
    public boolean isModoInfernal() { return modoInfernal; }

    /**
     * Sets the infernal mode.
     *
     * @param modoInfernal the new infernal mode state
     */
    public void setModoInfernal(boolean modoInfernal) { this.modoInfernal = modoInfernal; }

    /**
     * Checks whether the enemy can teleport.
     *
     * @return true if teleportation is enabled
     */
    public boolean isTeletransportacion() { return teletransportacion; }

    /**
     * Sets whether the enemy can teleport.
     *
     * @param teletransportacion the new teleportation state
     */
    public void setTeletransportacion(boolean teletransportacion) { this.teletransportacion = teletransportacion; }

    /**
     * Detects a character if it is not an enemy and is within 3 positions
     * on both axes.
     *
     * @param per the character to detect
     * @return true if the character is detected, false otherwise
     */
    public boolean detectar(Personaje per) {
        if (per instanceof Enemigo) {
            return false;
        }

        int distanciaX = Math.abs(this.getPosx() - per.getPosx());
        int distanciaY = Math.abs(this.getPosy() - per.getPosy());

        return (distanciaX <= 3 && distanciaY <= 3);
    }

    /**
     * Teleports the enemy to the given position if teleportation is enabled
     * and the coordinates are not negative.
     *
     * @param posx the new horizontal position
     * @param posy the new vertical position
     * @return true if the enemy teleported, false otherwise
     */
    public boolean teletransportarse(int posx, int posy) {
        if (!this.teletransportacion || posx < 0 || posy < 0) {
            return false;
        }

        this.setPosx(posx);
        this.setPosy(posy);
        return true;
    }
}