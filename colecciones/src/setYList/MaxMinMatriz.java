package setYList;
import java.util.*;

public class MaxMinMatriz {
    public static void main(String[] args) {
        /*Haz un programa que genere una matriz de enteros y obtenga el valor máximo y el mínimo. */
        int[][] fnGenerarMatriz = generarMatriz();
        
        ArrayList<Integer> minYMax = minMax(fnGenerarMatriz);

        System.out.println("De la matriz: ");
        imprimir(fnGenerarMatriz);
        System.out.printf("El mínimo es %d y el máximo es %d", minYMax.get(0), minYMax.get(1));
        
    }

    public static ArrayList<Integer> minMax(int[][] matriz) {
        ArrayList<Integer> minMax = new ArrayList<>();

        TreeSet<Integer> numsMatriz = new TreeSet<>();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                numsMatriz.add(matriz[i][j]);
            }
        }

        int min = numsMatriz.first();
        int max = numsMatriz.last();

        minMax.add(min);
        minMax.add(max);

        return minMax;
    }

    public static int[][] generarMatriz() {
        Random rd = new Random();
        int fila = rd.nextInt(3) + 2;
        int col = rd.nextInt(3) + 2;
        int[][] matriz = new int[fila][col];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rd.nextInt(9) + 1;
            }
        }

        return matriz;
    }

    public static void imprimir(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
