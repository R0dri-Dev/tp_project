package pe.edu.utp.Tp.Tarea;

import java.util.Scanner;

public class EjercicioBoletaPago {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        System.out.println("BOLETA DE PAGO");

        // Declaramos las variables que vamos a utilizar
        String nombreProducto;      // Para almacenar el nombre del producto (texto)
        int cantidad;               // Para almacenar la cantidad de productos (número entero)
        double precioUnitario;      // Para almacenar el precio unitario (número con decimales)
        float porcentajeDescuento;  // Para almacenar el porcentaje de descuento (número con decimales)

        // Solicitamos y leemos los datos del usuario
        System.out.print("Ingrese nombre del producto: ");
        nombreProducto = scanner.nextLine(); // Lee una línea de texto completa

        System.out.print("Ingrese cantidad: ");
        cantidad = scanner.nextInt(); // Lee un número entero

        System.out.print("Ingrese precio unitario: ");
        precioUnitario = scanner.nextDouble(); // Lee un número con decimales

        System.out.print("Ingrese porcentaje de descuento: ");
        porcentajeDescuento = scanner.nextFloat(); // Lee un número con decimales

        // Realizamos los cálculos para la boleta
        double subtotal = cantidad * precioUnitario; // Multiplicamos cantidad por precio
        double descuento = subtotal * (porcentajeDescuento / 100); // Calculamos el descuento
        double total = subtotal - descuento; // Restamos el descuento al subtotal

        // Imprimimos la boleta con formato
        System.out.println("\n---------------------------------------");
        System.out.println("        BOLETA DE PAGO");
        System.out.println("---------------------------------------");
        // Usamos toUpperCase() para convertir el nombre del producto a mayúsculas
        System.out.println("Producto: " + nombreProducto.toUpperCase());
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: S/. " + precioUnitario);
        System.out.println("Subtotal: S/. " + subtotal);
        System.out.println("Descuento (" + porcentajeDescuento + "%): S/. " + descuento);
        System.out.println("Total: S/. " + total);
        System.out.println("---------------------------------------");
    }
}
