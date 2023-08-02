package piib;

import java.util.Scanner;

public class SumaProductoDosNumeros {
        public static void main(String[] args) {

            // ? SUMA PRODUCTO DE DOS NUMEROS

            System.out.println("Suma, multiplicacion de productos");
            Scanner entrada = new Scanner(System.in);
            float num1, num2, suma, producto;

            System.out.print("Ingrese el Primer numero: ");
            num1 = entrada.nextFloat();

            System.out.print("Ingrese el segundo numero: ");
            num2 = entrada.nextFloat();

            suma = num1 + num2;
            producto = num1 * num2;

            System.out.println("La suma de los numeros es: "+ suma);
            System.out.println("El producto de los numeros es: "+ producto);

        }
}
