package pe.edu.utp.Tp.GRUPAL.Ejercicio03;

public class Empleado {

    // Atributos de la clase Empleado
    private int id;
    private String nombre;
    private String apellido;
    private double salario;
    private String departamento;
    private String fechaIngreso;

    // Constructor vacío
    public Empleado() {
    }

    // Constructor con parámetros
    public Empleado(int id, String nombre, String apellido, double salario, String departamento, String fechaIngreso) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.departamento = departamento;
        this.fechaIngreso = fechaIngreso;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.printf("=== EMPLEADO ===\n");
        System.out.printf("ID: %d\n", id);
        System.out.printf("Nombre: %s %s\n", nombre, apellido);
        System.out.printf("Departamento: %s\n", departamento);
        System.out.printf("Salario: S/. %.2f\n", salario);
        System.out.printf("Fecha de Ingreso: %s\n", fechaIngreso);
        System.out.printf("================\n\n");
    }
}
