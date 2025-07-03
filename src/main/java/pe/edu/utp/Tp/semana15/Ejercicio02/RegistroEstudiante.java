package pe.edu.utp.Tp.semana15.Ejercicio02;

public class RegistroEstudiante implements IProcesadorEstudiante{
    @Override
  // Procesa los datos del estudiante y retorna un mensaje de registro
    public String procesarDatos(String nombre, double... datos) {
        int edad = (int) datos[0]; // Se asume que el primer dato es la edad
        return "Estudiante: " + nombre + ", Edad: " + edad + " años - REGISTRADO";
    }

    @Override
    // Muestra el resultado del registro en consola
    public void mostrarResultado(String resultado) {
        System.out.println("\n--- REGISTRO ---");
        System.out.println(resultado);
    }
}
