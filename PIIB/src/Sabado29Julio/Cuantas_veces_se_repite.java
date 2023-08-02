package Sabado29Julio;

/*
    * Realizar un programa que muestre e imprima la cantidad de nuemros durante y despues de una condicion usando while
 */
public class Cuantas_veces_se_repite {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 50){
            System.out.println(i);
            i++;
        }
        System.out.println("ultima vez:"+ i);
    }
}
