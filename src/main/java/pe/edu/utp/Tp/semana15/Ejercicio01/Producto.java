package pe.edu.utp.Tp.semana15.Ejercicio01;

// Clase que representa un producto con nombre y precio
public class Producto {
    private String nombre;       // Atributo: nombre del producto
    private double precio;       // Atributo: precio del producto

    // Constructor: permite inicializar el producto con sus valores
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getter y setter del nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y setter del precio
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
