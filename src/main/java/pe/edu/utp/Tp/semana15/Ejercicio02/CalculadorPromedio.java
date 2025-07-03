package pe.edu.utp.Tp.semana15.Ejercicio02;

public class CalculadorPromedio implements IProcesadorEstudiante{
@Override
// Método que procesa los datos del estudiante y calcula el promedio de sus notas
    public String procesarDatos(String nombre, double... notas) {
        double suma = 0;
        // Suma todas las notas recibidas
        for (double nota : notas) {
            suma += nota;
        }
        // Calcula el promedio dividiendo la suma entre la cantidad de notas
        double promedio = suma / notas.length;
        // Retorna un mensaje con el nombre del estudiante y su promedio formateado a dos decimales
        return "Estudiante: " + nombre + ", Promedio: " + String.format("%.2f", promedio);
    }

    @Override
    // Método que muestra el resultado del promedio en consola
    public void mostrarResultado(String resultado) {
        System.out.println("\n--- PROMEDIO ---");
        System.out.println(resultado);
    }
}
