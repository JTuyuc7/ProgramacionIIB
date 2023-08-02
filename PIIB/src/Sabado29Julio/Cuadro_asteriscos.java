package Sabado29Julio;

public class Cuadro_asteriscos {
    public static void main(String[] args) {
        for (int a = 0; a  < 24; a++) {
            for (int i = 0; i < 80; i++) {
                if (a==0 || a==23 || i==0 || i==79) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
