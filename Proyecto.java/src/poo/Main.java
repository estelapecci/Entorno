package poo;
public class Main {
    public static void main(String[] args) throws Exception {
        PersonaPoo persona1 = new PersonaPoo("Ruben", 26);
        PersonaPoo persona2 = new PersonaPoo("Eli", 18);

        persona1.setDireccion("Cádiz,2");
        persona2.setDireccion("El Puerto de Santa Maria ");
        persona1.setApellido("Garcia ");
        persona2.setApellido("Falcon");
        persona1.setDNI("45862788B");
        persona2.setDNI("453543125R");
        persona1.setEmail("rubengarcia@gmail.com");
        persona2.setEmail("elifalcon@gmail.com");
        persona1.setTelefono("+34664899072");
        persona2.setTelefono("+34664085078");
        persona1.setProfesion("Cantante");
        persona2.setProfesion("Bailarina");
        persona1.setAnios_experiencia("10");
        persona2.setAnios_experiencia("8");
        persona1.MostrarInformacion();
        persona2.MostrarInformacion();

        System.out.println("Para la persona 1 sabemos que tiene " + persona1.getEdad() + " años.");


    }
}
