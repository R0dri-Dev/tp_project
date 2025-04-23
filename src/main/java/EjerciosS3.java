import java.util.Scanner;

public class EjerciosS3 {
    public static void main(String[] args) {
        //Una tienda acepta cambio de producto en los siguientes casos: 
        //Si el producto tiene un precio entre 50 y 80 soles, y fue comprado el dia lunes (dia 1) o si el producto tiene un precio no por debajo de 
        //120 soles y fue comprado cualquier dia, excepto miercoles o jueves (dia 3 o 4 respectivamente). 
        //evaluar si procede o no el cambio de producto 
        //Las variables leidas son precioProducto y numeroDia
        
        double precioProducto ;
        int numeroDia;

        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        precioProducto = lector.nextDouble();
        System.out.println("Ingrese el dia de la semana: ");
        System.out.println("1. Lunes");
        System.out.println("2. Martes");
        System.out.println("3. Miercoles");
        System.out.println("4. Jueves");
        System.out.println("5. Viernes");
        numeroDia = lector.nextInt();
        
        boolean puedeCambiar = false;
        
        if(precioProducto >= 50 && precioProducto <= 80){
            if(numeroDia == 1){
                puedeCambiar = true;
            }
        }else if(precioProducto >= 120){
            if(!(numeroDia == 3 || numeroDia == 4)){
                puedeCambiar = true;
            }
        }
        
        if(puedeCambiar){
            System.out.println("Si puede cambiar el producto.");
        }else{
            System.out.println("No puede cambiar el producto.");
        }
    }
}