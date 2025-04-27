package pe.edu.utp.Tp.semana05;

import java.util.Scanner;

public class Ejercicio03 {
    /*
    Escribe un programa en java que utilice un switch (clasico o mejorado)
    que trabaje con valores de tipo int. Utilizar constantes en lugar
    de valores directos o "en duro" dentro del switch.
     */

    // Definimos constantes para los diferentes tipos de operaciones
    // Las constantes se declaran como 'static final' y por convención se escriben en MAYÚSCULAS
    private static final int SUMA = 1;           // Constante para la operación de suma
    private static final int RESTA = 2;          // Constante para la operación de resta
    private static final int MULTIPLICACION = 3; // Constante para la operación de multiplicación
    private static final int DIVISION = 4;       // Constante para la operación de división
    private static final int MODULO = 5;         // Constante para la operación de módulo (resto)
    private static final int SALIR = 0;          // Constante para salir del programa

    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // Variable para almacenar la opción seleccionada por el usuario
        int opcion;

        // Usamos un bucle do-while para mostrar el menú repetidamente hasta que el usuario elija salir
        do {
            // Mostrar menú de opciones
            System.out.println("\n===== CALCULADORA BÁSICA =====");
            // Utilizamos las constantes para mostrar las opciones del menú
            System.out.println(SUMA + ". Suma");
            System.out.println(RESTA + ". Resta");
            System.out.println(MULTIPLICACION + ". Multiplicación");
            System.out.println(DIVISION + ". División");
            System.out.println(MODULO + ". Módulo (Resto)");
            System.out.println(SALIR + ". Salir");

            System.out.print("\nSeleccione una operación: ");
            // Leemos la opción seleccionada por el usuario
            opcion = scanner.nextInt();

            // Si la opción es diferente de SALIR, procedemos a realizar una operación
            if (opcion != SALIR) {
                // Solicitamos al usuario los dos números para la operación
                System.out.print("Ingrese el primer número: ");
                double num1 = scanner.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                double num2 = scanner.nextDouble();

                // Variable para almacenar el resultado de la operación
                double resultado = 0;
                // Variable para controlar si hubo algún error durante la operación
                boolean operacionValida = true;

                // Switch clásico que usa constantes en lugar de valores directos
                switch (opcion) {
                    case SUMA:  // Utilizamos la constante SUMA en lugar del número 1
                        resultado = num1 + num2;
                        break;
                    case RESTA:  // Utilizamos la constante RESTA en lugar del número 2
                        resultado = num1 - num2;
                        break;
                    case MULTIPLICACION:  // Utilizamos la constante MULTIPLICACION en lugar del número 3
                        resultado = num1 * num2;
                        break;
                    case DIVISION:  // Utilizamos la constante DIVISION en lugar del número 4
                        // Verificamos que no se intente dividir por cero
                        if (num2 == 0) {
                            System.out.println("Error: No se puede dividir por cero");
                            operacionValida = false;  // Marcamos la operación como inválida
                        } else {
                            resultado = num1 / num2;
                        }
                        break;
                    case MODULO:  // Utilizamos la constante MODULO en lugar del número 5
                        // Verificamos que no se intente calcular módulo con divisor cero
                        if (num2 == 0) {
                            System.out.println("Error: No se puede calcular módulo con divisor cero");
                            operacionValida = false;  // Marcamos la operación como inválida
                        } else {
                            resultado = num1 % num2;  // El operador % calcula el resto de la división
                        }
                        break;
                    default:  // Se ejecuta cuando la opción no coincide con ninguna de las anteriores
                        System.out.println("Opción no válida");
                        operacionValida = false;  // Marcamos la operación como inválida
                        break;
                }

                // Si la operación fue válida, mostramos el resultado
                if (operacionValida) {
                    System.out.println("Resultado: " + resultado);
                }
            }

        } while (opcion != SALIR);  // El bucle continúa mientras la opción no sea SALIR

        // Mensaje de despedida cuando el usuario decide salir
        System.out.println("¡Gracias por usar la calculadora!");
        // Cerramos el Scanner para liberar recursos
        scanner.close();
    }
}