package poojedi;

import java.util.ArrayList;
import java.util.List;

public class Cursos {
    public static void main(String[] args) {

        Alumno alumno1 = new Alumno("Fran", "Lopez", 31);
        Alumno alumno2 = new Alumno("Rocio", "Gonzales", 29);
        Alumno alumno3 = new Alumno("Nati", "Fernandez", 30);

        List<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);

        Curso curso = new Curso("Curso de Programación", true, "Introducción a la programación", listaAlumnos);

        System.out.println("Nombre del curso: " + curso.getNombre());
        System.out.println("Descripción del curso: " + curso.getDescripcion());

        System.out.println("Nombres de los alumnos en el curso:");
        for (Alumno alumno : curso.getAlumnos()) {
            System.out.println(alumno.nombre + " " + alumno.apellido + " " + alumno.edad);
        }
    }
}
