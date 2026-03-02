import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
     
        //Crear un array para almacenar los números que han salido
        //Crear una matriz irregular para representar el cartón
        //Crear un array para guardar los resultados ("línea" o "no") por cada fila
        int[] numerosSalidos = {1, 2, 5, 10, 11, 12, 14, 15, 22, 55, 56, 57, 59, 60, 61, 66, 78, 89, 90};

        Integer[][] carton = {{1, 2, 5, 9}, {11, 15, null, null}, {null, 22, null, 29}, {null, 34, null, null}, {null, null, 47, 49}, {null, 55, 59, 60}, {61, null, null, null}, {71, 75, null, null}, {null, null, 88, 90}};

        String[] resultado = new String[9];

        mostrarCarton(carton);
        numerosSalidos(numerosSalidos);

        String[] verificarLinea = verificarFila(numerosSalidos, carton, resultado);
        System.out.println("\n\nBúsqueda de líneas del cartón de bingo: " + Arrays.toString(verificarLinea));

        int lineasObtenidas = lineasObtenidas(verificarLinea);
        System.out.println("\nNúmero de líneas obtenidas: " + lineasObtenidas);

    }

    
    //Mostrar el contenido del cartón
    public static void mostrarCarton(Integer[][] carton) {
        System.out.println("----====BINGO====----");
        for (int i = 0; i < carton.length; i++) {
            for (int j = 0; j < carton[i].length; j++) {
                if (carton[i][j] == null) {
                    System.out.printf("%5s", "-");
                } else {

                    System.out.printf("%5d", carton[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println("----=============----");

    }

    //Mostrar la lista de números que han salido
    public static void numerosSalidos(int[] numerosSalidos) {
        System.out.println("\nLos números que han salido son: ");
        for (int i = 0; i < numerosSalidos.length; i++) {
            System.out.print(numerosSalidos[i] + " ");
        }
    }
    
    // Para cada fila del cartón:
    //      Verificar si todos sus números han salido
    //      Marcar como "línea" si todos salieron, "no" si falta alguno
    public static String[] verificarFila(int[] numerosSalidos, Integer[][] carton, String[] resultado) {
        for (int i = 0; i < carton.length; i++) {
            boolean linea = true;

            for (int j = 0; j < carton[i].length; j++) {
                if (carton[i][j] != null) {
                    boolean encontrado = false;

                    for (int k = 0; k < numerosSalidos.length; k++) {
                        if (numerosSalidos[k] == carton[i][j]) {
                            encontrado = true;
                        }
                    }

                    if (encontrado == false) {
                        linea = false;
                    }
                }
            }

            if (linea) {
                resultado[i] = "línea";
            } else {
                resultado[i] = "no";
            }
            
        }
        
       return resultado;
        
    }

    //Mostrar resultados finales:
    //      Estado de cada fila ("línea" o "no")
    //      Cantidad total de líneas completadas
    public static int lineasObtenidas(String[] verificarLinea) {
        int suma = 0;
        for (int i = 0; i < verificarLinea.length; i++) {
            if (verificarLinea[i].equals("línea")) {
                suma++;
            }
        }

        return suma;
    }

}
