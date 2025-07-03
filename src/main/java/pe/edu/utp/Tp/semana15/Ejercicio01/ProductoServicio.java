package pe.edu.utp.Tp.semana15.Ejercicio01;

// Clase que contiene funciones y procedimientos para trabajar con productos
public class ProductoServicio {

    // Procedimiento (no devuelve nada): muestra la información del producto
    public void mostrarProducto(Producto p) {
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Precio: " + p.getPrecio());
    }

    // Función (devuelve boolean): verifica si el precio es mayor a 0
    public boolean esPrecioValido(Producto p) {
        return p.getPrecio() > 0;
    }
}


