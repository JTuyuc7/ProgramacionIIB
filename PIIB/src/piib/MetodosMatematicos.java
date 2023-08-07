package piib;

import java.util.Scanner;

public class MetodosMatematicos {

    Scanner leerDatos =  new Scanner(System.in);
    float num1, num2, resultado;

    // ? Opciones
    public void menu(){
        System.out.println("Calculadora aritmetica");
        System.out.println("1 - Suma: ");
        System.out.println("2 - Resta: ");
        System.out.println("3 - Multiplicacion: ");
        System.out.println("4 - Division: ");
        System.out.println("5 - Salir: ");
        System.out.println("Seleccione una opcion: ");
    }

    // ? Metodo suma
    public void sumar() {
        System.out.println("***************************");
        System.out.println("      Operación Suma       ");
        System.out.println("***************************");
        System.out.println("Ingresa el primer numero: ");
        num1 = leerDatos.nextFloat();
        System.out.println("ingrese el segundo numero: ");
        num2 = leerDatos.nextFloat();

        resultado =  num1 + num2;
        System.out.print("El resultado de la suma es: " + resultado+ "\n");
    }

    // ? Metodo resta
    public void restar(){
        System.out.println("***************************");
        System.out.println("      Operación Resta       ");
        System.out.println("***************************");
        System.out.println("Ingresa el primer numero: ");
        num1 = leerDatos.nextFloat();
        System.out.println("ingrese el segundo numero: ");
        num2 = leerDatos.nextFloat();

        resultado =  num1 - num2;
        System.out.print("El resultado de la resta es: " + resultado+ "\n");
    }

    // ? Metodo Multiplicar
    public void producto(){
        System.out.println("***************************");
        System.out.println("  Operación Multiplicacion ");
        System.out.println("***************************");
        System.out.println("Ingresa el primer numero: ");
        num1 = leerDatos.nextFloat();
        System.out.println("ingrese el segundo numero: ");
        num2 = leerDatos.nextFloat();

        resultado =  num1 * num2;
        System.out.print("El producto de los numeros es: " + resultado+ "\n");
    }

    // ? metodo division
    public void division(){
        System.out.println("***************************");
        System.out.println("     Operación Division    ");
        System.out.println("***************************");
        System.out.println("Ingresa el primer numero: ");
        num1 = leerDatos.nextFloat();
        System.out.println("ingrese el segundo numero: ");
        num2 = leerDatos.nextFloat();
        if( (int)num2 == 0){ // * Validar que no se sa pueda dividir por 0
            System.out.println("No se puede dividir por 0");
        }else {
            resultado =  num1 / num2;
            System.out.print("La division de los numeros es: " + String.format("%.2f", resultado)+ "\n");
        }

    }

}
