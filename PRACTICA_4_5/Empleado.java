package PRACTICA_4_5;

public class Empleado extends Persona {
    private String puesto;
    private double sueldo;

    public Empleado(String nombre, String apellido, String dni, int edad, String email, String telefono, String puesto, double sueldo) {
        super(nombre, apellido, dni, edad, email, telefono);
        this.puesto = puesto;
        this.sueldo = sueldo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Puesto: " + puesto);
        System.out.println("Sueldo: " + sueldo + "€");
    }
} 
    

