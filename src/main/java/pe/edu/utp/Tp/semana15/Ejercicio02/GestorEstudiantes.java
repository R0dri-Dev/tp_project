package pe.edu.utp.Tp.semana15.Ejercicio02;

public class GestorEstudiantes {

   // Método que retorna el resultado procesado utilizando el procesador proporcionado
    public static String obtenerResultadoProceso(IProcesadorEstudiante procesador, String nombre, double... datos) {
        // Llama al método procesarDatos del procesador y retorna el resultado
        return procesador.procesarDatos(nombre, datos);
    }

    // Método que ejecuta el proceso y muestra el resultado usando el procesador
    public static void ejecutarProceso(IProcesadorEstudiante procesador, String nombre, double... datos) {
        // Obtiene el resultado procesado
        String resultado = obtenerResultadoProceso(procesador, nombre, datos);
        // Muestra el resultado utilizando el método mostrarResultado del procesador
        procesador.mostrarResultado(resultado);
    }

    // Método que muestra un encabezado formateado en consola
    public static void mostrarEncabezado(String titulo) {
        System.out.println("=== " + titulo + " ===");
    }
}
