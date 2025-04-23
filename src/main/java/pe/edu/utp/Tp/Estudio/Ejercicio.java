package pe.edu.utp.Tp.Estudio;

import java.util.Scanner;

/**
 * Clase con ejercicios básicos de Java
 * Contiene ejercicios desde operaciones básicas hasta condicionales if-else
 * Cada ejercicio está separado y explicado
 */
public class Ejercicio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // =============================================
        // EJERCICIO 1: Operaciones básicas
        // =============================================
        System.out.println("\n=== Ejercicio 1: Operaciones básicas ===");

        // Definimos variables
        int num1 = 15;
        int num2 = 7;

        // Realizamos operaciones
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        double division = (double)num1 / num2; // Conversión a double para decimales
        int modulo = num1 % num2; // Resto de la división

        // Mostramos resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + modulo);

        // =============================================
        // EJERCICIO 2: Calculadora con Scanner
        // =============================================
        System.out.println("\n=== Ejercicio 2: Calculadora con Scanner ===");

        System.out.print("Ingrese el primer número: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double b = scanner.nextDouble();

        System.out.println("\nResultados:");
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));

        // Validamos división por cero
        if (b != 0) {
            System.out.println(a + " / " + b + " = " + (a / b));
        } else {
            System.out.println("No se puede dividir por cero");
        }

        // =============================================
        // EJERCICIO 3: Par o Impar
        // =============================================
        System.out.println("\n=== Ejercicio 3: Par o Impar ===");

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " es un número PAR");
        } else {
            System.out.println(numero + " es un número IMPAR");
        }

        // =============================================
        // EJERCICIO 4: Mayor de edad
        // =============================================
        System.out.println("\n=== Ejercicio 4: Mayor de edad ===");

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Eres MAYOR de edad");
        } else {
            System.out.println("Eres MENOR de edad");
        }

        // =============================================
        // EJERCICIO 5: Calificación con letra
        // =============================================
        System.out.println("\n=== Ejercicio 5: Calificación con letra ===");

        System.out.print("Ingrese su calificación (0-100): ");
        int calificacion = scanner.nextInt();

        if (calificacion >= 90 && calificacion <= 100) {
            System.out.println("Excelente (A)");
        } else if (calificacion >= 80) {
            System.out.println("Muy bien (B)");
        } else if (calificacion >= 70) {
            System.out.println("Bien (C)");
        } else if (calificacion >= 60) {
            System.out.println("Suficiente (D)");
        } else if (calificacion >= 0) {
            System.out.println("Reprobado (F)");
        } else {
            System.out.println("Calificación no válida");
        }

        // =============================================
        // EJERCICIO 6: Día de la semana
        // =============================================
        System.out.println("\n=== Ejercicio 6: Día de la semana ===");

        System.out.print("Ingrese un número del 1 al 7: ");
        int dia = scanner.nextInt();

        switch (dia) {
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
                System.out.println("Número no válido");
        }

        // =============================================
        // EJERCICIO 7: Área de figuras geométricas
        // =============================================
        System.out.println("\n=== Ejercicio 7: Área de figuras geométricas ===");

        System.out.println("1. Área de círculo");
        System.out.println("2. Área de rectángulo");
        System.out.println("3. Área de triángulo");
        System.out.print("Seleccione una opción (1-3): ");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el radio del círculo: ");
                double radio = scanner.nextDouble();
                double areaCirculo = Math.PI * Math.pow(radio, 2);
                System.out.printf("Área del círculo: %.2f%n", areaCirculo);
                break;
            case 2:
                System.out.print("Ingrese la base del rectángulo: ");
                double baseRect = scanner.nextDouble();
                System.out.print("Ingrese la altura del rectángulo: ");
                double alturaRect = scanner.nextDouble();
                System.out.println("Área del rectángulo: " + (baseRect * alturaRect));
                break;
            case 3:
                System.out.print("Ingrese la base del triángulo: ");
                double baseTri = scanner.nextDouble();
                System.out.print("Ingrese la altura del triángulo: ");
                double alturaTri = scanner.nextDouble();
                System.out.println("Área del triángulo: " + (baseTri * alturaTri / 2));
                break;
            default:
                System.out.println("Opción no válida");
        }

        // =============================================
        // EJERCICIO 8: Número positivo, negativo o cero
        // =============================================
        System.out.println("\n=== Ejercicio 8: Número positivo, negativo o cero ===");

        System.out.print("Ingrese un número: ");
        double numeroEvaluar = scanner.nextDouble();

        if (numeroEvaluar > 0) {
            System.out.println("El número es POSITIVO");
        } else if (numeroEvaluar < 0) {
            System.out.println("El número es NEGATIVO");
        } else {
            System.out.println("El número es CERO");
        }



        // =============================================
        // EJERCICIO 9: Calculadora de IMC
        // =============================================
        System.out.println("\n=== Ejercicio 9: Calculadora de IMC ===");

        System.out.print("Ingrese su peso en kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Su IMC es: %.2f%n", imc);

        if (imc < 18.5) {
            System.out.println("Bajo peso");
        } else if (imc < 25) {
            System.out.println("Peso normal");
        } else if (imc < 30) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidad");
        }

        scanner.close();
    }
}