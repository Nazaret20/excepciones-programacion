import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String respuesta, txt;
        int contador = 0, posicion = 0;
        
        System.out.print("Dime un texto: ");
        txt = sc.nextLine();

        System.out.print("Dime una palabra para buscar: ");
        respuesta = sc.nextLine();

        do {
            posicion = txt.indexOf(respuesta, posicion + 1);

            if (posicion != -1) {
                contador++;
            }

        } while (posicion != -1);

        System.out.printf("La palabra %s aparece %d veces en el texto." , respuesta, contador);

        sc.close();
    }
}
