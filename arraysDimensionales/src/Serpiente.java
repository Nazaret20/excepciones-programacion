import java.util.Scanner;

public class Serpiente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.print("Tamaño de la matriz: ");
        //int n = Integer.parseInt(sc.nextLine());
        int n = 4;
        imprimirMatriz(generarSerptiente(n));

        sc.close();
    }

    public static int[][] generarSerptiente(int n) {
        int[][] serpiente = new int[n][n];

        int contador = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                serpiente[i][j] = contador++;
            }
        }

        for (int i = 0; i < serpiente.length; i++) {
             for (int j = serpiente.length - 1; j < serpiente.length; j--) {
                serpiente[i][j--] = contador++;
            }
        }

       

        return serpiente;
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
