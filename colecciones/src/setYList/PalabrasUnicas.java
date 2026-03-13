package setYList;
import java.util.*;

public class PalabrasUnicas {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        HashSet<String> conjunto = new HashSet<>();

        System.out.print("Dime la frase: ");
        String texto = sc.nextLine();
        String[] palabras = texto.split(" ");

        for (int i = 0; i < palabras.length; i++) {
            conjunto.add(palabras[i]);
        }
//        for (String palabra : palabras) {
//            conjunto.add(palabra);
//        }

        System.out.printf("Hay %d palabras únicas",
            conjunto.size()
        );

        sc.close();
    }
}