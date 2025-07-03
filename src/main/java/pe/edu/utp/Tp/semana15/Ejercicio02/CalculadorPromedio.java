package pe.edu.utp.Tp.semana15.Ejercicio02;

public class CalculadorPromedio implements IProcesadorEstudiante{
    @Override
    public String procesarDatos(String nombre, double... notas) {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        double promedio = suma / notas.length;
        return "Estudiante: " + nombre + ", Promedio: " + String.format("%.2f", promedio);
    }

    @Override
    public void mostrarResultado(String resultado) {
        System.out.println("\n--- PROMEDIO ---");
        System.out.println(resultado);
    }
}
