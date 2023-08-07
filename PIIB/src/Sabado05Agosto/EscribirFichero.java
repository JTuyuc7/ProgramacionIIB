package Sabado05Agosto;

/*
    ? Fecha: Chimaltenango 08/05/2023
    ? Autor: Jaime Tuyuc
    ? Descripcion: Ficheros en Java, como poder escribir y leer datos
 */

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EscribirFichero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;

        try (FileWriter fw = new FileWriter("datos.txt", true);
             PrintWriter salida = new PrintWriter(fw)) {
            System.out.println("Introduce texto. Para acabar introduce la cadena FIN:");
            cadena = sc.nextLine();                             //se introduce por teclado una cadena de texto
            while (!cadena.equalsIgnoreCase("FIN")) {
                salida.println(cadena);                         //se escribe la cadena en el fichero
                cadena = sc.nextLine();                         //se introduce por teclado una cadena de texto
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
