package pe.edu.utp.Tp.Tarea;

import java.util.Scanner;

public class EjercicioOperacionBancaria {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("TICKET BANCARIO");

        /********************************************
         * EJERCICIO 3: TICKET DE OPERACIÓN BANCARIA
         ********************************************/
        System.out.println("\nEJERCICIO 3: TICKET BANCARIO");
        scanner.nextLine(); // Limpiamos el buffer (consumimos el salto de línea)

        // Declaramos las variables que vamos a utilizar
        String tipoOperacion;  // Para almacenar el tipo de operación (texto)
        String nombreCliente;  // Para almacenar el nombre del cliente (texto)
        long numeroCuenta;     // Para almacenar el número de cuenta (número entero largo)
        double monto;          // Para almacenar el monto de la operación (número con decimales)
        double saldo;          // Para almacenar el saldo actual (número con decimales)

        // Solicitamos y leemos los datos del usuario
        System.out.print("Ingrese nombre del cliente: ");
        nombreCliente = scanner.nextLine(); // Lee una línea de texto completa

        System.out.print("Ingrese número de cuenta: ");
        numeroCuenta = scanner.nextLong(); // Lee un número entero largo
        scanner.nextLine(); // Limpiamos el buffer (consumimos el salto de línea)

        System.out.print("Ingrese tipo de operación (Depósito/Retiro): ");
        tipoOperacion = scanner.nextLine(); // Lee una línea de texto completa

        System.out.print("Ingrese monto: ");
        monto = scanner.nextDouble(); // Lee un número con decimales

        System.out.print("Ingrese saldo actual: ");
        saldo = scanner.nextDouble(); // Lee un número con decimales

        // Calculamos el nuevo saldo según el tipo de operación
        double nuevoSaldo;
        // Usamos una estructura condicional if-else para determinar la operación
        if (tipoOperacion.equalsIgnoreCase("Depósito")) {
            // Si es un depósito, sumamos el monto al saldo
            nuevoSaldo = saldo + monto;
        } else {
            // Si es un retiro, restamos el monto al saldo
            nuevoSaldo = saldo - monto;
        }

        // Imprimimos el ticket bancario con formato
        System.out.println("\n---------------------------------------");
        System.out.println("        TICKET BANCARIO");
        System.out.println("---------------------------------------");
        // Usamos toUpperCase() para convertir el nombre del cliente a mayúsculas
        System.out.println("Cliente: " + nombreCliente.toUpperCase());
        System.out.println("Cuenta: " + numeroCuenta);
        // Usamos toLowerCase() para convertir el tipo de operación a minúsculas
        System.out.println("Operación: " + tipoOperacion.toLowerCase());
        System.out.println("Monto: S/. " + monto);
        System.out.println("Saldo anterior: S/. " + saldo);
        System.out.println("Nuevo saldo: S/. " + nuevoSaldo);
        System.out.println("---------------------------------------");
    }

}
