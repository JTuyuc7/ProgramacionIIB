package piib;

import java.util.Scanner;

public class EstructrucaCondicionalSimple {
    public static void main(String[] args) {

        //? ESTRUCTURAS CONDICIONAES SIMPLES

        Scanner teclado = new Scanner(System.in);
        int salario;
        System.out.print("Ingrese el sueldo a calcular: ");
        salario = teclado.nextInt();
        if( salario >= 3000){
            System.out.print("Debe abonar impuestos");
        }


    }
}
