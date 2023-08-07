package ProyectoConcesionaria;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Utils {

    public void formatMsg(String text, Integer spaces, Boolean isLastOne ) {
        int blank_spaces_count;
        blank_spaces_count = spaces - text.length();
        String blank_spaces = " ", repeated;
        repeated = new String( new char[blank_spaces_count]).replace("\0", blank_spaces);

        if( isLastOne ){
            System.out.println(text+repeated + "|");
        }else{
            System.out.print(text+repeated + "|");
        }
    }

    public void boxFormating(String letter, Integer repeatedTimes){
        String repeatedCharacter;
        repeatedCharacter = new String( new char[repeatedTimes]).replace("\0", letter);
        System.out.println(repeatedCharacter);
    }

    //? Abrir el archivo y retornar la fino
    public List<String> openData(String filePath){
        List<String> products = new ArrayList<>();
        try {
            File readFile = new File(filePath);
            Scanner reader = new Scanner(readFile);

            while (reader.hasNextLine()){
                String data = reader.nextLine();
                products.add(data);
            }
        }catch (FileNotFoundException e){
            //? System.out.println("Something went wrong");
            return products;
        }
        return products;
    }

    //? Mostrar mensaje si no hay datos
    public void emptyDataList(String msg){
        boxFormating("*", 65);
        formatMsg(msg,65, true);
        boxFormating("*", 65);
    }

    public void headerBox(){
        boxFormating("_", 120);
        formatMsg("| Codigo del Producto", 22, false);
        formatMsg(" Nombre del Producto",23, false);
        formatMsg(" Cantidad en Existencia",23, false);
        formatMsg(" Precio Unitario", 18, false);
        formatMsg(" Total", 30, true);
        boxFormating("_", 120);
    }

    public void bodyBox(String codigo_producto, String nombre_producto, Integer unidades, Float precio, Float total){
        formatMsg("| " + codigo_producto, 22, false);
        formatMsg(" "+nombre_producto.replace("-", " "),23, false);
        formatMsg(" "+ unidades,23, false);
        formatMsg(" " + precio, 18, false);
        formatMsg(" "+ total, 30, true);
    }

    public void footerBox(Float unidadades_totales, Float cantidad_total){
        boxFormating("_", 120);
        formatMsg("| ", 22, false);
        formatMsg(" ",23, false);
        formatMsg(" "+ unidadades_totales,23, false);
        formatMsg(" " , 18, false);
        formatMsg(" "+ cantidad_total+ " Gran Total", 30, true);
        boxFormating("_", 120);
    }

    public ProductType getFieldsProducts(String product){
        List<String> myList = new ArrayList<>(Arrays.asList(product.split(" ")));
        String codigo_producto = myList.get(0);
        String nombre_producto = myList.get(1);
        int unidades = Integer.parseInt(myList.get(myList.size() - 2));
        float precio = Float.parseFloat(myList.get(myList.size() - 1));
        float total = unidades * precio;

        ProductType single_product = new ProductType();
        single_product.codigoProducto = codigo_producto;
        single_product.nombreProducto = nombre_producto;
        single_product.unidadesProductoData = unidades;
        single_product.precioProducto = precio;
        single_product.totalProductPrice = total;
        return single_product;
    }

    static class ProductType {
        public String codigoProducto;
        public String nombreProducto;
        public Integer unidadesProductoData;
        public Float precioProducto;
        public Float totalProductPrice;

    }
}
