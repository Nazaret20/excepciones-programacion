
import java.util.Random;
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
        imprimirMatriz(fn);
        int sumaDiagonalP = sumaMatrizP(fn);
        int sumaDiagonalS = sumaMatrizS(fn);
        System.out.printf("La diagonal principal es %d, y la secundaria es %d", sumaDiagonalP, sumaDiagonalS);

        sc.close();
        
    }

    public static int sumaMatrizP(int[][] arr) {
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i] == arr[j]) {
                    temp += arr[i][j];
                }
            }

        }
        return temp;
    }

    public static int sumaMatrizS(int[][] arr) {
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == arr.length - 1 - i) {
                    temp += arr[i][j];
                }
            }
        }

        return temp;
    }

    public static int[][] pedirArrayInt(Scanner sc) {
        System.out.print("Dime las filas de array que me vas dar: ");
        int filas = Integer.parseInt(sc.nextLine());
        System.out.print("Dime las columnas de array que me vas dar: ");
        int col = Integer.parseInt(sc.nextLine());

        int[][] numeros = new int[filas][col];

        Random random = new Random();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < col; j++) {
                int num = random.nextInt(10);
                numeros[i][j] = num;
            }
        }

        return numeros;
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