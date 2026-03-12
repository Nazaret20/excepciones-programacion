import java.util.*;

public class SumaNumerosLista {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> listaNumeros = pedirLista(sc);
        int suma = 0;
        for (Integer numero : listaNumeros) {
            suma += numero;
        }

        System.out.println("La suma es " + suma);

        sc.close();
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