package pe.edu.utp.Tp.semana15.Ejercicio01;

public class ProcesadorOperaciones {
   // Método estático que ejecuta una operación usando la interfaz IOperacion
    public static void ejecutarOperacion(IOperacion operacion, double num1, double num2) {
        // Calcula el resultado de la operación con los dos números
        double resultado = operacion.calcular(num1, num2);
        // Muestra el resultado de la operación
        operacion.mostrarResultado(num1, num2, resultado);
    }
}
