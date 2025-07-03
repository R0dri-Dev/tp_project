package pe.edu.utp.Tp.semana15.Ejercicio02;

// Clase que representa un estudiante con nombre y promedio
public class Estudiante {
    private String nombre;      // Atributo: nombre del estudiante
    private double promedio;    // Atributo: promedio de notas

    // Constructor
    public Estudiante(String nombre, double promedio) {
        this.nombre = nombre;
        this.promedio = promedio;
    }

    // Getters y setters del nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getters y setters del promedio
    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}
