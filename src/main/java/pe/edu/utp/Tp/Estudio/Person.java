package pe.edu.utp.Tp.Estudio;

public class Person {
    public static void main(String[] args) {
        String texto1 = "Hola";
        String texto2 = "hola";
        
        if (texto1.equals(texto2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }
        
        if (texto1.equalsIgnoreCase(texto2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }
    }
}