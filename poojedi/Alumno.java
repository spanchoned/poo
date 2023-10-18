package poojedi;

import java.time.LocalDate;

public class Alumno {
    String nombre;
    String apellido;
    LocalDate fechaNacimiento;
    int edad;

    public Alumno(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public static void main(String[] args) {
        Alumno persona1 = new Alumno("Fran", "Lopez", 31);
        Alumno persona2 = new Alumno("Rocio", "Gonzales", 29);
        Alumno persona3 = new Alumno("Nati", "Fernandez", 30);

        System.out.println(persona1.nombre + " " + persona1.apellido + " " + persona1.edad);
        System.out.println(persona2.nombre + " " + persona2.apellido + " " + persona2.edad);
        System.out.println(persona3.nombre + " " + persona3.apellido + " " + persona3.edad);
    }
}
