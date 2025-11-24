package PROYECTO;

/**
 * Clase para representar un curso
 */
public class Curso {
    private String codigo;
    private String nombre;
    private int cupoMaximo;
    
    public Curso(String codigo, String nombre, int cupoMaximo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cupoMaximo = cupoMaximo;
    }
    
    // Método para inscribir estudiante
    public Matricula inscribir(Estudiante e) {
        // Por implementar
        return new Matricula();
    }
    
    // Getters y setters
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public int getCupoMaximo() { return cupoMaximo; }
    public void setCupoMaximo(int cupoMaximo) { this.cupoMaximo = cupoMaximo; }
}