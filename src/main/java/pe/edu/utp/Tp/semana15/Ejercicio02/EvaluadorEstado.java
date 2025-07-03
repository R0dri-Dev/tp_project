package pe.edu.utp.Tp.semana15.Ejercicio02;

public class EvaluadorEstado implements IProcesadorEstudiante{

    // Procesa los datos del estudiante y determina su estado académico
    @Override
    public String procesarDatos(String nombre, double... datos) {
        double promedio = datos[0]; // Se asume que el primer dato es el promedio
        String estado;

        // Determina el estado según el promedio
        if (promedio >= 16) {
            estado = "EXCELENTE";
        } else if (promedio >= 14) {
            estado = "BUENO";
        } else {
            estado = "REGULAR";
        }

        // Retorna el resultado formateado
        return "Estudiante: " + nombre + ", Estado: " + estado;
    }

    // Muestra el resultado en consola
    @Override
    public void mostrarResultado(String resultado) {
        System.out.println("\n--- ESTADO ACADÉMICO ---");
        System.out.println(resultado);
    }
}
