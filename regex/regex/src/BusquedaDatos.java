import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BusquedaDatos {
    public static void main(String[] args) {
        /*Haz un programa que pida al usuario un texto y nos diga cuántas fechas contiene, cuáles son y dónde están dentro del texto. */
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame un texto: ");
        String texto = sc.nextLine();

        Pattern patron3 = Pattern.compile("(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/(20[0-1][0-9]|202[0-6]|19[5-9][0-9])");
        Matcher acoplamiento = patron3.matcher(texto);

        boolean patronEncontrado;
        int numVeces = 0;

        // Bucle de búsqueda
        do {
            patronEncontrado = acoplamiento.find();
            
            if (patronEncontrado) {
                numVeces++;
                int inicio = acoplamiento.start();
                int fin = acoplamiento.end();
                
                // Imprime el hallazgo con formato
                System.out.printf("%2d.- Fecha encontrada entre posiciones %d y %d: %s\n",
                    numVeces, inicio, fin, texto.substring(inicio, fin));
            }
        } while (patronEncontrado);

        // Resumen final
        if (numVeces == 0) {
            System.out.println("No se encontraron fechas válidas.");
        } else {
            System.out.printf("\nSe han encontrado %d fechas.", numVeces);
        }

        sc.close();
    }
}

