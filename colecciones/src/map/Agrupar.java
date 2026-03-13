package map;

import java.util.*;

public class Agrupar {
    public static void main(String[] args) {
        /*
        Escribe un programa que utilice un HashMap<String, ArrayList<String>> donde las claves sean categorías (por ejemplo, "Frutas", "Verduras") y los valores sean listas de elementos pertenecientes a esa categoría. 

        Crea un menú que permita agregar categorías al catálogo, agregar productos a una categoría y mostrar todas las categorías y sus elementos.
         */
        Scanner sc = new Scanner(System.in);
        int opc;

        HashMap<String, ArrayList<String>> listaMercado = new HashMap<>();
        
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Pera");
        listaMercado.put("Frutas", frutas);

        ArrayList<String> verduras = new ArrayList<>();
        verduras.add("Pimiento");
        verduras.add("Zanahoria");
        listaMercado.put("Verduras", verduras);

        do {
            menu(sc);          
            opc = Integer.parseInt(sc.nextLine()); 
            
            switch (opc) {
                case 1:
                    anadirCategoria();
                    break;

                case 2:
                    anadirProducto();
                    break;
            
                default:
                    break;
            }
        } while (opc != 0);

        sc.close();

    }

    public static void anadirCategoria(Scanner sc, HashMap<String, ArrayList<String>> listaMercado) {
        System.out.print("Añade la categoría: ");
        String cat = sc.nextLine();
        listaMercado.put(cat, null);
    }

    public static void anadirProducto(HashMap<String, ArrayList<String>> listaMercado) {
        System.out.println("¿En qué categoría quieres añadir producto?");
        mostrarCategorias(listaMercado);
        System.out.print("Añade el producto: ");
        String cat = sc.nextLine();
        listaMercado.keySet(cat);
    }

    public static void mostrarCategorias(HashMap<String, ArrayList<String>> listaMercado) {
        for (Map.Entry<String, ArrayList<String>> categoria : listaMercado.entrySet()) {
            System.out.println(categoria.getKey());
        }
    }


    public static void menu(Scanner sc) {
        System.out.println();
        System.out.println("1. Añadir categoría");
        System.out.println("2. Añadir producto");
        System.out.println("3. Mostrar categorías y productos");
        System.out.println("0. Salir");
        System.out.print("Introduce tu opción: ");
    }
}
