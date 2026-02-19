import java.util.Random;
import java.util.Scanner;

public class RotarMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrizDada = pedirMatriz(sc);
        int[][] matrizRotada = rotar(matrizDada);

        System.out.println("La matriz dada");
        for (int i = 0; i < matrizDada.length; i++) {
            for (int j = 0; j < matrizDada[i].length; j++) {
                System.out.print(matrizDada[i][j] + " ");
                
            }
            System.out.println();
        }

        System.out.println("La matriz rotada");
        for (int i = 0; i < matrizRotada.length; i++) {
            for (int j = 0; j < matrizRotada[i].length; j++) {
                System.out.print(matrizRotada[i][j] + " ");
            }
            System.out.println();
        }
        
    }

    public static int[][] rotar(int[][] matriz) {
        int[][] rotada = new int[matriz.length][matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                rotada[j][matriz.length - 1 - i] = matriz[i][j];
            }
        }

        return rotada;
    }

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
