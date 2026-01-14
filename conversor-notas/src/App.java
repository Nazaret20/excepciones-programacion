import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ConversorNotas cn = new ConversorNotas();
        boolean notaValida = false;

        do {
            try {
                System.out.print("Dime una nota: ");
                int nota = Integer.parseInt(sc.nextLine());

                String notaStr = cn.conversor(nota);
                System.out.println("La nota corresponde a: " + notaStr);

                notaValida = true; // ← sale del bucle

            } catch (NotaFueraDeRangoException e) {
                System.out.println("Error controlado: " + e.getMessage());

            } catch (NumberFormatException e) {
                System.out.println("Error: debes introducir un número entero");

            } finally {
                if (notaValida) {
                    System.out.println("Gracias por usar el programa");
                } else {
                    System.out.println("Inténtalo de nuevo");
                }
            }

        } while (!notaValida);

        sc.close();
    }
}
