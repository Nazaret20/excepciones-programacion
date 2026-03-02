import java.util.Arrays;

public class EjercicioBingo {
    public static void main(String[] args) throws Exception {
     
        //1. Crear un array para almacenar los números que han salido
        int[] numerosSalidos = {1, 2, 5, 10, 11, 12, 14, 15, 22, 55, 56, 57, 59, 60, 61, 66, 78, 89, 90};

        //2. Crear una matriz irregular para representar el cartón
        //Uso del objeto wrapper Integer para poder añadir null en vez de 0, ya que aunque visualmente 0 no signifique nada sigue siendo un valor en el array y entonces no sería una matriz irregular 
        Integer[][] carton = {{1, 2, 5, 9}, {11, 15, null, null}, {null, 22, null, 29}, {null, 34, null, null}, {null, null, 47, 49}, {null, 55, 59, 60}, {61, null, null, null}, {71, 75, null, null}, {null, null, 88, 90}};

        //3. Crear un array para guardar los resultados ("línea" o "no") por cada fila
        String[] resultado = new String[9];

        //4.
        mostrarCarton(carton);

        //5.
        numerosSalidos(numerosSalidos);

        //6.
        String[] verificarLinea = verificarFila(numerosSalidos, carton, resultado);
        System.out.println("\n\nBúsqueda de líneas del cartón de bingo: " + Arrays.toString(verificarLinea));
 
        //7.
        int lineasObtenidas = lineasObtenidas(verificarLinea);
        System.out.println("\nNúmero de líneas obtenidas: " + lineasObtenidas);

    }

    
    //4. Mostrar el contenido del cartón
    public static void mostrarCarton(Integer[][] carton) {
        System.out.println("----====BINGO====----");
        for (int i = 0; i < carton.length; i++) {
            for (int j = 0; j < carton[i].length; j++) {
                if (carton[i][j] == null) {
                    //Con este format tendrán siempre el mismo tamaño
                    System.out.printf("%5s", "-");
                } else {

                    System.out.printf("%5d", carton[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println("----=============----");

    }

    //5. Mostrar la lista de números que han salido
    public static void numerosSalidos(int[] numerosSalidos) {
        System.out.println("\nLos números que han salido son: ");
        for (int i = 0; i < numerosSalidos.length; i++) {
            System.out.print(numerosSalidos[i] + " ");
        }
    }
    
    //6. Para cada fila del cartón:
    //      Verificar si todos sus números han salido
    //      Marcar como "línea" si todos salieron, "no" si falta alguno
    public static String[] verificarFila(int[] numerosSalidos, Integer[][] carton, String[] resultado) {
        for (int i = 0; i < carton.length; i++) {
            boolean linea = true;

            for (int j = 0; j < carton[i].length; j++) {
                //Dejamos a un lado los null en la condición, así solo tomamos los números
                if (carton[i][j] != null) {
                    boolean encontrado = false;

                    //Tercer bucle para comprobar los números del cartón sobre los números que han salido y si han salido, cambiamos encontrado
                    for (int k = 0; k < numerosSalidos.length; k++) {
                        if (numerosSalidos[k] == carton[i][j]) {
                            encontrado = true;
                        }
                    }

                    //Como por defecto linea está en true, hay que asignar que es false sino se ha completado con los números
                    if (encontrado == false) {
                        linea = false;
                    }
                }
            }

            //Cuando acaba, guardamos en el array de resultado según sea línea o no
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
