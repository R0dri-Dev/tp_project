package pe.edu.utp.Tp;

public class Cinthia {
    private String nombres = "Cinthia Yanali Sandoval Santisteban";
    private int edad = 19;
    private String carrera = "Chistemas";
     private String universidad = "UTP";
    private int ciclo = 4;

    public Cinthia(){
    }

    public Cinthia(String nombres, int edad, String carrera, String universidad, int ciclo) {
        this.nombres = nombres;
        this.edad = edad;
        this.carrera = carrera;
        this.universidad = universidad;
        this.ciclo = ciclo;
    }


    //Getters y setters


    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public void llorar(){
        System.out.println("Estoy llorabndo");
    }

    public void  verdorana(){
        System.out.println("Estoy viendo true beauty");
    }


    //Private, public, protected
    
}


