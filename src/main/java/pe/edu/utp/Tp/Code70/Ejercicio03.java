package pe.edu.utp.Tp.Code70;

import java.util.Scanner;

/**
 * 🛍️ Ejercicio 3: Sistema de Inventario de Tienda con estructura repetitiva FOR
 *
 * OBJETIVO DEL PROGRAMA:
 * Este programa simula un sistema de inventario para una tienda virtual que:
 * - Permite al usuario ingresar el número de productos (máximo 15)
 * - Calcula precios escalonados basados en un precio base
 * - Aplica descuentos variables según el ID del producto
 * - Genera un reporte visual en formato tabla ASCII
 * - Calcula el total estimado de ventas
 *
 * CONCEPTOS PROGRAMÁTICOS UTILIZADOS:
 * - Estructura repetitiva FOR (bucle principal)
 * - Estructura condicional IF (validación y descuentos)
 * - Operador ternario (? :) para asignación condicional
 * - Arrays (arreglo de emojis)
 * - Formateo de salida con printf()
 * - Acumuladores (totalVentas)
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        // Crear objeto Scanner para capturar entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // ═══════════════════════════════════════════════════════════════════
        // 🎨 SECCIÓN 1: INTERFAZ DE BIENVENIDA
        // ═══════════════════════════════════════════════════════════════════
        // Mostrar interfaz visual atractiva usando caracteres especiales
        // y emojis para mejorar la experiencia del usuario
        System.out.println("🌟════════════════════════════════════════🌟");
        System.out.println("           🛒 TIENDA VIRTUAL 2024 🛒        ");
        System.out.println("🌟════════════════════════════════════════🌟");

        // ═══════════════════════════════════════════════════════════════════
        // 📝 SECCIÓN 2: CAPTURA DE DATOS DEL USUARIO
        // ═══════════════════════════════════════════════════════════════════

        // Solicitar al usuario la cantidad de productos que desea procesar
        System.out.print("🔢 ¿Cuántos productos desea agregar al inventario? ");
        int numProductos = scanner.nextInt(); // Variable para almacenar número de productos

        // ═══════════════════════════════════════════════════════════════════
        // ✅ SECCIÓN 3: VALIDACIÓN DE ENTRADA (Estructura IF)
        // ═══════════════════════════════════════════════════════════════════

        // Validar si el número ingresado está dentro del rango permitido
        // Condiciones: debe ser mayor a 0 Y menor o igual a 15
        if (numProductos <= 0 || numProductos > 15) {
            // Si la validación falla, mostrar mensaje de error y terminar programa
            System.out.println("❌ Error: Ingrese entre 1 y 15 productos máximo.");
            scanner.close(); // Cerrar el scanner para liberar recursos
            return; // Terminar ejecución del programa
        }

        // Solicitar el precio base que será usado para calcular precios escalonados
        System.out.print("💰 Ingrese el precio base de los productos: $");
        double precioBase = scanner.nextDouble(); // Variable para precio base

        // ═══════════════════════════════════════════════════════════════════
        // 🎯 SECCIÓN 4: CONFIGURACIÓN DEL REPORTE
        // ═══════════════════════════════════════════════════════════════════

        // Crear encabezado visual del reporte usando caracteres ASCII especiales
        System.out.println("\n📊═══════════════════════════════════════════════════════════📊");
        System.out.println("                    📋 REPORTE DE INVENTARIO 📋                 ");
        System.out.println("📊═══════════════════════════════════════════════════════════📊");

        // Crear encabezados de las columnas de la tabla
        // | ID | Producto | Precio | Descuento | Precio Final |
        System.out.println("| 🆔 ID | 📦 Producto    | 💵 Precio  | 🎁 Descuento | 💸 Final |");
        System.out.println("═════════════════════════════════════════════════════════════════");

        // ═══════════════════════════════════════════════════════════════════
        // 🔄 SECCIÓN 5: BUCLE FOR PRINCIPAL (Estructura Repetitiva)
        // ═══════════════════════════════════════════════════════════════════

        // Array (arreglo) de emojis para representar diferentes tipos de productos
        // Cada posición corresponde a un tipo de producto tecnológico
        String[] emojis = {"📱", "💻", "🎧", "⌚", "📷", "🖥️", "⌨️", "🖱️", "📺", "🔊", "💾", "🎮", "📀", "🖨️", "📡"};

        // Variable acumuladora para calcular el total de ventas estimadas
        double totalVentas = 0;

        // BUCLE FOR: se ejecuta desde 1 hasta numProductos (inclusive)
        // i = contador/identificador del producto actual
        for (int i = 1; i <= numProductos; i++) {

            // ───────────────────────────────────────────────────────────────
            // 🧮 SUBSECCIÓN: CÁLCULOS PARA CADA PRODUCTO
            // ───────────────────────────────────────────────────────────────

            // PRECIO ESCALONADO: cada producto tiene precio diferente
            // Fórmula: precioBase * numeroProducto * 0.8
            // El factor 0.8 hace que los precios sean más realistas
            double precio = precioBase * i * 0.8;

            // DESCUENTO VARIABLE usando operador ternario anidado
            // Lógica:
            // - Si i es múltiplo de 3 (i % 3 == 0) → descuento 15%
            // - Si i es múltiplo de 2 (i % 2 == 0) → descuento 10%
            // - En cualquier otro caso → descuento 5%
            int descuento = (i % 3 == 0) ? 15 : (i % 2 == 0) ? 10 : 5;

            // PRECIO FINAL después de aplicar descuento
            // Fórmula: precio - (precio * porcentajeDescuento / 100)
            double precioFinal = precio - (precio * descuento / 100);

            // ACUMULAR el precio final al total de ventas estimadas
            totalVentas += precioFinal;

            // ───────────────────────────────────────────────────────────────
            // 🖨️ SUBSECCIÓN: MOSTRAR FILA DEL PRODUCTO
            // ───────────────────────────────────────────────────────────────

            // printf() permite formatear la salida de manera precisa
            // Formato de cada campo:
            // %3d    = entero con ancho mínimo de 3 caracteres (ID)
            // %s     = cadena de texto (emoji del producto)
            // %02d   = entero con 2 dígitos, rellenando con 0 si es necesario
            // %7.2f  = número decimal con ancho 7 y 2 decimales (precios)
            // %8d    = entero con ancho mínimo de 8 caracteres (descuento)
            System.out.printf("| %3d  | %s Prod-%02d    | $%7.2f | %8d%% | $%7.2f |\n",
                    i,                    // ID del producto
                    emojis[i-1],         // Emoji (i-1 porque arrays inician en 0)
                    i,                   // Número del producto
                    precio,              // Precio antes del descuento
                    descuento,           // Porcentaje de descuento
                    precioFinal          // Precio final después del descuento
            );
        } // FIN DEL BUCLE FOR

        // ═══════════════════════════════════════════════════════════════════
        // 📈 SECCIÓN 6: RESUMEN FINAL Y CIERRE
        // ═══════════════════════════════════════════════════════════════════

        // Línea separadora para cerrar la tabla
        System.out.println("═════════════════════════════════════════════════════════════════");

        // Mostrar el total acumulado de todas las ventas estimadas
        // %.2f formatea el número con exactamente 2 decimales
        System.out.printf("💰 TOTAL ESTIMADO DE VENTAS: $%.2f\n", totalVentas);

        // Mensajes de confirmación y cierre visual
        System.out.println("✅ ¡Inventario generado exitosamente! 🎉");
        System.out.println("🌟════════════════════════════════════════🌟");

        // Cerrar el objeto Scanner para liberar recursos del sistema
        // Buena práctica de programación para evitar memory leaks
        scanner.close();

    }
}
