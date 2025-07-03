package pe.edu.utp.Tp.semana15.Ejercicio01;

public class TestOperaciones {
    public static void main(String[] args) {
       // Mensaje inicial de la calculadora
        System.out.println("=== CALCULADORA MODULAR ===");

        // Realiza una suma de 10.0 + 5.0
        ProcesadorOperaciones.ejecutarOperacion(new Suma(), 10.0, 5.0);

        // Realiza una resta de 20.0 - 8.0
        ProcesadorOperaciones.ejecutarOperacion(new Resta(), 20.0, 8.0);

        // Realiza una multiplicación de 4.0 * 3.0
        ProcesadorOperaciones.ejecutarOperacion(new Multiplicacion(), 4.0, 3.0);

        // Realiza una suma de 15.5 + 2.5
        ProcesadorOperaciones.ejecutarOperacion(new Suma(), 15.5, 2.5);

        // Realiza una resta de 30.0 - 12.0
        ProcesadorOperaciones.ejecutarOperacion(new Resta(), 30.0, 12.0);

        // Mensaje final indicando que las operaciones han terminado
        System.out.println("¡Operaciones completadas!");
    }
}
