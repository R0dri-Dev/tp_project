package pe.edu.utp.Tp.semana15.Ejercicio02;

public class TestEstudiante {
    public static void main(String[] args) {
       // Muestra el encabezado del sistema de gestión de estudiantes
        GestorEstudiantes.mostrarEncabezado("GESTIÓN DE ESTUDIANTES");

        // Registra a la estudiante Ana García con edad 20
        GestorEstudiantes.ejecutarProceso(new RegistroEstudiante(), "Ana García", 20);
        // Calcula el promedio de notas para Ana García
        GestorEstudiantes.ejecutarProceso(new CalculadorPromedio(), "Ana García", 18.0, 16.5, 17.0);
        // Evalúa el estado académico de Ana García según su promedio
        GestorEstudiantes.ejecutarProceso(new EvaluadorEstado(), "Ana García", 17.17);
        // Registra a Carlos López con edad 19
        GestorEstudiantes.ejecutarProceso(new RegistroEstudiante(), "Carlos López", 19);
        // Calcula el promedio de notas para Carlos López
        GestorEstudiantes.ejecutarProceso(new CalculadorPromedio(), "Carlos López", 14.0, 15.5);

        // Mensaje final indicando que el sistema se ejecutó correctamente
        System.out.println("\n¡Sistema ejecutado!");
    }
}
