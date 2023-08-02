package piib;

public class EjercicioWhile {
    public static void main(String[] args) {
        System.out.println("Programa while");

        int i = 1;

        while ( i <= 50){
            System.out.println("Ciclo while: "+ i);
            i++;
        }
        System.out.println(i+ " Ultimo valor de i");
    }
}
