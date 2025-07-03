package pe.edu.utp.Tp.semana15.Ejercicio01;

public class ProcesadorOperaciones {
    public static void ejecutarOperacion(IOperacion operacion, double num1, double num2) {
        double resultado = operacion.calcular(num1, num2);
        operacion.mostrarResultado(num1, num2, resultado);
    }
}
