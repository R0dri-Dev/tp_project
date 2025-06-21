package pe.edu.utp.Tp.GRUPAL.Ejercicio01;

public class Vehiculo {

    // Atributos de la clase Vehiculo
    private String placa;
    private String marca;
    private String modelo;
    private int anio;
    private String color;
    private double precio;

    // Constructor vacío
    public Vehiculo() {
    }

    // Constructor con parámetros
    public Vehiculo(String placa, String marca, String modelo, int anio, String color, double precio) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.precio = precio;
    }

    // Getters y Setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Método para mostrar la información del vehículo
    public void mostrarInfo() {
        System.out.printf("=== VEHÍCULO ===\n");
        System.out.printf("Placa: %s\n", placa);
        System.out.printf("Marca: %s\n", marca);
        System.out.printf("Modelo: %s\n", modelo);
        System.out.printf("Año: %d\n", anio);
        System.out.printf("Color: %s\n", color);
        System.out.printf("Precio: S/. %.2f\n", precio);
        System.out.printf("================\n\n");
    }
}
