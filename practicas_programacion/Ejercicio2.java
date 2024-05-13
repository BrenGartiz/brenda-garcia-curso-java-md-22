import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        //verificar que un numero sea par o impar de acuerdo a lo que el usuario ingrese

        Scanner sca = new Scanner (System.in);
        
        // el usuario ingresa un numero
        System.out.println("ingresa un numero");
        int numero =  sca.nextInt();

        //validar si un numero es par o impar
        if (numero % 2 == 0){
            System.out.println(numero + " es un numero par");
            
        } else {
            System.out.println(numero + " es un numero impar");
        }
            //cerramos scanner para ingreso de texto

            sca.close();


    }
}