package pe.edu.utp.Tp.GRUPAL.Ejercicio02;

public class Producto {
    // Atributos de la clase Producto
    private int id;
    private String nombre;
    private double precio;
    private int stock;
    private String categoria;
    private String descripcion;

    // Constructor vacío
    public Producto() {
    }

    // Constructor con parámetros
    public Producto(int id, String nombre, double precio, int stock, String categoria, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.printf("=== PRODUCTO ===\n");
        System.out.printf("ID: %d\n", id);
        System.out.printf("Nombre: %s\n", nombre);
        System.out.printf("Categoría: %s\n", categoria);
        System.out.printf("Precio: S/. %.2f\n", precio);
        System.out.printf("Stock: %d %s\n", stock, (stock > 0 ? "(Disponible)" : "(Agotado)"));
        System.out.printf("Descripción: %s\n", descripcion);
        System.out.printf("===============\n\n");
    }
}
