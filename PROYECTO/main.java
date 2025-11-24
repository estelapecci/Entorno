package PROYECTO;

import java.util.Date;
import java.sql.Time;

/**
 * Clase principal para probar el sistema universitario
 * Con datos de gente de Cadiz
 */
public class main {
    public static void main(String[] args) {
        
        System.out.println("SISTEMA UNIVERSITARIO DE CADIZ ");
        System.out.println("Iniciando programa...\n");
        
        // Crear una universidad de Cadiz
        Universidad universidadCadiz = new Universidad("Universidad de Cadiz");
        System.out.println("Universidad creada: " + universidadCadiz.getNombre());
        
        // Crear departamentos de la UCA
        Departamento departamentoInformatica = new Departamento("Informatica");
        Departamento departamentoMatematicas = new Departamento("Matematicas");
        System.out.println("Departamentos creados: " + departamentoInformatica.getNombre() + " y " + departamentoMatematicas.getNombre());
        
        // Crear direcciones de Cadiz
        Direccion direccionProfesor = new Direccion("Avenida de la Universidad", 10, "Cadiz");
        Direccion direccionEstudiante1 = new Direccion("Calle Ancha", 25, "Cadiz");
        Direccion direccionEstudiante2 = new Direccion("Plaza de España", 8, "Puerto Real");
        System.out.println("Direcciones creadas en Cadiz y Puerto Real");
        
        // Crear profesores de Cadiz
        Date fechaNacProfesor = new Date(85, 4, 15); // 15 de mayo 1985
        Profesor profesor1 = new Profesor("12345678A", "Juan Garcia Lopez", fechaNacProfesor, 35000.0);
        
        System.out.println("\nProfesor creado:");
        System.out.println("- Nombre: " + profesor1.getNombre());
        System.out.println("- DNI: " + profesor1.getDni());
        System.out.println("- Salario: " + profesor1.getSalario() + " euros");
        
        // Crear estudiantes de Cadiz
        Date fechaNacEstudiante1 = new Date(102, 7, 20); // 20 de agosto 2002
        Date fechaNacEstudiante2 = new Date(101, 2, 10); // 10 de marzo 2001
        
        Estudiante estudiante1 = new Estudiante("87654321B", "Maria Sanchez Perez", fechaNacEstudiante1, false);
        Estudiante estudiante2 = new Estudiante("11223344C", "Carlos Rodriguez Gomez", fechaNacEstudiante2, true);
        
        System.out.println("\nEstudiantes creados:");
        System.out.println("- " + estudiante1.getNombre() + " (Repetidor: " + estudiante1.isRepetidor() + ")");
        System.out.println("- " + estudiante2.getNombre() + " (Repetidor: " + estudiante2.isRepetidor() + ")");
        
        // Crear cursos tipicos de informatica
        Curso cursoProgramacion = new Curso("PROG-101", "Programacion en Java", 30);
        Curso cursoBasesDatos = new Curso("BD-201", "Bases de Datos SQL", 25);
        Curso cursoWeb = new Curso("WEB-301", "Desarrollo Web", 20);
        
        System.out.println("\nCursos creados:");
        System.out.println("- " + cursoProgramacion.getNombre() + " (Codigo: " + cursoProgramacion.getCodigo() + ")");
        System.out.println("- " + cursoBasesDatos.getNombre() + " (Codigo: " + cursoBasesDatos.getCodigo() + ")");
        System.out.println("- " + cursoWeb.getNombre() + " (Codigo: " + cursoWeb.getCodigo() + ")");
        
        // Crear horarios
        Time horaInicioManana = Time.valueOf("09:00:00");
        Time horaFinManana = Time.valueOf("11:00:00");
        Time horaInicioTarde = Time.valueOf("16:00:00");
        Time horaFinTarde = Time.valueOf("18:00:00");
        
        Horario horarioLunesManana = new Horario("Lunes", horaInicioManana, horaFinManana);
        Horario horarioMiercolesTarde = new Horario("Miercoles", horaInicioTarde, horaFinTarde);
        
        System.out.println("\nHorarios creados:");
        System.out.println("- " + horarioLunesManana.getDiaSemana() + " de " + horarioLunesManana.getHoraInicio() + " a " + horarioLunesManana.getHoraFin());
        System.out.println("- " + horarioMiercolesTarde.getDiaSemana() + " de " + horarioMiercolesTarde.getHoraInicio() + " a " + horarioMiercolesTarde.getHoraFin());
        
        // Simular operaciones del sistema
        System.out.println("\n OPERACIONES DEL SISTEMA ");
        
        // Profesor asigna cursos
        profesor1.asignarCurso(cursoProgramacion);
        profesor1.asignarCurso(cursoBasesDatos);
        System.out.println("El profesor " + profesor1.getNombre() + " ha asignado los cursos: " + cursoProgramacion.getNombre() + " y " + cursoBasesDatos.getNombre());
        
        // Estudiantes se inscriben en cursos
        Matricula matricula1 = estudiante1.inscribirse(cursoProgramacion);
        Matricula matricula2 = estudiante1.inscribirse(cursoWeb);
        Matricula matricula3 = estudiante2.inscribirse(cursoBasesDatos);
        
        System.out.println("La estudiante " + estudiante1.getNombre() + " se ha inscrito en " + cursoProgramacion.getNombre() + " y " + cursoWeb.getNombre());
        System.out.println("El estudiante " + estudiante2.getNombre() + " se ha inscrito en " + cursoBasesDatos.getNombre());
        
        // Cursos inscriben estudiantes
        Matricula matricula4 = cursoProgramacion.inscribir(estudiante1);
        Matricula matricula5 = cursoBasesDatos.inscribir(estudiante2);
        
        System.out.println("El curso " + cursoProgramacion.getNombre() + " ha inscrito a: " + estudiante1.getNombre());
        System.out.println("El curso " + cursoBasesDatos.getNombre() + " ha inscrito a: " + estudiante2.getNombre());
        
        // Mostrar informacion de edades
        System.out.println("\n INFORMACION DE EDADES ");
        System.out.println("Edad del profesor " + profesor1.getNombre() + ": " + profesor1.getEdad() + " años");
        System.out.println("Edad de la estudiante " + estudiante1.getNombre() + ": " + estudiante1.getEdad() + " años");
        System.out.println("Edad del estudiante " + estudiante2.getNombre() + ": " + estudiante2.getEdad() + " años");
        
        // Mostrar resumen final
        System.out.println("\n RESUMEN DEL SISTEMA ");
        System.out.println("Universidad: " + universidadCadiz.getNombre());
        System.out.println("Profesores: 1");
        System.out.println("Estudiantes: 2");
        System.out.println("Cursos activos: 3");
        System.out.println("Matriculas realizadas: 5");
        
        System.out.println("\n=== PROGRAMA FINALIZADO ===");
        System.out.println("Sistema universitario de Cadiz funcionando correctamente");
    }
}