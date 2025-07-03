package pe.edu.utp.Tp.semana15.Ejercicio02;

public class EvaluadorEstado implements IProcesadorEstudiante{
    @Override
    public String procesarDatos(String nombre, double... datos) {
        double promedio = datos[0];
        String estado;

        if (promedio >= 16) {
            estado = "EXCELENTE";
        } else if (promedio >= 14) {
            estado = "BUENO";
        } else {
            estado = "REGULAR";
        }

        return "Estudiante: " + nombre + ", Estado: " + estado;  // Método
    }

    @Override
    public void mostrarResultado(String resultado) {
        System.out.println("\n--- ESTADO ACADÉMICO ---");
        System.out.println(resultado);
    }
}
