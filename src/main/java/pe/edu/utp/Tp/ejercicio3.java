package pe.edu.utp.Tp;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        int fecha;

        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 12");
        fecha = lector.nextInt();

        switch (fecha){
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
        }
    }
}
