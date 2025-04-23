package pe.edu.utp.Tp;

import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Hacer un algoritmo que ingrese nombre, apellido y edad. y si el usuario es mayor de edad que salga que es mayor de edad
        //sino que salga que es menor de edad
        String nombre = "luis";
        String apellido = "siesquen";
        int edad= 17;

        if (edad>=18){
            System.out.println("El usuario " + nombre + " " + apellido + " Es mayor de edad");
            JOptionPane.showMessageDialog(null, "El usuario es mayor de edad");

        }else {
            JOptionPane.showMessageDialog(null, "El usuario es menor de edad");

        }

    }
}
