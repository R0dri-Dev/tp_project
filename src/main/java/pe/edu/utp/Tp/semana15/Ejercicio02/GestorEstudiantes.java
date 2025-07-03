package pe.edu.utp.Tp.semana15.Ejercicio02;

public class GestorEstudiantes {
    // Método que retorna el resultado procesado
    public static String obtenerResultadoProceso(IProcesadorEstudiante procesador, String nombre, double... datos) {
        return procesador.procesarDatos(nombre, datos);
    }

    public static void ejecutarProceso(IProcesadorEstudiante procesador, String nombre, double... datos) {
        String resultado = obtenerResultadoProceso(procesador, nombre, datos);
        procesador.mostrarResultado(resultado);
    }

    public static void mostrarEncabezado(String titulo) {
        System.out.println("=== " + titulo + " ===");
    }
}
