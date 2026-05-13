package PROYECTO;

public class Cliente {

    private int id;
    private String nombre;
    private String correo;
    private String direccion;
    private int anosAntiguedad;
    private boolean esVip;
    private String pais;

    private static int contadorIds = 1;

    public Cliente(String nombre, String correo, String direccion,
                   int anosAntiguedad, boolean esVip, String pais) {

        this.id = contadorIds++;
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
        this.anosAntiguedad = anosAntiguedad;
        this.esVip = esVip;
        this.pais = pais;
    }

    public int getId() { return id; }
    public String getPais() { return pais; }
    public boolean getEsVip() { return esVip; }
    public int getAnosAntiguedad() { return anosAntiguedad; }

    @Override
    public String toString() {
        return "Cliente{id=" + id + ", nombre='" + nombre +
                "', pais=" + pais + ", vip=" + esVip +
                ", años=" + anosAntiguedad + "}";
    }
}
