package pe.edu.utp.Tp.GRUPAL.Ejercicio03;

public class MainEmpleados {
    public static void main(String[] args) {

        ReporteEmpleados reporte = new ReporteEmpleados();

        Empleado e1 = new Empleado(1, "Juan", "Pérez", 3500.00, "Sistemas", "15/03/2020");
        Empleado e2 = new Empleado(2, "María", "García", 4200.00, "Contabilidad", "22/07/2019");
        Empleado e3 = new Empleado(3, "Carlos", "López", 3800.00, "Recursos Humanos", "10/01/2021");
        Empleado e4 = new Empleado(4, "Ana", "Martínez", 5000.00, "Gerencia", "05/11/2018");

        reporte.agregarEmpleado(e1);
        reporte.agregarEmpleado(e2);
        reporte.agregarEmpleado(e3);
        reporte.agregarEmpleado(e4);

        reporte.generarReporte();
    }
}
