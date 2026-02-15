import java.util.Random;
import java.util.Scanner;

public class TransponerMatriz {
    public static void main(String[] args) {
        /*
         * Escribe un programa que calcule la transpuesta de una matriz (se obtiene
         * intercambiando sus filas por columnas)
         * 
         * Por ejemplo:
         * 0 1 2 3
         * 4 5 6 7
         * 
         * Será:
         * 0 4
         * 1 5
         * 2 6
         * 3 7
         */
        Scanner sc = new Scanner(System.in);

        int[][] matrizGenerada = pedirMatriz(sc);

        int[][] fn = transpuesta(matrizGenerada);

        System.out.println("\nLa matriz generada es: ");
        for (int i = 0; i < matrizGenerada.length; i++) {
            for (int j = 0; j < matrizGenerada[i].length; j++) {
                System.out.printf("%3d", matrizGenerada[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nLa matriz transpuesta es: ");
        for (int i = 0; i < fn.length; i++) {
            for (int j = 0; j < fn[i].length; j++) {
                System.out.printf("%3d", fn[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }

    /*---------------------------------- */
    public static int[][] transpuesta(int[][] matriz) {
        int[][] matTranspuesta = {};
        int contI = 0;
        int contJ = 0;

        for (int i = 0; i < matriz.length; i++) {
            contI = matriz.length;
            contJ = matriz[i].length;
        }
        matTranspuesta = new int[contJ][contI];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matTranspuesta[j][i] = matriz[i][j];
            }
        }

        return matTranspuesta;
    }
    /*---------------------------------- */
    public static int[][] pedirMatriz(Scanner sc) {
        System.out.print("Dime las filas de array que me vas dar: ");
        int filas = Integer.parseInt(sc.nextLine());
        System.out.print("Dime las columnas de array que me vas dar: ");
        int col = Integer.parseInt(sc.nextLine());
        System.out.print("Dime el rango que quieres (0-100): ");
        int rango = Integer.parseInt(sc.nextLine());

        int[][] numeros = new int[filas][col];

        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                int num = random.nextInt(rango);
                numeros[i][j] = num;
            }
        }

        return numeros;
    }
}
