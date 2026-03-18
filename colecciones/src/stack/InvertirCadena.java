package stack;

import java.util.Scanner;
import java.util.Stack;

public class InvertirCadena {
    public static void main(String[] args) {
        /*Escribe un programa que lea una cadena de texto del usuario e invierta su contenido usando un Stack<Character>. Por ejemplo, si la entrada es hola, la salida será aloh. */
        Scanner sc = new Scanner(System.in);
        Stack<Character> text = new Stack<>();
        System.out.print("Dame una palabra: ");
        String palabra = sc.nextLine();

        for (int i = 0; i < palabra.length(); i++) {
            text.push(palabra.charAt(i));
        }

        while (!text.isEmpty()) {
            System.out.print(text.pop());
        }

        sc.close();
    }
}
