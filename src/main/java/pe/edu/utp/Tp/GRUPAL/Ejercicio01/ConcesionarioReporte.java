package pe.edu.utp.Tp.GRUPAL.Ejercicio01;
import java.util.ArrayList;
import java.util.List;
public class ConcesionarioReporte {

    // Clase que representa el reporte de vehículos de un concesionario
    private List<Vehiculo> vehiculos;

    // Constructor vacío
    public ConcesionarioReporte() {
        this.vehiculos = new ArrayList<>();
    }

    // Constructor con parámetros
    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    // Método para agregar un vehículo con parámetros
    public void generarReporte() {
        System.out.printf("\n");
        System.out.printf("╔══════════════════════════════════════════════════════════════╗\n");
        System.out.printf("║               REPORTE DE VEHÍCULOS DEL CONCESIONARIO         ║\n");
        System.out.printf("╚══════════════════════════════════════════════════════════════╝\n");
        System.out.printf("Total de vehículos: %d\n\n", vehiculos.size());

        // Variables para contar vehículos por marca y calcular el precio total
        for (int i = 0; i < vehiculos.size(); i++) {
            System.out.printf("--- VEHÍCULO %d ---\n", i + 1);
            vehiculos.get(i).mostrarInfo();
        }

        // Calcular precio promedio
        double promedio = vehiculos.stream().mapToDouble(Vehiculo::getPrecio).average().orElse(0.0);
        System.out.printf("Precio promedio de vehículos: S/. %.2f\n", promedio);
    }
}
