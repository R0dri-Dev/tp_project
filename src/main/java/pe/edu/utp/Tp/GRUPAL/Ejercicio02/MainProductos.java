package pe.edu.utp.Tp.GRUPAL.Ejercicio02;

public class MainProductos {
    public static void main(String[] args) {
        // Crear instancia del reporte de inventario
        InventarioReporte reporte = new InventarioReporte();

        // Crear productos
        Producto p1 = new Producto(1, "Laptop Dell", 2500.00, 15, "Electrónicos", "Laptop Dell Inspiron 15 con 8GB RAM");
        Producto p2 = new Producto(2, "Mouse Logitech", 45.00, 0, "Periféricos", "Mouse óptico inalámbrico");
        Producto p3 = new Producto(3, "Teclado Mecánico", 180.00, 8, "Periféricos", "Teclado mecánico RGB para gaming");
        Producto p4 = new Producto(4, "Monitor 24\"", 650.00, 12, "Electrónicos", "Monitor LED Full HD 24 pulgadas");

        // Agregar productos al reporte
        reporte.agregarProducto(p1);
        reporte.agregarProducto(p2);
        reporte.agregarProducto(p3);
        reporte.agregarProducto(p4);

        // Generar reporte
        reporte.generarReporte();
    }
}
