package pe.edu.utp.Tp.GRUPAL.Ejercicio03;

import java.util.ArrayList;
import java.util.List;

public class ReporteEmpleados {

    private List<Empleado> empleados;


    public ReporteEmpleados() {
        this.empleados = new ArrayList<>();
    }


    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }


    public void generarReporte() {
        System.out.printf("\n");
        System.out.printf("╔══════════════════════════════════════════════════════════════╗\n");
        System.out.printf("║                    REPORTE DE EMPLEADOS                      ║\n");
        System.out.printf("╚══════════════════════════════════════════════════════════════╝\n");
        System.out.printf("Total de empleados: %d\n\n", empleados.size());

        double salarioTotal = 0.0;
        double salarioMayor = 0.0;
        double salarioMenor = Double.MAX_VALUE;


        for (int i = 0; i < empleados.size(); i++) {
            System.out.printf("--- EMPLEADO %d ---\n", i + 1);
            empleados.get(i).mostrarInfo();

            double salario = empleados.get(i).getSalario();
            salarioTotal += salario;

            if (salario > salarioMayor) {
                salarioMayor = salario;
            }
            if (salario < salarioMenor) {
                salarioMenor = salario;
            }
        }

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
