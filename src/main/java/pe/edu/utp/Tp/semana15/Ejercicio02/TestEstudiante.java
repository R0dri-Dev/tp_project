package pe.edu.utp.Tp.semana15.Ejercicio02;

public class TestEstudiante {
    public static void main(String[] args) {
        GestorEstudiantes.mostrarEncabezado("GESTIÓN DE ESTUDIANTES");

        GestorEstudiantes.ejecutarProceso(new RegistroEstudiante(), "Ana García", 20);
        GestorEstudiantes.ejecutarProceso(new CalculadorPromedio(), "Ana García", 18.0, 16.5, 17.0);
        GestorEstudiantes.ejecutarProceso(new EvaluadorEstado(), "Ana García", 17.17);
        GestorEstudiantes.ejecutarProceso(new RegistroEstudiante(), "Carlos López", 19);
        GestorEstudiantes.ejecutarProceso(new CalculadorPromedio(), "Carlos López", 14.0, 15.5);

        System.out.println("\n¡Sistema ejecutado!");
    }
}
