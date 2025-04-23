package pe.edu.utp.Tp;

import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args) {
        //Se necesita hacer un algortimos que haga descuento si el cliente compra un producto
        // con mas de 50 soles, se le aplicará el descuento del 10%, si es menos o igual de 50 soles, no tendra nada


        //Definimos variables

        double price;
        double result=0;

        //la logica

        Scanner lector = new Scanner(System.in);

        System.out.println("Dime el precio");
        price = lector.nextDouble();

        if( price > 50){
            result = price -(50 *0.1);
        }else {
            result= 50;
        }

        System.out.println("El precio final a pagar es: " + result);
    }


}
