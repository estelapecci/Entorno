package PROGRAMACION.ProyectoObjetos;

import java.util.Random;

public class Personaje {
    // Constantes de dirección
    public static final int NORTE = 0;
    public static final int NORESTE = 1;
    public static final int ESTE = 2;
    public static final int SURESTE = 3;
    public static final int SUR = 4;
    public static final int SUROESTE = 5;
    public static final int OESTE = 6;
    public static final int NOROESTE = 7;

    // Variables miembro
    private String nombre;
    private int posx;
    private int posy;
    private int puntosVida;
    private double peso;
    private double tamanio;
    private String imagen;
    private Arma arma;
    public boolean activo;

    private Random random = new Random();

    // Constructor vacío
    public Personaje() {
        this.nombre = "";
        this.posx = 0;
        this.posy = 0;
        // Puntos de vida aleatorios entre 50 y 100, de 10 en 10
        this.puntosVida = 50 + (random.nextInt(6) * 10);
        this.peso = 70.0;
        this.tamanio = 1.70;
        this.imagen = "";
        this.arma = new Arma();
        this.activo = false;
    }

    // Constructor con parámetros
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

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public int getPosx() { return posx; }
    public void setPosx(int posx) { this.posx = posx; }
    
    public int getPosy() { return posy; }
    public void setPosy(int posy) { this.posy = posy; }
    
    public int getPuntosVida() { return puntosVida; }
    public void setPuntosVida(int puntosVida) { this.puntosVida = puntosVida; }
    
    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }
    
    public double getTamanio() { return tamanio; }
    public void setTamanio(double tamanio) { this.tamanio = tamanio; }
    
    public String getImagen() { return imagen; }
    public void setImagen(String imagen) { this.imagen = imagen; }
    
    public Arma getArma() { return arma; }
    public void setArma(Arma arma) { this.arma = arma; }
    
    public boolean isActivo() { return activo; }
    public void setActivo(boolean activo) { this.activo = activo; }

    public boolean disparar(Personaje p) {
        if (arma == null || arma.getMunicion() <= 0) {
            return false;
        }

        // Decrementar munición
        arma.setMunicion(arma.getMunicion() - 1);

        // Verificar si está alineado (horizontal, vertical o diagonal)
        boolean alineadoX = (this.posx == p.getPosx());
        boolean alineadoY = (this.posy == p.getPosy());
        boolean alineadoDiagonal = (Math.abs(this.posx - p.getPosx()) == Math.abs(this.posy - p.getPosy()));

        if (alineadoX || alineadoY || alineadoDiagonal) {
            int danio = arma.getPotencia() / 2;
            
            // Si el que dispara es un Enemigo con modo infernal
            if (this instanceof Enemigo && ((Enemigo)this).isModoInfernal()) {
                danio *= 2;
            }
            
            p.setPuntosVida(p.getPuntosVida() - danio);
            
            // Si el objetivo es un Enemigo, activar modo infernal
            if (p instanceof Enemigo) {
                ((Enemigo)p).setModoInfernal(true);
            }
            
            return true;
        }
        return false;
    }

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
            default: return; // Dirección no válida
        }

        // Verificar que las nuevas coordenadas no sean negativas
        if (newPosx >= 0 && newPosy >= 0) {
            posx = newPosx;
            posy = newPosy;
        }
    }

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