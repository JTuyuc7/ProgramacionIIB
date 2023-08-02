/*

    * Fecha Sabado 29 - julio
    * Dessarollar un programa que muestre en pantalla los numeros del 1 - 50
 */

package piib;public class EjerciciosFor {
    public static void main(String[] args) {

        System.out.println("Ejercicios for");
        /*
        for(int i = 50; i > 0; i--){
            System.out.println("Numero: "+ i);
        }


         */
        // * Mostrar los numeros
        /*
        for(int i = -50; i < 0; i++){
            System.out.println("Numero: "+ i);
        }

         */

        for( int i = 1; i <= 80; i++){
            System.out.print("*");
            for(int j = 1; j < 81; j++){
                if(j == 1){
                    System.out.println("-");
                }
            }
            System.out.print("*");
        }



    }
}
