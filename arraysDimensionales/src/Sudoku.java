import java.util.Arrays;

public class Sudoku {
    public static void main(String[] args) {
        /*
         * Desarrolla un programa que verifique si una matriz 9x9 es una solución válida
         * de Sudoku.
         * Debe comprobar filas, columnas y submatrices 3x3.
         */

        int[][] sudokuBien = { 
          {5, 3, 4, 6, 7, 8, 9, 1, 2},
          {6, 7, 2, 1, 9, 5, 3, 4, 8},
          {1, 9, 8, 3, 4, 2, 5, 6, 7},
          {8, 5, 9, 7, 6, 1, 4, 2, 3},
          {4, 2, 6, 8, 5, 3, 7, 9, 1},
          {7, 1, 3, 9, 2, 4, 8, 5, 6},
          {9, 6, 1, 5, 3, 7, 2, 8, 4},
          {2, 8, 7, 4, 1, 9, 6, 3, 5},
          {3, 4, 5, 2, 8, 6, 1, 7, 9} 
          };

        int[][] sudokuMal = { 
          {5, 3, 3, 6, 7, 8, 9, 1, 2},
          {6, 7, 2, 1, 9, 5, 3, 4, 8},
          {1, 9, 8, 3, 4, 2, 5, 6, 7},
          {8, 5, 9, 7, 6, 1, 4, 2, 3},
          {4, 2, 6, 7, 5, 3, 7, 9, 1},
          {7, 1, 3, 9, 2, 4, 8, 5, 6},
          {9, 6, 1, 5, 3, 4, 2, 8, 4},
          {2, 8, 7, 4, 1, 9, 2, 3, 5},
          {3, 4, 5, 2, 8, 6, 1, 7, 9} 
        };

        boolean sudokuValido = validacionSudoku(sudokuBien);
        boolean sudokuInvalido = validacionSudoku(sudokuMal);

        System.out.println("sudoku bien : " + sudokuValido);
        System.out.println("sudoku mal : " + sudokuInvalido);
    }

    public static boolean validacionSudoku(int[][] sudoku) {
        boolean cols = validarColumnas(sudoku);
        boolean filas = validarFilas(sudoku);
        boolean submatrices = validarSubmatriz(sudoku);
        return cols && filas && submatrices;
    }

    public static boolean validarFilas(int[][] sudoku) {
        for (int i = 0; i <= sudoku.length - 1; i++) {
            int[] array = sudoku[i];
            boolean valido = validarArray(array);
            if (valido == false) { 
                return false; 
            }
        } 
        return true;
    }

    
    public static boolean validarColumnas(int[][] sudoku) {
          int[] array = new int[sudoku.length];
        for (int i = 0; i < sudoku.length ; i++) {
            for (int j = 0; j < sudoku.length; j++) {
                int num = sudoku[j][i];
                array[j] = num;
            } 
            boolean valido = validarArray(array);
            if (valido == false) { 
                return false; 
            }
        }
        return true;
    }

    public static boolean validarArray(int[] array) {
    int[] comprobar = crearArray(array.length);
    int[] ceros = crearArray(array.length);
    for (int i = 0; i < comprobar.length; i++) {
        for (int j = 0; j < array.length; j++) {
            if (comprobar[i] == array[j]) {
                int numSalido = ceros[i];
                if (numSalido == 0) {
                    return false;
                }
                ceros[i] = 0;
            }
        }
    }
    return true;
    }

    public static int[] crearArray(int tamanio) {
        int[] array = new int[tamanio];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public static boolean validarSubmatriz(int[][] sudoku) {
    // recorre las "esquinas" de cada subcuadro 3x3
    for (int filaInicio = 0; filaInicio < sudoku.length; filaInicio += 3) {
        for (int colInicio = 0; colInicio < sudoku.length; colInicio += 3) {

            int[] submatriz = new int[sudoku.length];
            int contador = 0;

            // recorre el 3x3
            for (int i = filaInicio; i < filaInicio + 3; i++) {
                for (int j = colInicio; j < colInicio + 3; j++) {
                    submatriz[contador] = sudoku[i][j];
                    contador++;
                }
            }
            boolean valido = validarArray(submatriz);
            if (valido == false) { 
                return false; 
            }
        }
    }
    return true;
}
     





    // public static void imprimirMatriz(int[][] numeros) {
    //     for (int i = 0; i < numeros.length; i++) {
    //         for (int j = 0; j < numeros[i].length; j++) {
    //             System.out.printf("%3d", numeros[i][j]);
    //         }
    //         System.out.println();
    //     }
    // }
}
