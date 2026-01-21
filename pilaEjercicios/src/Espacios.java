import java.util.Scanner;
import java.util.StringTokenizer;

public class Espacios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime una frase: ");
        String frase = sc.nextLine();

        String fraseSinEspacios = frase.trim();
        String replaceArroba = fraseSinEspacios.replace("a", "@");

        StringTokenizer tokens = new StringTokenizer(replaceArroba);

        String fraseFinal = "";

        while (tokens.hasMoreTokens()) {
            String palabra = tokens.nextToken();
            fraseFinal = palabra + " " + fraseFinal;
        }

        System.out.println(fraseFinal.trim());
        

        sc.close();
    }
}
