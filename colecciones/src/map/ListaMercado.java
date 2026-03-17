package map;
import java.util.*;

public class ListaMercado {
    public static void main(String[] args) {
        /*Escribe un programa que utilice un HashMap<String, ArrayList<String>> donde las claves sean categorías (por ejemplo, "Frutas", "Verduras") y los valores sean listas de elementos pertenecientes a esa categoría. 

        Crea un menú que permita agregar categorías al catálogo, agregar productos a una categoría y mostrar todas las categorías y sus elementos. */
        Scanner sc = new Scanner(System.in);
        int opc;

        HashMap<String, ArrayList<String>> categorias = new HashMap<>(); 
        ArrayList<String> frutas = new ArrayList<>(); 
        frutas.add("Manzana");
        frutas.add("Plátano");

        ArrayList<String> verduras = new ArrayList<>(); 
        verduras.add("Tomate");
        verduras.add("Pimiento");

        categorias.put("Frutas", frutas);
        categorias.put("Verduras", verduras);

        do {
            opc = menu(sc);

            switch (opc) {
                case 1:
                    anadirCategoria(categorias, sc);
                    break;

                case 2:
                    anadirProductos(categorias, sc);
                    break;

                case 3:
                    mostrarCatYProds(categorias);
                    break;
            
                default:
                    System.out.println("\nGracias por usar la tienda.");
                    break;
            }
        } while (opc != 0);

    
        sc.close();
    }

    public static HashMap<String, ArrayList<String>> anadirCategoria(HashMap<String, ArrayList<String>> categorias, Scanner sc) {
        System.out.println();
        String categoria;
        
        do {
            System.out.print("¿Qué categoría nueva quieres añadir?: ");
            categoria = sc.nextLine();
            
            if (categorias.containsKey(categoria)) {
                System.out.println("Esta categoría ya existe. Intenta añadir otra.");
                System.out.println();
            }
        } while (categorias.containsKey(categoria));
           
        categorias.put(categoria, new ArrayList<String>());
        System.out.println("\nCategoría añadida correctamente");
      
        return categorias;
    }

    public static HashMap<String, ArrayList<String>> anadirProductos(HashMap<String, ArrayList<String>> categorias, Scanner sc) {
        String eleccionCategoria;
        
        do {
            mostrarCatYProds(categorias);
            System.out.print("¿En cuál de estas categorías quieres añadir productos?: ");
            eleccionCategoria = sc.nextLine();

            if (!categorias.containsKey(eleccionCategoria)) {
                System.out.println("No existe ninguna categoría con ese nombre. Inténtalo de nuevo.");
            }
        } while (!categorias.containsKey(eleccionCategoria));

        
        System.out.print("Añade el producto: ");
        String producto = sc.nextLine();

        categorias.get(eleccionCategoria).add(producto);

        System.out.println("\nProducto añadido correctamente");
        System.out.println();

        return categorias;
    }

    public static void mostrarCatYProds(HashMap<String, ArrayList<String>> categorias) {
        System.out.println();
        for (Map.Entry<String, ArrayList<String>> categoria : categorias.entrySet()) {
            System.out.println(categoria.getKey());
            
            if (categoria.getValue().isEmpty()) {
                System.out.println("No hay productos añadidos.");
            } else {
                System.out.println(String.join(", ", categoria.getValue()));
            }
            System.out.println();
        }
    }

    public static int menu(Scanner sc) {
        System.out.println();
        System.out.println("..------ Tienda ------..");
        System.out.println("1. Añadir categoría");
        System.out.println("2. Añadir productos");
        System.out.println("3. Mostrar lista de productos");
        System.out.println("0. Salir");
        System.out.print("\tSelecciona una opción: ");


        return Integer.parseInt(sc.nextLine());
    }
}
