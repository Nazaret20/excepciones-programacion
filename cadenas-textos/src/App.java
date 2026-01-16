import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String respuesta, txt, palabraSust;
        int contador = 0, posicion = 0;
        boolean sustituir = false;
        
        System.out.print("Dime un texto: ");
        txt = sc.nextLine();

        System.out.print("Dime una palabra para buscar: ");
        respuesta = sc.nextLine();

        do {
            posicion = txt.toLowerCase().indexOf(respuesta.toLowerCase(), posicion + 1);

            //if (posicion != -1) {
                contador++;
            //}
          
        } while (posicion != -1);
        
        System.out.printf("La palabra %s aparece %d veces en el texto.\n", respuesta, contador);

        System.out.print("¿Quieres sustituir la palabra? (s/n): ");

        if (sc.nextLine().equals("s")) {
            System.out.print("¿Por qué palabra quieres sustituir?: ");
            palabraSust = sc.nextLine();

            String nuevoTxt = txt.toLowerCase().replace(respuesta.toLowerCase(), palabraSust);
            System.out.println("El nuevo texto es: \n" + nuevoTxt);
        }

        sc.close();
    }
}
