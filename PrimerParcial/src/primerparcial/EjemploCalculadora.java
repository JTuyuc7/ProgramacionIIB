/*
 * Ejemplo de Calculadora usando bucles(ciclos)y METODOS
   Para reforzar conocimientos vea el siguiente video sobre metodos:
   Concepto y creación de métodos: https://youtu.be/hDPSRbXBi8U
 */
package primerparcial;
import java.util.Scanner;
public class EjemploCalculadora {
    Scanner Entrada = new Scanner(System.in);
//Programación de METODOS

    //Metodo Sumar 1
    public void Sumar(){
        float a,b,c;
        System.out.println("***************************");
        System.out.println("      Operación Suma       ");
        System.out.println("***************************");
        System.out.print("Ingrese primver valor: ");
        a=Entrada.nextFloat();
        System.out.print("Ingrese segundo valor: ");
        b=Entrada.nextFloat();
        c=a+b;
        System.out.println("El resultado de la suma es: "+c);
    }

        //Desarrollar AQUI los metodos Restar(),Multiplicar(),Dividir()
        //public void Restar()
        //public void Multiplicar()
        //public void Dividir()

    //Metodo main()
    public static void main(String[] args){
        int opcion;
        //En la siguiente linea se declara el objeto: invocametodos
        //que servirá como enlace para llamar o invocar a los metodos:
        //Sumar(),Restar(),Multiplicar(),Dividir()
        EjemploCalculadora invocametodos = new EjemploCalculadora();
        Scanner Entrada = new Scanner(System.in);
        do {
            System.out.println("---------------------------");
            System.out.println("  Calculadora Aritmética   ");
            System.out.println("---------------------------");
            System.out.println("1....Suma");
            System.out.println("2....Resta");
            System.out.println("3....Multiplicacion");
            System.out.println("4....Division");
            System.out.println("5.... Salir");
            System.out.print("Selecciones su opcion: ");
            opcion=Entrada.nextInt();
            switch(opcion){
                case 1:{
                    invocametodos.Sumar(); //Llamar o invocar al metodo Sumar()
                    break;
                }//Fin case 1
                case 2:{
                    //Llamar o invocar al metodo Restar()
                    break;
                }//Fin case 2
                case 3:{
                    //Llamar o invocar al metodo Multiplicar()
                    break;
                }//Fin case 3
                case 4:{
                    //Llamar o invocar al metodo Dividir()
                    break;
                }//Fin case 4
                default:{
                    System.out.println("******Por favor seleccione una opción del menú, Gracias!!****");
                    break;
                }//Fin case 3
            }//Fin switch case
        } while (opcion!=5);
    }//Fin metodo main
}//Fin clase
