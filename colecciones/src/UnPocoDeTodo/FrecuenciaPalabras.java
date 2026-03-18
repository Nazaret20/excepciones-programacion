package UnPocoDeTodo;

import java.util.Arrays;
import java.util.Scanner;

public class FrecuenciaPalabras {
    public static void main(String[] args) {
        /*Escribe un programa que lea un texto del usuario y haga su mapa de frecuencia (cuente cuántas veces aparece cada palabra) utilizando colecciones o mapas. */
        Scanner sc = new Scanner(System.in);

        String[] fraseDada = preguntar(sc);
        System.out.println(fraseDada.length);

    }

    public static String[] preguntar(Scanner sc) {
        System.out.print("Dame una frase: ");
        String frase = sc.nextLine().trim();
        String[] fraseSplit = frase.split(" ");
        return fraseSplit;
    }
}
