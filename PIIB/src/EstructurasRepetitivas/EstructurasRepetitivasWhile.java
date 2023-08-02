package EstructurasRepetitivas;

/*
    * Autor: Jaime Tuyuc
    * Carnet: 1990-18-2320
    * Descripcion: Escribir un programa que solicite ingresar 10 notas de alumnos y
    * nos informe cuántos tienen notas mayores o iguales a 7 y cuántos
    * menores.

 */

import java.util.Scanner;

public class EstructurasRepetitivasWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese las calificaciones");

        int contador = 1;
        float mayores_a_site = 0, menores_a_site = 0, iguales_a_siete = 0, nota;

        while (contador <= 10 ){
            System.out.print("Ingrese la nota No. # "+ contador+" ");
            nota = entrada.nextFloat();
            
            if( (int)nota > 7){
                mayores_a_site++;
            } else if ((int)nota == 7) {
                iguales_a_siete++;
            }else {
                menores_a_site++;
            }
            contador++;
        }

        System.out.println("Se tienen "+ (int)mayores_a_site + " alumnos, con notas mayores a 7.");
        System.out.println("Se tienen "+ (int)iguales_a_siete + " alumnos, con notas iguales a 7.");
        System.out.println("Se tienen "+ (int)menores_a_site + " alumnos, con notas menores a 7.");
    }
}
