package pe.edu.utp.Tp.semana15.Ejercicio01;

public class Main {
    public static void main(String[] args) {
        // Creamos un producto con nombre y precio
        Producto producto = new Producto("Teclado gamer", 75.0);

        // Creamos el servicio para trabajar con productos
        ProductoServicio servicio = new ProductoServicio();

        // Mostramos la información usando un procedimiento
        servicio.mostrarProducto(producto);

        // Verificamos si el precio es válido usando una función
        if (servicio.esPrecioValido(producto)) {
            System.out.println("✅ El precio es válido.");
        } else {
            System.out.println("❌ El precio es inválido.");
        }
    }
}
