package piib;

import java.util.Scanner;

public class EstructuraCondicionaCompuesta {
    public static void main(String[] args) {
        //? ESTRUCTURAS CONDICIONALES COMPUESTAS
        float num1, num2;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Estructuras condicionales compuestas: ");
        System.out.print("Ingrese el primer numero: ");
        num1 = teclado.nextFloat();
        System.out.print("Ingrese el segundo numero: ");
        num2 = teclado.nextFloat();

        if( (int)num1 > (int)num2){
            System.out.print("El numero mayor es: " + (int)num1);
        }else {
            System.out.print("El numero mayor es: "+ (int)num2);
        }

    }
}
