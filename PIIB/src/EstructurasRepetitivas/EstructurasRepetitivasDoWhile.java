package EstructurasRepetitivas;

import java.util.Scanner;

/*
 * Autor: Jaime Tuyuc
 * Carnet: 1990-18-2320
 * Descripcion: Escribir un programa que solicite la carga de números por
 * teclado, obtener su promedio. Finalizar la carga de valores
 * cuando se cargue el valor 0

 */
public class EstructurasRepetitivasDoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float suma = 0, elementos = 0, promedio = 0, numero;

        do {
            System.out.print("Ingresa un numero: ");
            numero = entrada.nextFloat();

            suma += numero;
            elementos++;
        }while (numero != 0);

        if(suma == 0){
            System.out.println("No se ingreso ningun numero valido");
        }
        promedio = suma / (elementos - 1);

        System.out.println("La suma de los numeros es: "+ suma + " el promedio de la suma es: " + promedio);
    }
}
