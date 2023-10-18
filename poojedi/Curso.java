package poojedi;

import java.util.List;

public class Curso {
    private String nombre;
    private boolean habilitado;
    private String descripcion;
    private List<Alumno> alumnos;

    public Curso(String nombre, boolean habilitado, String descripcion, List<Alumno> alumnos) {
        this.nombre = nombre;
        this.habilitado = habilitado;
        this.descripcion = descripcion;
        this.alumnos = alumnos;
    }

    public String getNombre() {
        return this.nombre;
    }

    public boolean isHabilitado() {
        return this.habilitado;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public List<Alumno> getAlumnos() {
        return this.alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
}
