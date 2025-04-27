package pe.edu.utp.Tp.semana05;

// Importamos la clase Scanner del paquete java.util para recibir entrada del usuario
import java.util.Scanner;

public class Ejercicio02 {
    /*
    Escribe un programa en java que haga uso de switch mejorado y utilize
    agrupamiento de opciones. La variable por evaluar debe ser de tipo char
     */

    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Mostramos el título del primer ejemplo
        System.out.println("=== CLASIFICADOR DE CARACTERES ===");
        System.out.println("Ingrese un carácter: ");

        // Leemos un texto y obtenemos solo el primer carácter
        // charAt(0) devuelve el carácter en la posición 0 (el primero) del texto ingresado
        char caracter = scanner.next().charAt(0);

        // Utilizamos el switch mejorado (introducido en Java 12 y mejorado en Java 14)
        // La sintaxis con -> permite un código más conciso
        // El resultado del switch se asigna directamente a la variable 'resultado'
        String resultado = switch (caracter) {
            // Agrupamiento de opciones: todos estos casos retornan el mismo valor
            // Esto evalúa si el carácter es alguna de las vocales mayúsculas
            case 'A', 'E', 'I', 'O', 'U' -> "Vocal mayúscula";

            // Agrupamiento de vocales minúsculas
            // Si el carácter es 'a', 'e', 'i', 'o' o 'u', retorna "Vocal minúscula"
            case 'a', 'e', 'i', 'o', 'u' -> "Vocal minúscula";

            // Agrupamiento de dígitos numéricos del 0 al 9
            // Esta es una forma eficiente de agrupar rangos de caracteres similares
            case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> "Dígito numérico";

            // Agrupamiento de operadores matemáticos básicos
            // Nótese que cada carácter va entre comillas simples porque son de tipo char
            case '+', '-', '*', '/' -> "Operador matemático básico";

            // Agrupamiento de signos de puntuación comunes
            case '.', ',', ';', ':' -> "Signo de puntuación";

            // El caso default se ejecuta cuando el carácter no coincide con ninguno de los anteriores
            // Es buena práctica incluir siempre un caso default para manejar entradas imprevistas
            default -> "Otro tipo de carácter";
        };

        // Mostramos el resultado de la clasificación
        System.out.println("El carácter '" + caracter + "' es: " + resultado);

        // Comenzamos un segundo ejemplo para mostrar otra forma de uso del switch mejorado
        System.out.println("\n=== EVALUACIÓN DE CALIFICACIÓN ===");
        System.out.println("Ingrese una calificación (A-F): ");

        // Leemos un carácter y lo convertimos a mayúscula con toUpperCase()
        // Esto permite que el usuario ingrese tanto 'a' como 'A' y ambos funcionen igual
        char calificacion = scanner.next().toUpperCase().charAt(0);

        // Otro switch mejorado que evalúa la calificación
        String mensaje = switch (calificacion) {
            // Casos individuales
            case 'A' -> "Excelente";
            case 'B' -> "Muy bueno";
            case 'C' -> "Bueno";

            // Ejemplo de agrupamiento: 'D' y 'E' producen el mismo resultado
            // Esto muestra cómo se pueden combinar múltiples calificaciones en un solo grupo
            case 'D', 'E' -> "Necesita mejorar";

            case 'F' -> "Reprobado";

            // Cualquier otro carácter que no sea A, B, C, D, E o F
            default -> "Calificación no válida";
        };

        // Mostramos el resultado de la evaluación
        System.out.println("La calificación " + calificacion + " significa: " + mensaje);

        // Cerramos el Scanner para liberar recursos
        // Esta es una buena práctica para evitar memory leaks (fugas de memoria)
        scanner.close();
    }
}