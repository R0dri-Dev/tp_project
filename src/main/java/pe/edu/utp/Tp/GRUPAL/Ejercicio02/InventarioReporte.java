package pe.edu.utp.Tp.GRUPAL.Ejercicio02;
import java.util.ArrayList;
import java.util.List;
public class InventarioReporte {

    private List<Producto> productos;

    public InventarioReporte() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void generarReporte() {
        System.out.printf("\n");
        System.out.printf("╔══════════════════════════════════════════════════════════════╗\n");
        System.out.printf("║                  REPORTE DE INVENTARIO                       ║\n");
        System.out.printf("╚══════════════════════════════════════════════════════════════╝\n");
        System.out.printf("Total de productos: %d\n\n", productos.size());

        int productosDisponibles = 0;
        int productosAgotados = 0;
        double valorTotal = 0.0;

        for (int i = 0; i < productos.size(); i++) {
            System.out.printf("--- PRODUCTO %d ---\n", i + 1);
            productos.get(i).mostrarInfo();
            if (productos.get(i).getStock() > 0) {
                productosDisponibles++;
                valorTotal += productos.get(i).getPrecio() * productos.get(i).getStock();
            } else {
                productosAgotados++;
            }
        }

        System.out.printf("╔═══════════════════════════════════════════════════════════════╗\n");
        System.out.printf("║                        RESUMEN                                ║\n");
        System.out.printf("╠═══════════════════════════════════════════════════════════════╣\n");
        System.out.printf("║ Productos disponibles: %d                                    ║\n", productosDisponibles);
        System.out.printf("║ Productos agotados: %d                                       ║\n", productosAgotados);
        System.out.printf("║ Valor total del inventario: S/. %.2f                        ║\n", valorTotal);
        System.out.printf("╚═══════════════════════════════════════════════════════════════╝\n");
    }
}
