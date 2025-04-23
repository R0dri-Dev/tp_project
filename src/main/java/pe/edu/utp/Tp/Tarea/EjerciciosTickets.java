package pe.edu.utp.Tp.Tarea;

import java.util.Scanner;

public class EjerciciosTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("BOLETO DE VIAJE INTERPROVINCIAL");

        /********************************************
         * EJERCICIO 1: BOLETO DE VIAJE INTERPROVINCIAL
         ********************************************/
        System.out.println("EJERCICIO 1: BOLETO DE VIAJE INTERPROVINCIAL");

        // Declaramos las variables que vamos a utilizar
        String nombrePasajero; // Para almacenar el nombre del pasajero (texto)
        String origen;         // Para almacenar la ciudad de origen (texto)
        String destino;        // Para almacenar la ciudad de destino (texto)
        int numeroAsiento;     // Para almacenar el número de asiento (número entero)
        double precio;         // Para almacenar el precio del boleto (número con decimales)

        // Solicitamos y leemos los datos del usuario
        System.out.print("Ingrese nombre del pasajero: ");
        nombrePasajero = scanner.nextLine(); // Lee una línea de texto completa

        System.out.print("Ingrese ciudad de origen: ");
        origen = scanner.nextLine(); // Lee una línea de texto completa

        System.out.print("Ingrese ciudad de destino: ");
        destino = scanner.nextLine(); // Lee una línea de texto completa

        System.out.print("Ingrese número de asiento: ");
        numeroAsiento = scanner.nextInt(); // Lee un número entero

        System.out.print("Ingrese precio del boleto: ");
        precio = scanner.nextDouble(); // Lee un número con decimales
        scanner.nextLine(); // Limpiamos el buffer (consumimos el salto de línea)

        // Imprimimos el boleto con formato
        System.out.println("\n---------------------------------------");
        System.out.println("        BOLETO DE VIAJE");
        System.out.println("---------------------------------------");
        // Usamos toUpperCase() para convertir el nombre a mayúsculas
        System.out.println("Pasajero: " + nombrePasajero.toUpperCase());
        // Usamos toUpperCase() para el origen y toLowerCase() para el destino
        System.out.println("Ruta: " + origen.toUpperCase() + " - " + destino.toLowerCase());
        System.out.println("Asiento: " + numeroAsiento);
        System.out.println("Precio: S/. " + precio);
        System.out.println("---------------------------------------");
    }
}
