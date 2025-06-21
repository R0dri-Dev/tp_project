package pe.edu.utp.Tp.GRUPAL.Ejercicio03;

import java.util.ArrayList;
import java.util.List;

public class ReporteEmpleados {

    // Clase que representa el reporte de empleados de una empresa
    private List<Empleado> empleados;


    // Constructor vacío
    public ReporteEmpleados() {
        this.empleados = new ArrayList<>();
    }


    // Método para agregar un empleado al reporte
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }


    // Método para generar el reporte de empleados
    public void generarReporte() {
        System.out.printf("\n");
        System.out.printf("╔══════════════════════════════════════════════════════════════╗\n");
        System.out.printf("║                    REPORTE DE EMPLEADOS                      ║\n");
        System.out.printf("╚══════════════════════════════════════════════════════════════╝\n");
        System.out.printf("Total de empleados: %d\n\n", empleados.size());

        // Variables para calcular estadísticas salariales
        double salarioTotal = 0.0;
        double salarioMayor = 0.0;
        double salarioMenor = Double.MAX_VALUE;


        // Iterar sobre la lista de empleados y mostrar información
        for (int i = 0; i < empleados.size(); i++) {
            System.out.printf("--- EMPLEADO %d ---\n", i + 1);
            empleados.get(i).mostrarInfo();

            // Calcular estadísticas salariales
            double salario = empleados.get(i).getSalario();
            salarioTotal += salario;

            // Actualizar salario mayor y menor
            if (salario > salarioMayor) {
                salarioMayor = salario;
            }
            if (salario < salarioMenor) {
                salarioMenor = salario;
            }
        }

        // Calcular salario promedio
        double salarioPromedio = salarioTotal / empleados.size();

        // Mostrar estadísticas salariales
        System.out.printf("╔═══════════════════════════════════════════════════════════════╗\n");
        System.out.printf("║                    ESTADÍSTICAS SALARIALES                   ║\n");
        System.out.printf("╠═══════════════════════════════════════════════════════════════╣\n");
        System.out.printf("║ Salario total empresa: S/. %.2f                              ║\n", salarioTotal);
        System.out.printf("║ Salario promedio: S/. %.2f                                   ║\n", salarioPromedio);
        System.out.printf("║ Salario más alto: S/. %.2f                                   ║\n", salarioMayor);
        System.out.printf("║ Salario más bajo: S/. %.2f                                   ║\n", salarioMenor);
        System.out.printf("╚═══════════════════════════════════════════════════════════════╝\n");
    }
}
