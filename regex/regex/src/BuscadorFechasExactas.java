import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BuscadorFechasExactas {

    public static void main(String[] args) {
        // Texto de prueba con fechas válidas e inválidas para probar el patrón
        String texto = "Eventos confirmados: 15/05/2024, 31/12/2025 y 01/01/2000. " +
                       "Ignorar: 99/99/2024 (inválida) y 15/05/1995 (fuera de rango siglo XXI).";
        
        // Tu patrón específico para fechas dd/mm/20xx
        Pattern patron3 = Pattern.compile("(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/(20[0-9]{2})");
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
                System.out.printf("%2d.- Patrón encontrado entre posiciones %d y %d: %s\n",
                    numVeces, inicio, fin, texto.substring(inicio, fin));
            }
        } while (patronEncontrado);

        // Resumen final
        if (numVeces == 0) {
            System.out.println("No se encontraron fechas válidas en el siglo XXI.");
        } else {
            System.out.printf("\nSe han encontrado %d fechas válidas.", numVeces);
        }
    }
}