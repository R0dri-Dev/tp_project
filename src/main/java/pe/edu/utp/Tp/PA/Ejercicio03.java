package pe.edu.utp.Tp.PA;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {

        // Ejercicio 03: Reporte de Ventas Mensual
        // Este programa genera un reporte completo de ventas mensuales para una empresa
        // Incluye análisis de ventas por mes, por producto y recomendaciones

        // Creamos el objeto Scanner para leer datos del usuario
        Scanner scanner = new Scanner(System.in);

        // ═══════════════════════════════════════════════════════════════
        // SECCIÓN 1: PRESENTACIÓN DEL PROGRAMA
        // ═══════════════════════════════════════════════════════════════

        // Mostramos un encabezado atractivo usando caracteres especiales
        System.out.println("╔══════════════════════════════════════════════════════════════════╗");
        System.out.println("║                    🎯 REPORTE DE VENTAS MENSUAL 🎯                ║");
        System.out.println("╠══════════════════════════════════════════════════════════════════╣");
        System.out.println("║                        Empresa TechSolutions                     ║");
        System.out.println("╚══════════════════════════════════════════════════════════════════╝");
        System.out.println();

        // ═══════════════════════════════════════════════════════════════
        // SECCIÓN 2: CONFIGURACIÓN INICIAL
        // ═══════════════════════════════════════════════════════════════

        System.out.println("🔧 CONFIGURACIÓN INICIAL DEL SISTEMA");
        System.out.println("═══════════════════════════════════════");

        // Pedimos el nombre de la empresa
        System.out.print("📝 Ingrese el nombre de la empresa: ");
        String nombreEmpresa = scanner.nextLine(); // nextLine() lee toda la línea incluyendo espacios

        // Pedimos cuántos meses se van a registrar (validación entre 1 y 12)
        System.out.print("📅 ¿Cuántos meses desea registrar? (1-12): ");
        int numMeses = scanner.nextInt(); // nextInt() lee solo números enteros

        // VALIDACIÓN: Si el número está fuera del rango, usar 12 por defecto
        if (numMeses < 1 || numMeses > 12) {
            numMeses = 12;
            System.out.println("⚠️  Número inválido. Se usarán 12 meses por defecto.");
        }

        // Array con los nombres de los meses (índice 0 = Enero, 1 = Febrero, etc.)
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        // Array para almacenar las ventas de cada mes (tipo double para decimales)
        double[] ventas = new double[numMeses];

        // ═══════════════════════════════════════════════════════════════
        // SECCIÓN 3: INGRESO DE VENTAS MENSUALES
        // ═══════════════════════════════════════════════════════════════

        System.out.println("\n💰 INGRESO DE VENTAS MENSUALES");
        System.out.println("════════════════════════════════");

        // Bucle for para ingresar las ventas de cada mes
        for (int i = 0; i < numMeses; i++) {
            System.out.printf("💵 Ventas de %s: $", meses[i]); // printf permite formatear la salida
            ventas[i] = scanner.nextDouble(); // Almacenamos en la posición i del array

            // VALIDACIÓN: Las ventas no pueden ser negativas
            if (ventas[i] < 0) {
                System.out.println("⚠️  Las ventas no pueden ser negativas. Intente nuevamente.");
                i--; // Decrementamos i para repetir la misma iteración
                continue; // Salta al siguiente ciclo del bucle
            }
        }

        // ═══════════════════════════════════════════════════════════════
        // SECCIÓN 4: CONFIGURACIÓN DE PRODUCTOS
        // ═══════════════════════════════════════════════════════════════

        // Pedimos cuántos productos se van a registrar (validación entre 1 y 10)
        System.out.print("\n📦 ¿Cuántos productos desea registrar? (1-10): ");
        int numProductos = scanner.nextInt();
        scanner.nextLine(); // Limpiamos el buffer después de nextInt()

        // VALIDACIÓN: Si el número está fuera del rango, usar 4 por defecto
        if (numProductos < 1 || numProductos > 10) {
            numProductos = 4;
            System.out.println("⚠️  Número inválido. Se usarán 4 productos por defecto.");
        }

        // Array para almacenar los nombres de los productos
        String[] productos = new String[numProductos];

        // Array bidimensional: [productos][meses] - cada fila es un producto, cada columna un mes
        int[][] ventasPorProducto = new int[numProductos][numMeses];

        // ═══════════════════════════════════════════════════════════════
        // SECCIÓN 5: INGRESO DE DATOS POR PRODUCTO
        // ═══════════════════════════════════════════════════════════════

        System.out.println("\n🏷️  REGISTRO DE PRODUCTOS Y VENTAS");
        System.out.println("═══════════════════════════════════");

        // Bucle anidado: para cada producto, ingresar ventas de todos los meses
        for (int prod = 0; prod < numProductos; prod++) {
            // Ingresamos el nombre del producto
            System.out.printf("📱 Nombre del producto %d: ", (prod + 1));
            productos[prod] = scanner.nextLine();

            System.out.printf("📊 Ventas mensuales para %s:\n", productos[prod]);

            // Para cada producto, ingresamos las ventas de cada mes
            for (int mes = 0; mes < numMeses; mes++) {
                System.out.printf("   %s: ", meses[mes]);
                ventasPorProducto[prod][mes] = scanner.nextInt(); // [producto actual][mes actual]

                // VALIDACIÓN: Las ventas no pueden ser negativas
                if (ventasPorProducto[prod][mes] < 0) {
                    System.out.println("   ⚠️  Las ventas no pueden ser negativas. Intente nuevamente.");
                    mes--; // Repetir el mismo mes
                    continue;
                }
            }
            scanner.nextLine(); // Limpiar buffer
            System.out.println();
        }

        // ═══════════════════════════════════════════════════════════════
        // SECCIÓN 6: GENERACIÓN DEL REPORTE - ENCABEZADO
        // ═══════════════════════════════════════════════════════════════

        System.out.println("\n" + "=".repeat(70)); // repeat(70) crea una línea de 70 signos =
        System.out.println("🔄 GENERANDO REPORTE...");
        System.out.println("=".repeat(70) + "\n");

        // Encabezado del reporte con el nombre de la empresa
        System.out.println("╔══════════════════════════════════════════════════════════════════╗");
        System.out.printf("║                    🏢 %-30s 🏢                ║%n", nombreEmpresa.toUpperCase());
        System.out.println("╠══════════════════════════════════════════════════════════════════╣");
        System.out.println("║                      📊 REPORTE DE VENTAS                        ║");
        System.out.println("╚══════════════════════════════════════════════════════════════════╝");
        System.out.println();

        // ═══════════════════════════════════════════════════════════════
        // SECCIÓN 7: ANÁLISIS DE VENTAS MENSUALES
        // ═══════════════════════════════════════════════════════════════

        System.out.println("┌─────────────────────────────────────────────────────────────────┐");
        System.out.println("│                    📊 RESUMEN ANUAL DE VENTAS                   │");
        System.out.println("├─────────────────────────────────────────────────────────────────┤");

        // Variables para calcular estadísticas
        double totalAnual = 0;      // Suma de todas las ventas
        String mejorMes = "";       // Nombre del mes con mejores ventas
        double mejorVenta = 0;      // Cantidad de la mejor venta

        // Recorremos cada mes para calcular estadísticas y mostrar resultados
        for (int i = 0; i < numMeses; i++) {
            totalAnual += ventas[i]; // Sumamos al total anual

            // Encontramos el mes con mejores ventas
            if (ventas[i] > mejorVenta) {
                mejorVenta = ventas[i];
                mejorMes = meses[i];
            }

            // SISTEMA DE CATEGORIZACIÓN por rango de ventas
            String categoria;
            String emoji;
            if (ventas[i] >= 25000) {
                categoria = "EXCELENTE";
                emoji = "🔥";
            } else if (ventas[i] >= 20000) {
                categoria = "BUENO";
                emoji = "✅";
            } else if (ventas[i] >= 15000) {
                categoria = "REGULAR";
                emoji = "⚠️";
            } else {
                categoria = "BAJO";
                emoji = "❌";
            }

            // Mostramos la información del mes con formato
            System.out.printf("│ %-12s │ $%,8.0f │ %-9s %s │",
                    meses[i], ventas[i], categoria, emoji);
            // %-12s: texto alineado a la izquierda en 12 caracteres
            // %,8.0f: número con comas como separadores en 8 caracteres sin decimales

            // GRÁFICO DE BARRAS: cada 2000 en ventas = una barra
            int barras = (int)(ventas[i] / 2000); // División entera
            for (int j = 0; j < barras && j < 15; j++) { // Máximo 15 barras
                System.out.print("█"); // Carácter de barra sólida
            }
            System.out.println();
        }

        // Mostramos las estadísticas finales
        System.out.println("├─────────────────────────────────────────────────────────────────┤");
        System.out.printf("│ TOTAL ANUAL:     $%,10.0f                              │%n", totalAnual);
        System.out.printf("│ PROMEDIO MENSUAL: $%,9.0f                              │%n", totalAnual/numMeses);
        System.out.printf("│ MEJOR MES:       %-12s ($%,8.0f)                 │%n", mejorMes, mejorVenta);
        System.out.println("└─────────────────────────────────────────────────────────────────┘");
        System.out.println();

        // ═══════════════════════════════════════════════════════════════
        // SECCIÓN 8: ANÁLISIS POR PRODUCTO
        // ═══════════════════════════════════════════════════════════════

        System.out.println("┌─────────────────────────────────────────────────────────────────┐");
        System.out.println("│                  📱 VENTAS POR PRODUCTO                         │");
        System.out.println("├─────────────────────────────────────────────────────────────────┤");

        // Analizamos cada producto individualmente
        for (int prod = 0; prod < numProductos; prod++) {
            System.out.printf("│ 🏷️  %-15s                                      │%n", productos[prod]);
            System.out.println("├─────────────────────────────────────────────────────────────────┤");

            int totalProducto = 0; // Total de ventas de este producto

            // Recorremos los meses para este producto
            for (int mes = 0; mes < numMeses; mes++) {
                totalProducto += ventasPorProducto[prod][mes];

                // ANÁLISIS TRIMESTRAL: cada 3 meses o al final
                if ((mes + 1) % 3 == 0 || mes == numMeses - 1) {
                    // Calculamos el inicio del trimestre
                    int inicioTrimestre = Math.max(0, mes - 2); // No menos que 0
                    int ventasTrimestre = 0;

                    // Sumamos las ventas del trimestre
                    for (int t = inicioTrimestre; t <= mes; t++) {
                        ventasTrimestre += ventasPorProducto[prod][t];
                    }

                    // Determinamos el número del período
                    int periodoNum = (mes / 3) + 1;
                    System.out.printf("│   P%d: %3d unidades │", periodoNum, ventasTrimestre);

                    // GRÁFICO DE BARRAS para el trimestre: cada 10 unidades = una barra
                    int barrasTrim = ventasTrimestre / 10;
                    for (int b = 0; b < barrasTrim && b < 20; b++) { // Máximo 20 barras
                        System.out.print("▓"); // Carácter de barra rayada
                    }
                    System.out.println();
                }
            }

            // Mostramos el total anual del producto
            System.out.printf("│   📊 TOTAL ANUAL: %3d unidades                            │%n", totalProducto);
            System.out.println("├─────────────────────────────────────────────────────────────────┤");
        }

        System.out.println("└─────────────────────────────────────────────────────────────────┘");
        System.out.println();

        // ═══════════════════════════════════════════════════════════════
        // SECCIÓN 9: SISTEMA DE RECOMENDACIONES
        // ═══════════════════════════════════════════════════════════════

        System.out.println("┌─────────────────────────────────────────────────────────────────┐");
        System.out.println("│                    💡 RECOMENDACIONES                           │");
        System.out.println("├─────────────────────────────────────────────────────────────────┤");

        // Calculamos el promedio mensual
        double promedioMensual = totalAnual / numMeses;
        int nivelRendimiento; // Variable para clasificar el rendimiento

        // SISTEMA DE CLASIFICACIÓN basado en el promedio mensual
        if (promedioMensual >= 25000) {
            nivelRendimiento = 3; // Alto
        } else if (promedioMensual >= 20000) {
            nivelRendimiento = 2; // Medio
        } else {
            nivelRendimiento = 1; // Bajo
        }

        // SWITCH para mostrar recomendaciones específicas según el nivel
        switch (nivelRendimiento) {
            case 3: // Rendimiento Alto
                System.out.println("│ 🌟 RENDIMIENTO ALTO:                                          │");
                System.out.println("│   • Mantener estrategias actuales                           │");
                System.out.println("│   • Expandir líneas de productos exitosas                   │");
                System.out.println("│   • Considerar nuevos mercados                              │");
                break;
            case 2: // Rendimiento Medio
                System.out.println("│ ⭐ RENDIMIENTO MEDIO:                                         │");
                System.out.println("│   • Analizar productos de bajo rendimiento                  │");
                System.out.println("│   • Implementar campañas de marketing focalizadas           │");
                System.out.println("│   • Optimizar inventario                                    │");
                break;
            case 1: // Rendimiento Bajo
                System.out.println("│ 📈 RENDIMIENTO BAJO:                                          │");
                System.out.println("│   • Revisar estrategia de precios                           │");
                System.out.println("│   • Capacitar equipo de ventas                              │");
                System.out.println("│   • Evaluar satisfacción del cliente                        │");
                break;
            default: // Caso por defecto (aunque no debería llegar aquí)
                System.out.println("│ ❓ DATOS INSUFICIENTES PARA ANÁLISIS                         │");
        }

        System.out.println("└─────────────────────────────────────────────────────────────────┘");
        System.out.println();

        // ═══════════════════════════════════════════════════════════════
        // SECCIÓN 10: MENSAJE FINAL CON ANIMACIÓN
        // ═══════════════════════════════════════════════════════════════

        System.out.println("╔══════════════════════════════════════════════════════════════════╗");
        System.out.print("║                    ");

        // EFECTO DE ANIMACIÓN: imprimimos el mensaje carácter por carácter
        String mensaje = "*** REPORTE GENERADO EXITOSAMENTE ***";
        int i = 0;
        while (i < mensaje.length()) { // Bucle while para recorrer cada carácter
            System.out.print(mensaje.charAt(i)); // charAt(i) obtiene el carácter en la posición i
            i++; // Incrementamos el índice
        }

        System.out.println("                    ║");
        // Mostramos la fecha actual usando la clase LocalDate
        System.out.println("║                      📅 " + java.time.LocalDate.now() +
                "                        ║");
        System.out.println("╚══════════════════════════════════════════════════════════════════╝");

        // Cerramos el Scanner para liberar recursos
        scanner.close();
    }
}