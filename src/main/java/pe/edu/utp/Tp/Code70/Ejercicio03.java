package pe.edu.utp.Tp.Code70;

import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("🌟════════════════════════════════════════🌟");
        System.out.println("           🛒 TIENDA VIRTUAL 2024 🛒        ");
        System.out.println("🌟════════════════════════════════════════🌟");


        System.out.print("🔢 ¿Cuántos productos desea agregar al inventario? ");
        int numProductos = scanner.nextInt();

        if (numProductos <= 0 || numProductos > 15) {

            System.out.println("❌ Error: Ingrese entre 1 y 15 productos máximo.");
            scanner.close();
            return;
        }

        System.out.print("💰 Ingrese el precio base de los productos: $");
        double precioBase = scanner.nextDouble();

        System.out.println("\n📊═══════════════════════════════════════════════════════════📊");
        System.out.println("                    📋 REPORTE DE INVENTARIO 📋                 ");
        System.out.println("📊═══════════════════════════════════════════════════════════📊");

        System.out.println("| 🆔 ID | 📦 Producto    | 💵 Precio  | 🎁 Descuento | 💸 Final |");
        System.out.println("═════════════════════════════════════════════════════════════════");

        String[] emojis = {"📱", "💻", "🎧", "⌚", "📷", "🖥️", "⌨️", "🖱️", "📺", "🔊", "💾", "🎮", "📀", "🖨️", "📡"};

        double totalVentas = 0;
        for (int i = 1; i <= numProductos; i++) {

            double precio = precioBase * i * 0.8;

            int descuento = (i % 3 == 0) ? 15 : (i % 2 == 0) ? 10 : 5;

            double precioFinal = precio - (precio * descuento / 100);

            totalVentas += precioFinal;
            System.out.printf("| %3d  | %s Prod-%02d    | $%7.2f | %8d%% | $%7.2f |\n",
                    i,
                    emojis[i-1],
                    i,
                    precio,
                    descuento,
                    precioFinal
            );
        }

        System.out.println("═════════════════════════════════════════════════════════════════");


        System.out.printf("💰 TOTAL ESTIMADO DE VENTAS: $%.2f\n", totalVentas);


        System.out.println("✅ ¡Inventario generado exitosamente! 🎉");
        System.out.println("🌟════════════════════════════════════════🌟");


        scanner.close();

    }
}
