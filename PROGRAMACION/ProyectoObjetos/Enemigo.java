package PROGRAMACION.ProyectoObjetos;

public class Enemigo extends Personaje {
    private int numResucit;
    private boolean modoInfernal;
    private boolean teletransportacion;

    // Constructor vacío
    public Enemigo() {
        super();
        this.numResucit = 0;
        this.modoInfernal = false;
        this.teletransportacion = false;
    }

    // Constructor con parámetros
    public Enemigo(String nombre, int posx, int posy, int puntosVida, 
                   double peso, double tamanio, String imagen, Arma arma, boolean activo,
                   int numResucit, boolean modoInfernal, boolean teletransportacion) {
        super(nombre, posx, posy, puntosVida, peso, tamanio, imagen, arma, activo);
        this.numResucit = numResucit;
        this.modoInfernal = modoInfernal;
        this.teletransportacion = teletransportacion;
    }

    // Getters y Setters
    public int getNumResucit() { return numResucit; }
    public void setNumResucit(int numResucit) { this.numResucit = numResucit; }
    
    public boolean isModoInfernal() { return modoInfernal; }
    public void setModoInfernal(boolean modoInfernal) { this.modoInfernal = modoInfernal; }
    
    public boolean isTeletransportacion() { return teletransportacion; }
    public void setTeletransportacion(boolean teletransportacion) { this.teletransportacion = teletransportacion; }

    public boolean detectar(Personaje per) {
        // Verificar que no sea un enemigo y esté a menos de 3 posiciones
        if (per instanceof Enemigo) {
            return false;
        }
        
        int distanciaX = Math.abs(this.getPosx() - per.getPosx());
        int distanciaY = Math.abs(this.getPosy() - per.getPosy());
        
        return (distanciaX <= 3 && distanciaY <= 3);
    }

    public boolean teletransportarse(int posx, int posy) {
        // Verificar condiciones
        if (!this.teletransportacion || posx < 0 || posy < 0) {
            return false;
        }
        
        this.setPosx(posx);
        this.setPosy(posy);
        return true;
    }
}