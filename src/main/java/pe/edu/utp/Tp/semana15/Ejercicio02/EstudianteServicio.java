package pe.edu.utp.Tp.semana15.Ejercicio02;

// Clase que contiene la lógica relacionada al estudiante
public class EstudianteServicio {

    // Procedimiento: muestra los datos del estudiante
    public void mostrarEstudiante(Estudiante e) {
        System.out.println("Nombre: " + e.getNombre());
        System.out.println("Promedio: " + e.getPromedio());
    }

    // Función: retorna true si el estudiante aprobó (promedio >= 13)
    public boolean aprobo(Estudiante e) {
        return e.getPromedio() >= 13.0;
    }
}

