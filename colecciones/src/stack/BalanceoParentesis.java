package stack;

import java.util.Scanner;
import java.util.Stack;

public class BalanceoParentesis {
    public static void main(String[] args) {
        /*Escribe un programa que utilice un Stack<Character> para verificar si los paréntesis en una cadena están balanceados. Por ejemplo, "(a+b)" es válido, pero "(a+b]" o "((a+b)" no lo son. */
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame una expresión: ");
        String expr = sc.nextLine();

        System.out.println((estaBalanceada(expr)) ? "Está balanceada" : "No está balanceada");

        sc.close();
    }

    public static boolean estaBalanceada(String expresion) {
        Stack<Character> pila = new Stack<>();

        for (int i = 0; i < expresion.length(); i++) {
            if (expresion.charAt(i) == '(') {
                pila.push('(');
            }

            if (expresion.charAt(i) == ')') {
                if (!pila.isEmpty()) {
                    pila.pop();
                } else {
                    return false;
                }
            }
        }

        if (pila.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

}
