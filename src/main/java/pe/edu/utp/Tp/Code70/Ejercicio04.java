package pe.edu.utp.Tp.Code70;
import java.util.Scanner;
/**
 * 🍕 Ejercicio 4: Sistema de Pedidos de Restaurante con anidamiento de estructuras
 *
 * OBJETIVO DEL PROGRAMA:
 * Este programa simula un sistema de pedidos para un restaurante que:
 * - Gestiona múltiples mesas simultáneamente (máximo 8 mesas)
 * - Genera menús automáticos para cada mesa (máximo 6 platos por mesa)
 * - Calcula precios con descuentos progresivos
 * - Produce reportes detallados por mesa y resumen general
 * - Calcula estadísticas del servicio (totales, promedios)
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        // Inicializar scanner para captura de datos del usuario
        Scanner scanner = new Scanner(System.in);

        // ═══════════════════════════════════════════════════════════════════
        // 🎨 SECCIÓN 1: INTERFAZ VISUAL DEL RESTAURANTE
        // ═══════════════════════════════════════════════════════════════════
        // Crear una experiencia visual atractiva que simule un sistema real
        // de restaurante usando emojis y caracteres especiales ASCII
        System.out.println("🍴═══════════════════════════════════════════🍴");
        System.out.println("        🍕 RESTAURANTE CÓDIGO FELIZ 🍕        ");
        System.out.println("🍴═══════════════════════════════════════════🍴");

        // ═══════════════════════════════════════════════════════════════════
        // 📝 SECCIÓN 2: CAPTURA DE PARÁMETROS DEL SERVICIO
        // ═══════════════════════════════════════════════════════════════════

        // Solicitar número de mesas a atender en esta sesión
        System.out.print("👥 ¿Para cuántas mesas desea generar menús? ");
        int numMesas = scanner.nextInt(); // Variable de control para bucle externo

        // Solicitar cantidad de platos por cada mesa
        System.out.print("🍽️ ¿Cuántos platos por mesa? ");
        int platosXMesa = scanner.nextInt(); // Variable de control para bucle interno

        // ═══════════════════════════════════════════════════════════════════
        // ✅ SECCIÓN 3: VALIDACIÓN DE LÍMITES DE NEGOCIO
        // ═══════════════════════════════════════════════════════════════════

        // Validar que los valores estén dentro de los límites operativos del restaurante
        // Restricciones de negocio:
        // - Máximo 8 mesas (capacidad del restaurante)
        // - Máximo 6 platos por mesa (capacidad de cocina)
        // - Valores deben ser positivos (lógica de negocio)
        if (numMesas <= 0 || numMesas > 8 || platosXMesa <= 0 || platosXMesa > 6) {
            System.out.println("❌ Error: Máximo 8 mesas y 6 platos por mesa.");
            scanner.close(); // Liberar recursos
            return; // Terminar ejecución si hay error
        }

        // ═══════════════════════════════════════════════════════════════════
        // 🏷️ SECCIÓN 4: CONFIGURACIÓN DEL MENÚ (Arrays Paralelos)
        // ═══════════════════════════════════════════════════════════════════

        // ARRAYS PARALELOS: Dos arrays relacionados por índice
        // comidas[i] corresponde con precios[i] para el mismo producto

        // Array de nombres de comidas con emojis representativos
        String[] comidas = {"🍕Pizza", "🍔Burger", "🌮Tacos", "🍝Pasta", "🥗Ensalada", "🍗Pollo"};

        // Array paralelo de precios correspondientes a cada comida
        // Índice 0: Pizza=$12.50, Índice 1: Burger=$8.75, etc.
        double[] precios = {12.50, 8.75, 6.25, 10.00, 7.50, 11.25};

        // Variable acumuladora global para el total de ventas del día
        double granTotal = 0;

        // ═══════════════════════════════════════════════════════════════════
        // 🧾 SECCIÓN 5: ENCABEZADO DEL REPORTE DE PEDIDOS
        // ═══════════════════════════════════════════════════════════════════
        System.out.println("\n🧾════════════════════════════════════════════════════════🧾");
        System.out.println("                    📋 PEDIDOS DEL DÍA 📋                   ");
        System.out.println("🧾════════════════════════════════════════════════════════🧾");

        // ═══════════════════════════════════════════════════════════════════
        // 🔄 SECCIÓN 6: BUCLES FOR ANIDADOS (NESTED LOOPS)
        // ═══════════════════════════════════════════════════════════════════

        // ┌─────────────────────────────────────────────────────────────────┐
        // │ BUCLE EXTERNO (NIVEL 1): Iteración por cada mesa del restaurante │
        // └─────────────────────────────────────────────────────────────────┘
        for (int mesa = 1; mesa <= numMesas; mesa++) {

            // ───────────────────────────────────────────────────────────────
            // 🪑 SUBSECCIÓN: INICIALIZACIÓN DE MESA
            // ───────────────────────────────────────────────────────────────

            // Mostrar separador visual para cada mesa
            // "═".repeat(35) crea una línea de 35 caracteres ═
            System.out.println("\n🪑 MESA #" + mesa + " " + "═".repeat(35));

            // Acumulador local para el total de esta mesa específica
            // Se reinicia a 0 para cada nueva mesa
            double totalMesa = 0;

            // ┌─────────────────────────────────────────────────────────────┐
            // │ BUCLE INTERNO (NIVEL 2): Iteración por cada plato de la mesa │
            // └─────────────────────────────────────────────────────────────┘
            for (int plato = 1; plato <= platosXMesa; plato++) {

                // ───────────────────────────────────────────────────────────
                // 🎲 SUBSECCIÓN: ALGORITMO DE SELECCIÓN CÍCLICA
                // ───────────────────────────────────────────────────────────

                // SELECCIÓN AUTOMÁTICA DE COMIDA usando patrón cíclico
                // Fórmula: (mesa + plato - 1) % longitud_array
                // Esto asegura variedad entre mesas y evita repetición excesiva
                int indiceComida = (mesa + plato - 1) % comidas.length;
                String comidaSeleccionada = comidas[indiceComida];
                double precio = precios[indiceComida]; // Precio base del producto

                // ───────────────────────────────────────────────────────────
                // 🎁 SUBSECCIÓN: SISTEMA DE DESCUENTOS PROGRESIVOS
                // ───────────────────────────────────────────────────────────

                // DESCUENTO POR VOLUMEN: Incentivo para pedidos grandes
                // Si el cliente pide más de 3 platos, obtiene 10% de descuento
                // en los platos adicionales (4to, 5to, 6to plato)
                if (plato > 3) {
                    precio *= 0.9; // Multiplicar por 0.9 equivale a 10% descuento
                }

                // ACUMULAR el precio del plato al total de la mesa
                totalMesa += precio;

                // ───────────────────────────────────────────────────────────
                // 🖨️ SUBSECCIÓN: FORMATO DE SALIDA POR PLATO
                // ───────────────────────────────────────────────────────────

                // Mostrar información detallada de cada plato ordenado
                // Formato: "   N. 🍕Pizza - $12.50"
                System.out.printf("   %d. %s - $%.2f", plato, comidaSeleccionada, precio);

                // Indicador visual de descuento aplicado
                if (plato > 3) {
                    System.out.print(" 🎁(-10%)"); // Mostrar que se aplicó descuento
                }
                System.out.println(); // Nueva línea para el siguiente plato

            } // FIN DEL BUCLE INTERNO (platos)

            // ───────────────────────────────────────────────────────────────
            // 💰 SUBSECCIÓN: RESUMEN POR MESA
            // ───────────────────────────────────────────────────────────────

            // ACUMULAR el total de esta mesa al gran total del día
            granTotal += totalMesa;

            // Mostrar el subtotal de la mesa actual
            System.out.printf("💳 Total Mesa #%d: $%.2f\n", mesa, totalMesa);

        } // FIN DEL BUCLE EXTERNO (mesas)

        // ═══════════════════════════════════════════════════════════════════
        // 📊 SECCIÓN 7: ANÁLISIS ESTADÍSTICO Y RESUMEN FINAL
        // ═══════════════════════════════════════════════════════════════════

        System.out.println("\n🏆════════════════════════════════════════════════════════🏆");

        // ESTADÍSTICA 1: Cantidad de mesas atendidas
        System.out.printf("🍽️ Total de mesas atendidas: %d\n", numMesas);

        // ESTADÍSTICA 2: Volumen total de platos servidos
        // Cálculo: numMesas × platosXMesa = total de platos
        System.out.printf("📦 Total de platos servidos: %d\n", numMesas * platosXMesa);

        // ESTADÍSTICA 3: Ingresos totales del período
        System.out.printf("💰 GRAN TOTAL DEL DÍA: $%.2f\n", granTotal);

        // ESTADÍSTICA 4: Ticket promedio por mesa
        // Útil para análisis de rentabilidad y estrategias de precios
        System.out.printf("📈 Promedio por mesa: $%.2f\n", granTotal / numMesas);

        // Mensajes de confirmación del sistema
        System.out.println("🎉 ¡Servicio completado exitosamente! ✨");
        System.out.println("🍴═══════════════════════════════════════════🍴");
        scanner.close();

    }
}

