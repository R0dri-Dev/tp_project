package pe.edu.utp.Tp.semana15.Ejercicio01;

public class TestOperaciones {
    public static void main(String[] args) {
        System.out.println("=== CALCULADORA MODULAR ===");

        ProcesadorOperaciones.ejecutarOperacion(new Suma(), 10.0, 5.0);
        ProcesadorOperaciones.ejecutarOperacion(new Resta(), 20.0, 8.0);
        ProcesadorOperaciones.ejecutarOperacion(new Multiplicacion(), 4.0, 3.0);
        ProcesadorOperaciones.ejecutarOperacion(new Suma(), 15.5, 2.5);
        ProcesadorOperaciones.ejecutarOperacion(new Resta(), 30.0, 12.0);

        System.out.println("¡Operaciones completadas!");
    }
}
