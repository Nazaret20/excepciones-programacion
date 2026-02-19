import java.util.Scanner;

public class MatrizEspiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tamaño de la matriz: ");
        int n = Integer.parseInt(sc.nextLine());
        imprimirMatriz(generarMatriz(n));

        sc.close();
    }

    public static int[][] generarMatriz(int n) {
        int[][] matriz = new int[n][n];

        int contador = 1;
        int initFila = 0;
        int finFila = n - 1;
        int initCol = 0;
        int finCol = n - 1;

        while (contador <= n * n) {
            // izq a dcha
            for (int j = initCol; j <= finCol; j++) {
                matriz[initCol][j] = contador++;
            }
            initFila++;

            // arriba a abajo
            for (int i = initFila; i <= finFila; i++) {
                matriz[i][finCol] = contador++;
            }
            finCol--;

            // dcha a izq
            for (int j = finCol; j >= initCol; j--) {
                matriz[finFila][j] = contador++;
            }
            finFila--;

            // abajo a arriba
            for (int i = finFila; i >= initFila; i--) {
                matriz[i][initCol] = contador++;
            }
            initCol++;

        }

        return matriz;
    }

    public static void imprimirMatriz(int[][] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.printf("%3d", numeros[i][j]);
            }
            System.out.println();
        }
    }
}
