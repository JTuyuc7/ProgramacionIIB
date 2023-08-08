package ProyectoConcesionaria;
import java.util.*;

/*
    ?Mostrar los productos del inventario
 */

public class LeerInventario {

    //? Utils
    Utils utils = new Utils();
    public void mostrarProductosInventario(String filePath){

        float unidadades_totales = 0, cantidad_total = 0;
        //? Leer los datos para mostrarlos formateados
        List<String> proudctos;
        //? Productos
        proudctos = utils.openData(filePath);

        if(proudctos.size() == 0){
            utils.emptyDataList("| Lo siento!!! No hay productos ");
        }else {
            utils.headerBox();
            for (String single_product : proudctos) {
                unidadades_totales += utils.getFieldsProducts(single_product).unidadesProductoData;
                cantidad_total += utils.getFieldsProducts(single_product).totalProductPrice;
                utils.bodyBox(utils.getFieldsProducts(single_product).codigoProducto, utils.getFieldsProducts(single_product).nombreProducto, utils.getFieldsProducts(single_product).unidadesProductoData, utils.getFieldsProducts(single_product).precioProducto, utils.getFieldsProducts(single_product).totalProductPrice, utils.getFieldsProducts(single_product).date);
            }
            utils.footerBox(unidadades_totales, cantidad_total);
        }
    }
}
