package pe.edu.utp.Tp.GRUPAL.Ejercicio01;

public class MainVehiculos {
    public static void main(String[] args) {
        ConcesionarioReporte reporte = new ConcesionarioReporte();

        Vehiculo v1 = new Vehiculo("ABC-123", "Toyota", "Corolla", 2020, "Blanco", 65000.00);
        Vehiculo v2 = new Vehiculo("DEF-456", "Honda", "Civic", 2019, "Negro", 58000.00);
        Vehiculo v3 = new Vehiculo("GHI-789", "Nissan", "Sentra", 2021, "Rojo", 62000.00);

        reporte.agregarVehiculo(v1);
        reporte.agregarVehiculo(v2);
        reporte.agregarVehiculo(v3);

        reporte.generarReporte();
    }
}
