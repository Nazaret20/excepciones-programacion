package map;

import java.util.HashMap;
import java.util.Map;

public class ValorMasAlto {
    public static void main(String[] args) {
        HashMap<String, Double> listado = new HashMap<>();
        listado.put("Chocolate", 1.50);
        listado.put("Manzana", 0.80);
        listado.put("Móvil", 450.99);
        listado.put("Mesa pequeña madera", 150.50);

        double max = 0.0;
        String productoFinal = "";

        for (Map.Entry<String, Double> producto : listado.entrySet()) {
            if (producto.getValue() > max) {
                max = producto.getValue();
                productoFinal = producto.getKey();
            }
        }

        System.out.println("El precio más alto de " + listado.toString() + " es " + productoFinal + " con un precio de " + max);
    }

    
}
