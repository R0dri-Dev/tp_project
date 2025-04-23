package pe.edu.utp.Tp;

public class test {
    public static void main(String[] args) {
        Cinthia cinthia = new Cinthia();
        cinthia.llorar();
        cinthia.verdorana();

        cinthia.setNombres("Cinthia Yanali Sandoval");
        cinthia.setEdad(19);
        cinthia.setCarrera("Chistemas");
        cinthia.setUniversidad("UTP");
        cinthia.setCiclo(4);

        System.out.println(cinthia.getNombres());
        System.out.println(cinthia.getEdad());

    }
}
