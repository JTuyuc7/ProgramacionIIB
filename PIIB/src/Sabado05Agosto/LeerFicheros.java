package Sabado05Agosto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFicheros {
    public static void main(String[] args) {
        FileReader fr = null;

        try {
            fr = new FileReader("C:\\Users\\DELL\\Desktop\\ficheros\\datos.txt");
            BufferedReader entrada = new BufferedReader(fr);
            String cadena = entrada.readLine();    //se lee la primera línea del fichero
            while (cadena != null) {               //mientras no se llegue al final del fichero
                System.out.println(cadena);        //se muestra por pantalla
                cadena = entrada.readLine();       //se lee la siguiente línea del fichero
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
