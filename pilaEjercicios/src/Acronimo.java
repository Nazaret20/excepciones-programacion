import java.util.Scanner;
import java.util.StringTokenizer;

public class Acronimo {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String frase, siglas, palabra;
        
        System.out.print("Introduce un nombre para generar el acrónimo: ");
        frase = sc.nextLine();

        StringTokenizer st = new StringTokenizer(frase);
        
        siglas = "";

        while (st.hasMoreTokens()) {
            palabra = st.nextToken();

            if (palabra.length() > 2) {
                if (!palabra.equals(palabra.toUpperCase())) {
                    siglas += palabra.substring(0, 1).toUpperCase();
                }
            }
        }
        System.out.printf("El acrónimo de la frase \"%s\" es: %s", frase, siglas);
        sc.close();

    }
}
