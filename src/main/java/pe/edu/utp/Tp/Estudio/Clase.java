package pe.edu.utp.Tp.Estudio;

/**
 * Clase de estudio de Java básico
 * Contiene:
 * - Definición de variables
 * - Uso de Scanner para entrada de datos
 * - Impresión por consola (con y sin formato)
 * - Estructuras condicionales
 */
public class Clase {

    public static void main(String[] args) {

        // =============================================
        // 1. DEFINICIÓN DE VARIABLES EN JAVA
        // =============================================

        // Variables primitivas (almacenan valores directamente)


        // Enteros
        byte edad = 25;             // 8 bits (-128 a 127)
        short cantidad = 1000;      // 16 bits (-32,768 a 32,767)
        int numero = 2147483647;    // 32 bits (-2^31 a 2^31-1) - el más usado
        long grande = 9223372036854775807L; // 64 bits (necesita L al final)

        // Decimales
        float precio = 19.99f;     // 32 bits (necesita f al final)
        double total = 12345.6789;  // 64 bits - más precisión que float

        // Caracteres
        char letra = 'A';          // 16 bits (unicode)

        // Booleanos
        boolean esVerdadero = true; // true o false

        // Variables de referencia (almacenan direcciones de memoria)
        String nombre = "Cinthia Sandoval"; // Cadena de caracteres (no es primitivo)

        // Constantes (no cambian su valor)
        final double PI = 3.141592653589793;




        // =============================================
        // 2. ENTRADA DE DATOS CON SCANNER
        // =============================================
        // Para usar Scanner necesitamos importar la clase
        // (Esta línea va al inicio del archivo: import java.util.Scanner;)

        // Crear un objeto Scanner para leer entrada
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("\n=== Ejemplo de Scanner ===");

        System.out.print("Ingrese su nombre: ");
        String nombreUsuario = scanner.nextLine(); // Lee una línea completa

        System.out.print("Ingrese su edad: ");
        int edadUsuario = scanner.nextInt(); // Lee un entero

        System.out.print("Ingrese su altura en metros (ej. 1.75): ");
        double alturaUsuario = scanner.nextDouble(); // Lee un double

        System.out.println("\nDatos ingresados:");
        System.out.println("Nombre: " + nombreUsuario);
        System.out.println("Edad: " + edadUsuario);
        System.out.println("Altura: " + alturaUsuario);

        // Es buena práctica cerrar el scanner cuando ya no se usa
        scanner.close();




        // =============================================
        // 3. IMPRESIÓN POR CONSOLA
        // =============================================

        // Impresión básica (println agrega salto de línea al final)
        System.out.println("\n=== Ejemplos de impresión ===");
        System.out.println("Hola Mundo!"); // Con salto de línea
        System.out.print("Texto ");        // Sin salto de línea
        System.out.print("en la misma línea\n"); // \n es salto de línea manual

        // Concatenación de variables
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);

        // Impresión con formato (printf)
        // %s - String, %d - entero, %f - decimal, %n - salto de línea
        System.out.printf("\n== Datos formateados ==%n");
        System.out.printf("Nombre: %s, Edad: %d años%n", nombre, edad);
        System.out.printf("Precio: %.2f (con 2 decimales)%n", precio);
        System.out.printf("Número grande: %,d%n", 1000000); // Con separador de miles




        // =============================================
        // 4. ESTRUCTURAS CONDICIONALES
        // =============================================

        System.out.println("\n=== Ejemplos de condicionales ===");

        // Condicional simple (if)
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        }

        // Condicional if-else
        if (edad < 18) {
            System.out.println("Eres menor de edad");
        } else {
            System.out.println("Eres mayor de edad");
        }

        // Condicional else-if (varias condiciones)
        System.out.print("\nEvaluando calificación: ");
        int calificacion = 85;

        if (calificacion >= 90) {
            System.out.println("Excelente (A)");
        } else if (calificacion >= 80) {
            System.out.println("Muy bien (B)");
        } else if (calificacion >= 70) {
            System.out.println("Bien (C)");
        } else if (calificacion >= 60) {
            System.out.println("Suficiente (D)");
        } else {
            System.out.println("Reprobado (F)");
        }

        // Condicional switch (para múltiples casos)
        System.out.print("\nDía de la semana: ");
        int diaSemana = 3;

        switch (diaSemana) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número de día inválido");
        }

        // Operador ternario (if-else en una línea)
        String estado = (edad >= 18) ? "Mayor" : "Menor";
        System.out.println("\nEstado (ternario): " + estado);
    }
}