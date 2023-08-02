package piib;

import java.util.Scanner;

public class CalculadoraConMetodos {
    public static void main(String[] args) {
        int opcion; // *
        Scanner entrada = new Scanner(System.in); // * Declaracion scanner
        MetodosMatematicos operaciones = new MetodosMatematicos();

        do {
            operaciones.menu();
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1 : {
                    operaciones.sumar();
                    break;
                } // * Fin case 1
                case 2: {
                    operaciones.restar();
                    break;
                } // * Fin case 2
                case 3: {
                    operaciones.producto();
                    break;
                } // * Fin case 3
                case 4: {
                    operaciones.division();
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
    }
}
