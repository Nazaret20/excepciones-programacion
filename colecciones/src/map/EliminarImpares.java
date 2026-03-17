package map;

import java.util.ArrayList;
import java.util.Scanner;

public class EliminarImpares {
    public static void main(String[] args) {
        /*Crea una lista de números enteros. Escribe un programa que elimine todos los números impares de la lista y solo deje los números pares. */
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> listaNums = pedirLista(sc);
        
        ArrayList<Integer> listaPares = eliminarImpares(listaNums);
        
        System.out.println(listaNums);
        System.out.println(listaPares);
        sc.close();
    }

    public static ArrayList<Integer> eliminarImpares(ArrayList<Integer> listaNums) {
        ArrayList<Integer> listaPares = new ArrayList<>();

        for (Integer num : listaNums) {
            if (num % 2 != 0) {
                num = 0;
                //listaNums.remove(num);

            } else {
                listaPares.add(num);
            }
        }
        return listaPares;
    }

    public static ArrayList<Integer> pedirLista(Scanner sc){
        ArrayList<Integer> lista = new ArrayList<>();

        System.out.print("Cuántos números vas a darme? ");
        int num = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < num; i++) {
            System.out.print("Dame el número " + (i+1) + ": ");
            lista.add(Integer.parseInt(sc.nextLine()));
        }

        return lista;
    }
}
