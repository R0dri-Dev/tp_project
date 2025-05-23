package pe.edu.utp.Tp.semana05;

import java.util.Scanner;

public class Ejercicio03 {
    /*
    Escribe un programa en java que utilice un switch (clasico o mejorado)
    que trabaje con valores de tipo int. Utilizar constantes en lugar
    de valores directos o "en duro" dentro del switch.
     */
    private static final int SUMA = 1;
    private static final int RESTA = 2;
    private static final int MULTIPLICACION = 3;
    private static final int DIVISION = 4;
    private static final int MODULO = 5;
    private static final int SALIR = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== CALCULADORA BÁSICA =====");
            System.out.println(SUMA + ". Suma");
            System.out.println(RESTA + ". Resta");
            System.out.println(MULTIPLICACION + ". Multiplicación");
            System.out.println(DIVISION + ". División");
            System.out.println(MODULO + ". Módulo (Resto)");
            System.out.println(SALIR + ". Salir");

            System.out.print("\nSeleccione una operación: ");
            opcion = scanner.nextInt();

            if (opcion != SALIR) {
                System.out.print("Ingrese el primer número: ");
                double num1 = scanner.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                double num2 = scanner.nextDouble();

                double resultado = 0;
                boolean operacionValida = true;

                switch (opcion) {
                    case SUMA:
                        resultado = num1 + num2;
                        break;
                    case RESTA:
                        resultado = num1 - num2;
                        break;
                    case MULTIPLICACION:
                        resultado = num1 * num2;
                        break;
                    case DIVISION:
                        if (num2 == 0) {
                            System.out.println("Error: No se puede dividir por cero");
                            operacionValida = false;
                        } else {
                            resultado = num1 / num2;
                        }
                        break;
                    case MODULO:
                        if (num2 == 0) {
                            System.out.println("Error: No se puede calcular módulo con divisor cero");
                            operacionValida = false;
                        } else {
                            resultado = num1 % num2;
                        }
                        break;
                    default:
                        System.out.println("Opción no válida");
                        operacionValida = false;
                        break;
                }

                if (operacionValida) {
                    System.out.println("Resultado: " + resultado);
                }
            }

        } while (opcion != SALIR);

        System.out.println("¡Gracias por usar la calculadora!");
        scanner.close();
    }
}