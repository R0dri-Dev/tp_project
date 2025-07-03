package pe.edu.utp.Tp.semana15.Ejercicio02;

public class RegistroEstudiante implements IProcesadorEstudiante{
    @Override
    public String procesarDatos(String nombre, double... datos) {
        int edad = (int) datos[0];
        return "Estudiante: " + nombre + ", Edad: " + edad + " años - REGISTRADO";
    }

    @Override
    public void mostrarResultado(String resultado) {
        System.out.println("\n--- REGISTRO ---");
        System.out.println(resultado);
    }
}
