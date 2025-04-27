package pe.edu.utp.Tp.semana05;

// Importamos la clase Scanner del paquete java.util para poder leer la entrada del usuario
import java.util.Scanner;

public class Ejercicio01 {

    /*
    Escribir un programa en java que muestre un menu de opciones y realize
    operaciones de acuerdo a condiciones dentro de una estructura switch. La
    variable por evaluar debe ser de tipo short.
     */

    public static void main(String[] args) {
        // Creamos un objeto Scanner que nos permitirá leer datos introducidos por el usuario desde la consola
        // System.in representa la entrada estándar (el teclado)
        Scanner scanner = new Scanner(System.in);

        // Declaramos una variable de tipo short que almacenará la opción elegida por el usuario
        // El tipo short es un entero de 16 bits con rango desde -32,768 hasta 32,767
        // Esto cumple con el requisito del ejercicio de usar una variable de tipo short en el switch
        short opcion;

        // A continuación, mostramos el menú de opciones al usuario mediante System.out.println()
        // que imprime texto en la consola y añade un salto de línea al final
        System.out.println("===== MENÚ DE OPCIONES =====");
        System.out.println("1. Calcular el área de un cuadrado");
        System.out.println("2. Calcular el área de un triángulo");
        System.out.println("3. Calcular el área de un círculo");
        System.out.println("4. Verificar si un número es par o impar");
        System.out.println("5. Salir");

        // System.out.print() muestra texto sin añadir salto de línea al final
        // Esto permite que la entrada del usuario aparezca en la misma línea que el mensaje
        System.out.print("\nSeleccione una opción (1-5): ");

        // Leemos el valor introducido por el usuario con scanner.nextShort()
        // Este método captura un número de tipo short desde la entrada del usuario
        opcion = scanner.nextShort();

        // La estructura switch evalúa el valor de 'opcion' y ejecuta el bloque de código
        // correspondiente al caso (case) que coincida con dicho valor
        switch (opcion) {
            // Caso 1: Calcular el área de un cuadrado
            case 1:
                // Solicitamos el lado del cuadrado
                System.out.print("Ingrese el lado del cuadrado: ");
                // Leemos un valor de tipo double (número decimal) introducido por el usuario
                double lado = scanner.nextDouble();
                // Calculamos el área del cuadrado (lado * lado)
                double areaCuadrado = lado * lado;
                // Mostramos el resultado
                System.out.println("El área del cuadrado es: " + areaCuadrado);
                // La sentencia break finaliza la ejecución del switch
                // Sin ella, se ejecutarían también los casos siguientes
                break;

            // Caso 2: Calcular el área de un triángulo
            case 2:
                // Solicitamos la base del triángulo
                System.out.print("Ingrese la base del triángulo: ");
                double base = scanner.nextDouble();
                // Solicitamos la altura del triángulo
                System.out.print("Ingrese la altura del triángulo: ");
                double altura = scanner.nextDouble();
                // Calculamos el área del triángulo ((base * altura) / 2)
                double areaTriangulo = (base * altura) / 2;
                // Mostramos el resultado
                System.out.println("El área del triángulo es: " + areaTriangulo);
                break;

            // Caso 3: Calcular el área de un círculo
            case 3:
                // Solicitamos el radio del círculo
                System.out.print("Ingrese el radio del círculo: ");
                double radio = scanner.nextDouble();
                // Calculamos el área del círculo (π * r²)
                // Math.PI es una constante que representa el valor de π (pi)
                double areaCirculo = Math.PI * radio * radio;
                // Mostramos el resultado
                System.out.println("El área del círculo es: " + areaCirculo);
                break;

            // Caso 4: Verificar si un número es par o impar
            case 4:
                // Solicitamos un número entero
                System.out.print("Ingrese un número: ");
                int numero = scanner.nextInt();
                // Verificamos si el número es par usando el operador módulo (%)
                // Si el resto de dividir por 2 es 0, el número es par
                if (numero % 2 == 0) {
                    System.out.println("El número " + numero + " es par.");
                } else {
                    // Si no, el número es impar
                    System.out.println("El número " + numero + " es impar.");
                }
                break;

            // Caso 5: Salir del programa
            case 5:
                // Mostramos un mensaje de despedida
                System.out.println("Gracias por usar el programa. ¡Hasta luego!");
                break;

            // El caso default se ejecuta cuando el valor de 'opcion' no coincide con ninguno de los casos anteriores
            // Es una buena práctica incluir siempre un caso default para manejar entradas inesperadas
            default:
                System.out.println("Opción no válida. Por favor, seleccione una opción entre 1 y 5.");
                break;
        }

        // Es una buena práctica cerrar el objeto Scanner cuando ya no lo necesitamos
        // Esto libera los recursos del sistema asociados a él
        scanner.close();
    }
}