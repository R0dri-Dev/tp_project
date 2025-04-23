package pe.edu.utp.Tp;

public class Main {
    public static void main(String[] args) {

        //Tipo de variables
        /*
        Caracteres (texto)
        Numericos (decimales enteros)
        logicos (verdadero o falso)


        Ejemplo de definicion de variables

        Definir a como real
        Definir b como entero
        Definir sueldo como real
        Definir nombre como caracter



        //In java

        Caracteres

        String (texto), char(una sola letra)


        Definition of variables in java

        double a;
        int b;
        float sueldo;
        String nombre;


        int -> entero
        long -> entero
        short -> entero
        float -> real
        double -> real
        char -> un caracter
        String -> texto
        boolean -> verdadero o falso

         */
        System.out.println("Hello, World!");
        System.out.println("---------------------------------");

        int a = 5; //Enteros
        double b = 5.5; //Reales
        char c = 'a'; //Un caracter
        String d = "Pepe"; //Un texto
        boolean e = true; //Verdadero o falso

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        System.out.printf("Mi nombre es %s y tengo %d años", d, a);


    }
}