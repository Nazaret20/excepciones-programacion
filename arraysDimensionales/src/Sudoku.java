public class Sudoku {
    public static void main(String[] args) {
        /*
         * Desarrolla un programa que verifique si una matriz 9x9 es una solución válida
         * de Sudoku.
         * Debe comprobar filas, columnas y submatrices 3x3.
         * 
         * Ejemplo de un Sudoku válido:
         * 
         * int[][] sudoku = { 
         * {5, 3, 4, 6, 7, 8, 9, 1, 2},
         * {6, 7, 2, 1, 9, 5, 3, 4, 8},
         * {1, 9, 8, 3, 4, 2, 5, 6, 7},
         * {8, 5, 9, 7, 6, 1, 4, 2, 3},
         * {4, 2, 6, 8, 5, 3, 7, 9, 1},
         * {7, 1, 3, 9, 2, 4, 8, 5, 6},
         * {9, 6, 1, 5, 3, 7, 2, 8, 4},
         * {2, 8, 7, 4, 1, 9, 6, 3, 5},
         * {3, 4, 5, 2, 8, 6, 1, 7, 9} 
         * };
         */

        int[][] sudoku = { 
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

        boolean validacionFila = validarFila(sudoku);
        
        if (validacionFila) {
            System.out.println("Fila válida");
        } else {
            System.out.println("Fila inválida");
        }
    }

    // public static boolean validacionSudoku(int[][] sudoku) {
    //     for (int i = 0; i < sudoku.length; i++) {
    //         for (int j = 0; j < sudoku[i].length; j++) {
    //             if (sudoku[i][j] == sudoku[i][j + 1]) {
    //                 return true;
    //             }
    //         }
    //     }
    // }

    public static boolean validarFila(int[][] sudoku) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        //int[] fila = new int[sudoku.length];

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                do {
                    
                    if (arr[i] == sudoku[i][j]) {
                        return true;
                    }
                } while (arr.length == arr[i]);
                    
                
            }
        }
        return false;
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
