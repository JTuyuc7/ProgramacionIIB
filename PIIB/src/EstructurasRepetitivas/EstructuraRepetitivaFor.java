package EstructurasRepetitivas;

/*
    * Autor: Jaime Tuyuc
    * Carnet: 1990-18-2320
    * Descripcion: Desarrollar un programa que muestre la tabla de multiplicar
    * del 5 al 50

 */

public class EstructuraRepetitivaFor {
    public static void main(String[] args) {

        System.out.println("Tablas de multiplicar del 5 - 50");

        for(int i = 5; i <= 50; i++){
            String box = "______________________";
            if(i > 9){
                box += "_";
            }
            System.out.println("Tabla de multiplicar del numero: "+ i);
            System.out.println(box);
            for(int j = 1; j <=12; j++){
                int result = 0;
                String spaces = "", num_J = "";
                result = i * j;

                if( Integer.toString(j).length() == 1){
                    num_J += "   ";
                } else if (Integer.toString(j).length() == 2) {
                    num_J += "  ";
                }

                if(Integer.toString(result).length() == 1){
                    spaces += "    ";
                } else if ( Integer.toString(result).length() == 2) {
                    spaces += "   ";
                } else if (Integer.toString(result).length() > 2) {
                    spaces += "  ";
                }

                System.out.println("|  "+ i+ " " + " x "+" "+ j+ num_J + " = " + result + spaces + "|");
            }
            System.out.println(box+"\n");
        }
        System.out.println("Gracias por usar el programa :)");

    }
}
