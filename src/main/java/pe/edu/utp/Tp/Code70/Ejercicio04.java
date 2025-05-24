package pe.edu.utp.Tp.Code70;

import java.util.Scanner;

/**
 * 🍕 Ejercicio 4: Sistema de Pedidos de Restaurante con anidamiento de estructuras
 * Genera menús y calcula totales usando bucles FOR anidados
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 🎨 Interfaz de restaurante
        System.out.println("🍴═══════════════════════════════════════════🍴");
        System.out.println("        🍕 RESTAURANTE CÓDIGO FELIZ 🍕        ");
        System.out.println("🍴═══════════════════════════════════════════🍴");

        // 📝 Solicitar información del pedido
        System.out.print("👥 ¿Para cuántas mesas desea generar menús? ");
        int numMesas = scanner.nextInt();
        System.out.print("🍽️ ¿Cuántos platos por mesa? ");
        int platosXMesa = scanner.nextInt();

        // ✅ Validación con IF
        if (numMesas <= 0 || numMesas > 8 || platosXMesa <= 0 || platosXMesa > 6) {
            System.out.println("❌ Error: Máximo 8 mesas y 6 platos por mesa.");
            scanner.close();
            return;
        }

        // 🏷️ Arrays de productos y precios
        String[] comidas = {"🍕Pizza", "🍔Burger", "🌮Tacos", "🍝Pasta", "🥗Ensalada", "🍗Pollo"};
        double[] precios = {12.50, 8.75, 6.25, 10.00, 7.50, 11.25};
        double granTotal = 0;

        System.out.println("\n🧾════════════════════════════════════════════════════════🧾");
        System.out.println("                    📋 PEDIDOS DEL DÍA 📋                   ");
        System.out.println("🧾════════════════════════════════════════════════════════🧾");

        // 🔄 BUCLE EXTERNO: Para cada mesa (ANIDAMIENTO NIVEL 1)
        for (int mesa = 1; mesa <= numMesas; mesa++) {
            System.out.println("\n🪑 MESA #" + mesa + " " + "═".repeat(35));
            double totalMesa = 0;

            // 🔄 BUCLE INTERNO: Para cada plato de la mesa (ANIDAMIENTO NIVEL 2)
            for (int plato = 1; plato <= platosXMesa; plato++) {
                // 🎲 Selección aleatoria de comida (simulación)
                int indiceComida = (mesa + plato - 1) % comidas.length;
                String comidaSeleccionada = comidas[indiceComida];
                double precio = precios[indiceComida];

                // 🎁 Descuento especial por cantidad
                if (plato > 3) precio *= 0.9; // 10% descuento desde el 4to plato

                totalMesa += precio;

                // 🖨️ Mostrar cada plato
                System.out.printf("   %d. %s - $%.2f", plato, comidaSeleccionada, precio);
                if (plato > 3) System.out.print(" 🎁(-10%)");
                System.out.println();
            }

            // 💰 Total por mesa
            granTotal += totalMesa;
            System.out.printf("💳 Total Mesa #%d: $%.2f\n", mesa, totalMesa);
        }

        // 📊 Resumen final del restaurante
        System.out.println("\n🏆════════════════════════════════════════════════════════🏆");
        System.out.printf("🍽️ Total de mesas atendidas: %d\n", numMesas);
        System.out.printf("📦 Total de platos servidos: %d\n", numMesas * platosXMesa);
        System.out.printf("💰 GRAN TOTAL DEL DÍA: $%.2f\n", granTotal);
        System.out.printf("📈 Promedio por mesa: $%.2f\n", granTotal / numMesas);
        System.out.println("🎉 ¡Servicio completado exitosamente! ✨");
        System.out.println("🍴═══════════════════════════════════════════🍴");

        scanner.close();
    }
}