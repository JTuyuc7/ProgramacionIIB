package Sabado29Julio;
/*
    * Completar el ejercicio anterior agregando metodos para cada operacion aritmetica

 */

import java.util.Scanner;

public class Calculadora_con_metodos {
    public static void main(String[] args) {
        int opcion; // *
        float n1, n2, resultado;
        Scanner entrada = new Scanner(System.in); // * Declaracion scanner

        do {
            System.out.println("Calculadora aritmetica");
            System.out.println("1 - Suma: ");
            System.out.println("2 - Resta: ");
            System.out.println("3 - Multiplicacion: ");
            System.out.println("4 - Division: ");
            System.out.println("5 - Salir: ");
            System.out.println("Seleccione una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1 : {
                    System.out.println("Ingrese el primer numero: ");
                    n1 = entrada.nextFloat();
                    System.out.println("Ingrese el segundo numero: ");
                    n2 = entrada.nextFloat();
                    resultado = n1 + n2;
                    System.out.println("La suma de los numeros es: "+ resultado);
                    break;
                } // * Fin case 1
                case 2: {
                    System.out.println("Ingrese el primer numero: ");
                    n1 = entrada.nextFloat();
                    System.out.println("Ingrese el segundo numero: ");
                    n2 = entrada.nextFloat();
                    resultado = n1 - n2;
                    System.out.println("La resta de los numeros es: "+ resultado);
                    break;
                } // * Fin case 2
                case 3: {
                    System.out.println("Ingrese el primer numero: ");
                    n1 = entrada.nextFloat();
                    System.out.println("Ingrese el segundo numero: ");
                    n2 = entrada.nextFloat();
                    resultado = n1 * n2;
                    System.out.println("El producto de los numeros es: "+ resultado);
                    break;
                } // * Fin case 3
                case 4: {
                    System.out.println("Ingrese el primer numero: ");
                    n1 = entrada.nextFloat();
                    System.out.println("Ingrese el segundo numero: ");
                    n2 = entrada.nextFloat();
                    if( (int)n2 == 0){ // * Validar que no se sa pueda dividir por 0
                        System.out.println("No se puede dividir por 0");
                    }else {
                        resultado = n1 / n2;
                        System.out.println("La resta de los numeros es: "+ resultado);
                    }
                    break;
                }// * Fin case 4
                case 5 : {
                    System.out.println("Gracias por usar el Progrma :)");
                    break;
                }// * Fin case 5
                default: {
                    System.out.println("Por favor ingrese alguna opcion correcta");
                    break;
                }//* Fin Default, si no se selecciona ninguna opcion valida
            }
        } while (opcion != 5); //* Fin Ciclo do While
    }//* Fin Main
}
