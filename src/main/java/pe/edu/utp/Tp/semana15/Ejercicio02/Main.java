package pe.edu.utp.Tp.semana15.Ejercicio02;

public class Main {
    public static void main(String[] args) {
        // Creamos un estudiante con nombre y promedio
        Estudiante estudiante = new Estudiante("Lucía", 15.5);

        // Creamos el servicio para trabajar con estudiantes
        EstudianteServicio servicio = new EstudianteServicio();

        // Mostramos sus datos
        servicio.mostrarEstudiante(estudiante);

        // Evaluamos si aprobó o no
        if (servicio.aprobo(estudiante)) {
            System.out.println("🎓 ¡Estudiante aprobado!");
        } else {
            System.out.println("📘 Estudiante desaprobado.");
        }
    }
}
