import java.util.Arrays;
import java.util.Scanner;

public class SumaDiagonales {
    public static void main(String[] args) throws Exception {
        // Para construir una matriz cuadrada pide al usuario su tamaño y rellénala con
        // números aleatorios, crea una función para calcular la suma de la diagonal
        // principal y otra para la secundaria.
        // Por ejemplo, para:
        // 0 1 2
        // 3 4 5
        // 6 7 8
        // La diagonal principal es 0 + 4 + 8 = 12
        // La diagonal secundaria es 2 + 4 + 6 = 12
        Scanner sc = new Scanner(System.in);

        int[][] fn = pedirArrayInt(sc);
        System.out.println(Arrays.toString(fn[filas][col]));

        
    }

    // public static int sumaMatriz(int[][] arr) {

    // }

    public static int[][] pedirArrayInt(Scanner sc) {
        System.out.print("Dime las filas de array que me vas dar: ");
        int filas = Integer.parseInt(sc.nextLine());
        System.out.print("Dime las columnas de array que me vas dar: ");
        int col = Integer.parseInt(sc.nextLine());

        int[][] numeros = new int[filas][col];

        return numeros;
    }
}
