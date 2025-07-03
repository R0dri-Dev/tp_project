package pe.edu.utp.Tp.semana15.Ejercicio01;

public class Multiplicacion implements IOperacion{
   @Override
    public double calcular(double num1, double num2) {
        // Realiza la multiplicación de dos números y retorna el resultado
        return num1 * num2;
    }

    @Override
    public void mostrarResultado(double num1, double num2, double resultado) {
        // Muestra el resultado de la multiplicación en consola con formato descriptivo
        System.out.println("Multiplicación: " + num1 + " × " + num2 + " = " + resultado);
    }
}
