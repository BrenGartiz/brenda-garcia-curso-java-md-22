import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        //calular area del circulo
        //multiplicar valor de pi por radio al cuadrado


        //importamos e instanciamos la clase scanner
        Scanner sca = new Scanner(System.in);
        System.out.println("Ingresa el radio del circulo");
        double radio = sca.nextDouble();

        //calcular area de nuestro circulo
        double areaCirculo  = Math.PI * Math.pow(radio,2);


        //Mostrar el resultado
        System.out.println("El area del circulo es " + areaCirculo); 


    }
}