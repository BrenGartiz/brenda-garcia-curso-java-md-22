import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        //conocer si un numeroes positivo, negativo o cero

        Scanner sca = new Scanner(System.in);

        // Solicitaoms al usuario un numero
        System.out.println("ingresa el valor: ");
        
        double numero = sca.nextDouble();
        if (numero > 0){
            System.out.println("El numero " + numero + " es positivo");
        } else if (numero < 0) {
            System.out.println("El numero " + numero + " es negativo");  
        } else {
            System.out.println("El numero es cero");
        }
        sca.close();
    }
}
