import java.util.Arrays;

public class Islas {
    public static void main(String[] args) {
        /*
         * Dada una matriz donde 1 representa tierra y 0 representa agua, cuenta el
         * número de islas.
         * Una isla es un conjunto de 1's conectados horizontal o verticalmente.
         * 
         * Por ejemplo, para:
         * 
         * 0 1 1 0
         * 0 1 0 1
         * 1 0 0 1
         * 1 1 0 0
         */

        int[][] mapa = {{0, 1, 1, 0}, {0, 1, 0, 1}, {1, 0, 0, 1},{1, 1, 0, 0}};

        int cuantos = unosPorFila(mapa);
        System.out.println(cuantos);
        
    }

    public static int unosPorFila(int[][] mapa) {
       int contador = 0;
        
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 1; j < mapa[i].length - 1; j++) {
                if (mapa[i][j - 1] == 1 || mapa[i][j] == 1 || mapa[i][j + 1] == 1) {
                    contador++;
                } 
            }
            System.out.println("En la línea " + mapa[i] + " hay " + contador);
            
        }
        

        return contador;
        
    }
}
