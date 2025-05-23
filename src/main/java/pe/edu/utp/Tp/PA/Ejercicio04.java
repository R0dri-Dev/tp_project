package pe.edu.utp.Tp.PA;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {

        // Ejercicio 04: Sistema de Calificaciones Académicas
        // Este programa gestiona las calificaciones de estudiantes en múltiples materias
        // Genera reportes individuales, estadísticas generales y recomendaciones

        // Creamos el objeto Scanner para leer entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // ═══════════════════════════════════════════════════════════════
        // SECCIÓN 1: PRESENTACIÓN DEL SISTEMA
        // ═══════════════════════════════════════════════════════════════

        // Encabezado principal del sistema con formato visual atractivo
        System.out.println("╔════════════════════════════════════════════════════════════════════╗");
        System.out.println("║              🎓 SISTEMA DE CALIFICACIONES ACADÉMICAS 🎓            ║");
        System.out.println("╠════════════════════════════════════════════════════════════════════╣");
        System.out.println("║               📊 Universidad Tecnológica Del Perú                  ║");
        System.out.println("╚════════════════════════════════════════════════════════════════════╝");
        System.out.println();

        // ═══════════════════════════════════════════════════════════════
        // SECCIÓN 2: CONFIGURACIÓN INICIAL DEL SISTEMA
        // ═══════════════════════════════════════════════════════════════

        System.out.println("🔧 CONFIGURACIÓN DEL SISTEMA ACADÉMICO");
        System.out.println("═══════════════════════════════════════");

        // Solicitar el nombre de la institución educativa
        System.out.print("🏫 Ingrese el nombre de la institución: ");
        String institucion = scanner.nextLine(); // Leer nombre completo con espacios

        // Solicitar número de estudiantes con validación (rango: 1-10)
        System.out.print("👥 ¿Cuántos estudiantes desea registrar? (1-10): ");
        int numEstudiantes = scanner.nextInt();

        // VALIDACIÓN: Si está fuera del rango, usar valor por defecto
        if (numEstudiantes < 1 || numEstudiantes > 10) {
            numEstudiantes = 3; // Valor por defecto
            System.out.println("⚠️  Número inválido. Se registrarán 3 estudiantes por defecto.");
        }

        // Solicitar número de materias con validación (rango: 1-8)
        System.out.print("📚 ¿Cuántas materias desea evaluar? (1-8): ");
        int numMaterias = scanner.nextInt();

        // VALIDACIÓN: Si está fuera del rango, usar valor por defecto
        if (numMaterias < 1 || numMaterias > 8) {
            numMaterias = 5; // Valor por defecto
            System.out.println("⚠️  Número inválido. Se evaluarán 5 materias por defecto.");
        }

        scanner.nextLine(); // Limpiar el buffer después de nextInt()

        // ═══════════════════════════════════════════════════════════════
        // SECCIÓN 3: DECLARACIÓN DE ESTRUCTURAS DE DATOS
        // ═══════════════════════════════════════════════════════════════

        // Array para almacenar nombres de estudiantes
        String[] estudiantes = new String[numEstudiantes];

        // Array para almacenar nombres de materias
        String[] materias = new String[numMaterias];

        // Array bidimensional: [estudiante][materia] para las calificaciones
        // Cada fila representa un estudiante, cada columna una materia
        double[][] calificaciones = new double[numEstudiantes][numMaterias];

        // ═══════════════════════════════════════════════════════════════
        // SECCIÓN 4: REGISTRO DE MATERIAS
        // ═══════════════════════════════════════════════════════════════

        System.out.println("\n📝 REGISTRO DE MATERIAS");
        System.out.println("═══════════════════════");

        // Bucle for para ingresar el nombre de cada materia
        for (int i = 0; i < numMaterias; i++) {
            System.out.printf("📖 Materia %d: ", (i + 1));
            materias[i] = scanner.nextLine(); // Almacenar en el array
        }

        // ═══════════════════════════════════════════════════════════════
        // SECCIÓN 5: REGISTRO DE ESTUDIANTES Y CALIFICACIONES
        // ═══════════════════════════════════════════════════════════════

        System.out.println("\n👤 REGISTRO DE ESTUDIANTES Y CALIFICACIONES");
        System.out.println("═══════════════════════════════════════════");
        System.out.println("📊 Escala de calificación: 0 - 20 puntos");

        // Bucle anidado: para cada estudiante, ingresar todas sus calificaciones
        for (int est = 0; est < numEstudiantes; est++) {
            // Registro del nombre del estudiante
            System.out.printf("\n🎓 Estudiante %d:", (est + 1));
            System.out.print(" Nombre completo: ");
            estudiantes[est] = scanner.nextLine();

            System.out.printf("📊 Calificaciones para %s:\n", estudiantes[est]);

            // Para cada materia del estudiante actual
            for (int mat = 0; mat < numMaterias; mat++) {
                // BUCLE DO-WHILE para validación de calificaciones (0-20)
                do {
                    System.out.printf("   %s (0-20): ", materias[mat]);
                    calificaciones[est][mat] = scanner.nextDouble();

                    // VALIDACIÓN: La calificación debe estar en el rango 0-20
                    if (calificaciones[est][mat] < 0 || calificaciones[est][mat] > 20) {
                        System.out.println("   ⚠️  La calificación debe estar entre 0 y 20. Intente nuevamente.");
                    }
                } while (calificaciones[est][mat] < 0 || calificaciones[est][mat] > 20);
                // El bucle se repite mientras la condición sea verdadera
            }
            scanner.nextLine(); // Limpiar buffer
        }

        // ═══════════════════════════════════════════════════════════════
        // SECCIÓN 6: PROCESAMIENTO DE DATOS - INICIALIZACIÓN
        // ═══════════════════════════════════════════════════════════════

        System.out.println("\n" + "=".repeat(75));
        System.out.println("🔄 PROCESANDO DATOS Y GENERANDO REPORTE...");
        System.out.println("=".repeat(75) + "\n");

        // Variables para estadísticas generales
        double totalGeneral = 0;        // Suma de todas las calificaciones
        int contadorExcelentes = 0;     // Estudiantes con rendimiento excelente
        int contadorAprobados = 0;      // Estudiantes con buen/regular rendimiento
        int contadorReprobados = 0;     // Estudiantes que necesitan apoyo

        // ═══════════════════════════════════════════════════════════════
        // SECCIÓN 7: ENCABEZADO DEL REPORTE
        // ═══════════════════════════════════════════════════════════════

        System.out.println("╔════════════════════════════════════════════════════════════════════╗");
        System.out.printf("║                🏫 %-40s 🏫                ║%n", institucion.toUpperCase());
        System.out.println("╠════════════════════════════════════════════════════════════════════╣");
        System.out.println("║                    📊 REPORTE ACADÉMICO                             ║");
        System.out.println("╚════════════════════════════════════════════════════════════════════╝");
        System.out.println();

        // ═══════════════════════════════════════════════════════════════
        // SECCIÓN 8: REPORTE DETALLADO POR ESTUDIANTE
        // ═══════════════════════════════════════════════════════════════

        System.out.println("┌────────────────────────────────────────────────────────────────────┐");
        System.out.println("│                      📊 REPORTE POR ESTUDIANTE                     │");
        System.out.println("├────────────────────────────────────────────────────────────────────┤");

        // Análisis detallado de cada estudiante
        for (int est = 0; est < numEstudiantes; est++) {
            System.out.printf("│ 👤 %-20s                                   │%n", estudiantes[est]);
            System.out.println("├────────────────────────────────────────────────────────────────────┤");

            // Variables para el análisis individual del estudiante
            double totalEstudiante = 0;     // Suma de calificaciones del estudiante
            int materiasAprobadas = 0;      // Materias aprobadas (≥14)
            int materiasReprobadas = 0;     // Materias reprobadas (<14)
            String mejorMateria = "";       // Materia con mejor calificación
            String peorMateria = "";        // Materia con peor calificación
            double mejorNota = 0;           // Mejor calificación
            double peorNota = 20;           // Peor calificación (inicia en 20 para comparar)

            // Análisis de cada materia del estudiante
            for (int mat = 0; mat < numMaterias; mat++) {
                double nota = calificaciones[est][mat]; // Calificación actual
                totalEstudiante += nota;    // Sumar al total del estudiante
                totalGeneral += nota;       // Sumar al total general

                // SISTEMA DE CATEGORIZACIÓN por rangos de calificación
                String estado;
                String emoji;
                if (nota >= 18) {           // Excelente: 18-20
                    estado = "EXCELENTE";
                    emoji = "🌟";
                    materiasAprobadas++;
                } else if (nota >= 16) {    // Bueno: 16-17.9
                    estado = "BUENO";
                    emoji = "✅";
                    materiasAprobadas++;
                } else if (nota >= 14) {    // Regular: 14-15.9
                    estado = "REGULAR";
                    emoji = "⚠️";
                    materiasAprobadas++;
                } else {                    // Reprobado: 0-13.9
                    estado = "REPROBADO";
                    emoji = "❌";
                    materiasReprobadas++;
                }

                // Encontrar la mejor materia del estudiante
                if (nota > mejorNota) {
                    mejorNota = nota;
                    mejorMateria = materias[mat];
                }

                // Encontrar la peor materia del estudiante
                if (nota < peorNota) {
                    peorNota = nota;
                    peorMateria = materias[mat];
                }

                // Mostrar información de la materia con formato
                System.out.printf("│   %-13s │ %5.1f │ %-9s %s │",
                        materias[mat], nota, estado, emoji);

                // GRÁFICO DE BARRAS: cada punto = una barra
                int barras = (int)(nota);
                for (int b = 0; b < barras && b < 20; b++) { // Máximo 20 barras
                    System.out.print("▓");
                }
                System.out.println();
            }

            // Cálculo del promedio del estudiante
            double promedioEstudiante = totalEstudiante / numMaterias;

            // Mostrar estadísticas del estudiante
            System.out.println("├────────────────────────────────────────────────────────────────────┤");
            System.out.printf("│   📈 PROMEDIO GENERAL: %.1f                                     │%n", promedioEstudiante);
            System.out.printf("│   ✅ MATERIAS APROBADAS: %d                                        │%n", materiasAprobadas);
            System.out.printf("│   ❌ MATERIAS REPROBADAS: %d                                       │%n", materiasReprobadas);
            System.out.printf("│   🏆 MEJOR MATERIA: %-13s (%.1f)                          │%n", mejorMateria, mejorNota);
            System.out.printf("│   📉 ÁREA A MEJORAR: %-13s (%.1f)                         │%n", peorMateria, peorNota);

            // ═══════════════════════════════════════════════════════════════
            // SUBSECCIÓN: CLASIFICACIÓN DEL ESTUDIANTE
            // ═══════════════════════════════════════════════════════════════

            String clasificacionFinal;
            String recomendacion;

            // SISTEMA DE CLASIFICACIÓN basado en promedio y materias reprobadas
            if (promedioEstudiante >= 18 && materiasReprobadas == 0) {
                clasificacionFinal = "🥇 ESTUDIANTE EXCELENTE";
                recomendacion = "Mantener el excelente rendimiento";
                contadorExcelentes++; // Incrementar contador
            } else if (promedioEstudiante >= 16 && materiasReprobadas <= 1) {
                clasificacionFinal = "🥈 BUEN ESTUDIANTE";
                recomendacion = "Continuar con el buen trabajo";
                contadorAprobados++;
            } else if (promedioEstudiante >= 14 && materiasReprobadas <= 2) {
                clasificacionFinal = "🥉 ESTUDIANTE REGULAR";
                recomendacion = "Necesita mejorar en algunas áreas";
                contadorAprobados++;
            } else {
                clasificacionFinal = "⚠️ NECESITA APOYO";
                recomendacion = "Requiere atención especial y tutoría";
                contadorReprobados++;
            }

            // Mostrar clasificación y recomendación
            System.out.printf("│   %s                                   │%n", clasificacionFinal);
            System.out.printf("│   💡 %s                          │%n", recomendacion);

            // ═══════════════════════════════════════════════════════════════
            // SUBSECCIÓN: PLAN DE MEJORA (si tiene materias reprobadas)
            // ═══════════════════════════════════════════════════════════════

            if (materiasReprobadas > 0) {
                System.out.println("│   📚 PLAN DE MEJORA:                                              │");

                int materiaIndex = 0;   // Índice para recorrer materias
                int planCount = 0;      // Contador de planes generados

                // BUCLE WHILE: generar hasta 3 planes de mejora
                while (materiaIndex < numMaterias && planCount < 3) {
                    // Solo considerar materias con calificación < 16
                    if (calificaciones[est][materiaIndex] < 16) {
                        String accion;

                        // Determinar tipo de apoyo según la calificación
                        if (calificaciones[est][materiaIndex] < 14) {
                            accion = "Tutoría intensiva";      // Para reprobadas
                        } else {
                            accion = "Práctica adicional";     // Para regulares
                        }

                        System.out.printf("│     • %-13s: %s                                 │%n",
                                materias[materiaIndex], accion);
                        planCount++; // Incrementar contador de planes
                    }
                    materiaIndex++; // Pasar a la siguiente materia
                }
            }

            System.out.println("├────────────────────────────────────────────────────────────────────┤");
            System.out.println();
        }

        // ═══════════════════════════════════════════════════════════════
        // SECCIÓN 9: ESTADÍSTICAS GENERALES DE LA CLASE
        // ═══════════════════════════════════════════════════════════════

        System.out.println("┌────────────────────────────────────────────────────────────────────┐");
        System.out.println("│                     📊 ESTADÍSTICAS GENERALES                      │");
        System.out.println("├────────────────────────────────────────────────────────────────────┤");

        // Cálculo del promedio general de toda la clase
        double promedioGeneral = totalGeneral / (numEstudiantes * numMaterias);

        // Mostrar estadísticas generales
        System.out.printf("│ 📈 PROMEDIO GENERAL DE LA CLASE: %.1f                             │%n", promedioGeneral);
        System.out.printf("│ 🌟 ESTUDIANTES EXCELENTES: %d                                     │%n", contadorExcelentes);
        System.out.printf("│ ✅ ESTUDIANTES APROBADOS: %d                                      │%n", contadorAprobados);
        System.out.printf("│ ⚠️  ESTUDIANTES QUE NECESITAN APOYO: %d                           │%n", contadorReprobados);
        System.out.println("├────────────────────────────────────────────────────────────────────┤");

        // ═══════════════════════════════════════════════════════════════
        // SECCIÓN 10: ANÁLISIS POR MATERIA
        // ═══════════════════════════════════════════════════════════════

        System.out.println("│                    📚 RENDIMIENTO POR MATERIA                      │");
        System.out.println("├────────────────────────────────────────────────────────────────────┤");

        // Análisis detallado de cada materia
        for (int mat = 0; mat < numMaterias; mat++) {
            double totalMateria = 0;        // Suma de calificaciones de la materia
            int aprobadosMateria = 0;       // Estudiantes aprobados en esta materia

            // Recorrer todos los estudiantes para esta materia
            for (int est = 0; est < numEstudiantes; est++) {
                totalMateria += calificaciones[est][mat];

                // Contar aprobados (calificación ≥ 14)
                if (calificaciones[est][mat] >= 14) {
                    aprobadosMateria++;
                }
            }

            // Calcular estadísticas de la materia
            double promedioMateria = totalMateria / estudiantes.length;
            double porcentajeAprobados = (aprobadosMateria * 100.0) / estudiantes.length;

            // Mostrar información de la materia
            System.out.printf("│ %-13s │ Promedio: %5.1f │ Aprobados: %5.1f%% │",
                    materias[mat], promedioMateria, porcentajeAprobados);

            // SISTEMA DE ICONOS basado en el promedio de la materia
            int nivelMateria = (int)(promedioMateria / 2); // Dividir entre 2 para obtener nivel
            switch (nivelMateria) {
                case 10:    // 20/2 = 10
                case 9:     // 18-19/2 = 9
                    System.out.print(" 🏆 │");  // Excelente
                    break;
                case 8:     // 16-17/2 = 8
                    System.out.print(" 🥇 │");  // Muy bueno
                    break;
                case 7:     // 14-15/2 = 7
                    System.out.print(" 🥈 │");  // Bueno
                    break;
                case 6:     // 12-13/2 = 6
                    System.out.print(" ⚠️ │");  // Regular
                    break;
                default:    // < 12
                    System.out.print(" 🆘 │");  // Necesita apoyo
            }
            System.out.println();
        }

        System.out.println("└────────────────────────────────────────────────────────────────────┘");
        System.out.println();

        // ═══════════════════════════════════════════════════════════════
        // SECCIÓN 11: RECOMENDACIONES FINALES
        // ═══════════════════════════════════════════════════════════════

        System.out.println("┌────────────────────────────────────────────────────────────────────┐");
        System.out.println("│                       💡 RECOMENDACIONES FINALES                   │");
        System.out.println("├────────────────────────────────────────────────────────────────────┤");

        int recomendacionIndex = 0; // Índice para las recomendaciones

        // BUCLE DO-WHILE: generar 3 recomendaciones basadas en las estadísticas
        do {
            String recomendacion = "";

            // SWITCH para generar recomendaciones específicas
            switch (recomendacionIndex) {
                case 0: // Primera recomendación: sobre tutoría
                    if (contadorReprobados > estudiantes.length / 2) {
                        // Si más de la mitad necesita apoyo
                        recomendacion = "• Implementar programa de tutoría grupal";
                    } else {
                        // Si el rendimiento es bueno en general
                        recomendacion = "• Mantener metodología actual de enseñanza";
                    }
                    break;
                case 1: // Segunda recomendación: sobre currículo
                    if (promedioGeneral < 15) {
                        // Si el promedio general es bajo
                        recomendacion = "• Revisar contenido curricular y métodos de evaluación";
                    } else {
                        // Si el rendimiento es satisfactorio
                        recomendacion = "• Considerar actividades de enriquecimiento académico";
                    }
                    break;
                case 2: // Tercera recomendación: sobre mentorías
                    if (contadorExcelentes > 0) {
                        // Si hay estudiantes excelentes
                        recomendacion = "• Crear programa de mentores estudiantiles";
                    } else {
                        // Si no hay estudiantes excelentes
                        recomendacion = "• Establecer metas de mejoramiento grupal";
                    }
                    break;
            }

            System.out.printf("│ %-66s │%n", recomendacion);
            recomendacionIndex++; // Incrementar índice

        } while (recomendacionIndex < 3); // Continuar hasta generar 3 recomendaciones

        System.out.println("└────────────────────────────────────────────────────────────────────┘");
        System.out.println();

        // ═══════════════════════════════════════════════════════════════
        // SECCIÓN 12: MENSAJE FINAL CON ANIMACIÓN
        // ═══════════════════════════════════════════════════════════════

        System.out.println("╔════════════════════════════════════════════════════════════════════╗");

        // Crear una línea decorativa con estrellas
        System.out.print("║");
        for (int i = 0; i < 68; i++) {
            if (i % 4 == 0) {           // Cada 4 posiciones
                System.out.print("✨");  // Imprimir estrella
            } else {
                System.out.print(" ");   // Imprimir espacio
            }
        }
        System.out.println("║");

        // Mensaje final con información del sistema
        System.out.println("║              🎓 REPORTE GENERADO EXITOSAMENTE 🎓                   ║");
        System.out.println("║                    Sistema Académico v2.0                          ║");
        System.out.println("║                      📅 " + java.time.LocalDate.now() +
                "                                ║");
        System.out.println("╚════════════════════════════════════════════════════════════════════╝");
    }
}