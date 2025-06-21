package pe.edu.utp.Tp.GRUPAL.Ejercicio02;
import java.util.ArrayList;
import java.util.List;
public class InventarioReporte {

    // Clase que representa el reporte de inventario de productos
    private List<Producto> productos;

    // Constructor vacío
    public InventarioReporte() {
        this.productos = new ArrayList<>();
    }

    // Método para agregar un producto al inventario
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void generarReporte() {
        System.out.printf("\n");
        System.out.printf("╔══════════════════════════════════════════════════════════════╗\n");
        System.out.printf("║                  REPORTE DE INVENTARIO                       ║\n");
        System.out.printf("╚══════════════════════════════════════════════════════════════╝\n");
        System.out.printf("Total de productos: %d\n\n", productos.size());

        // Variables para contar productos disponibles y agotados, y calcular el valor total
        int productosDisponibles = 0;
        int productosAgotados = 0;
        double valorTotal = 0.0;

        // Iterar sobre la lista de productos y mostrar información
        for (int i = 0; i < productos.size(); i++) {
            System.out.printf("--- PRODUCTO %d ---\n", i + 1);
            productos.get(i).mostrarInfo();
            // Calcular productos disponibles y agotados, y el valor total del inventario
            if (productos.get(i).getStock() > 0) {
                productosDisponibles++;
                valorTotal += productos.get(i).getPrecio() * productos.get(i).getStock();
            } else {
                productosAgotados++;
            }
        }

        // Mostrar resumen del inventario
        System.out.printf("╔═══════════════════════════════════════════════════════════════╗\n");
        System.out.printf("║                        RESUMEN                                ║\n");
        System.out.printf("╠═══════════════════════════════════════════════════════════════╣\n");
        System.out.printf("║ Productos disponibles: %d                                    ║\n", productosDisponibles);
        System.out.printf("║ Productos agotados: %d                                       ║\n", productosAgotados);
        System.out.printf("║ Valor total del inventario: S/. %.2f                        ║\n", valorTotal);
        System.out.printf("╚═══════════════════════════════════════════════════════════════╝\n");
    }
}
