package pe.edu.utp.Tp.semana15.Ejercicio01;

public class Multiplicacion implements IOperacion{
    @Override
    public double calcular(double num1, double num2) {
        return num1 * num2;
    }

    @Override
    public void mostrarResultado(double num1, double num2, double resultado) {
        System.out.println("Multiplicación: " + num1 + " × " + num2 + " = " + resultado);
    }
}
