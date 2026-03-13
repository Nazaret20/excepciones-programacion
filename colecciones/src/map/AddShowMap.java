package map;

import java.util.*;

public class AddShowMap {
    public static void main(String[] args) {
        /*Crea un programa que utilice un HashMap<String, Integer> para almacenar los nombres de personas como claves y sus edades como valores. Agrega al menos 5 entradas y luego imprime todas las claves y valores utilizando un bucle. */

        HashMap<String, Integer> listaPersonas = new HashMap<>();
        listaPersonas.put("Violeta", 25);
        listaPersonas.put("Ariel", 25);
        listaPersonas.put("Jenna", 10);
        listaPersonas.put("Aurora", 5);
        listaPersonas.put("Andrea", 20);

        for (Map.Entry<String, Integer> persona : listaPersonas.entrySet()) {
            System.out.println("El nombre: " + persona.getKey() + ", edad: " + persona.getValue());
        }
    }

}
