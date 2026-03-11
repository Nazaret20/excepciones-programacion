import java.util.HashSet;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Crea un programa que pida al usuario una frase y diga cuántas palabras únicas
         * contiene.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime una frase: ");
        String frase = sc.nextLine();
        String[] palabras = frase.split(" ");

        // Creamos un HashSet de nombres
        HashSet<String> conjunto = new HashSet<>();
        
        // Recorriendo elementos con un iterador
        for (String palabra : palabras) {
            conjunto.add(palabra);
        }

        // Imprimiendo todo el conjunto
        System.out.printf("Hay %d palabras únicas", conjunto.size());
        sc.close();
    }
}
