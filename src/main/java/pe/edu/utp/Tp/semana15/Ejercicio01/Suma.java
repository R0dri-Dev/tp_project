package pe.edu.utp.Tp.semana15.Ejercicio01;

public class Suma implements IOperacion{
    @Override
    public double calcular(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public void mostrarResultado(double num1, double num2, double resultado) {
        System.out.println("Suma: " + num1 + " + " + num2 + " = " + resultado);
    }
}
