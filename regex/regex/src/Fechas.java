import java.util.Scanner;

public class Fechas {
    public static void main(String[] args) {
        /*
         * Haz un programa que pida al usuario su nombre, fecha de nacimiento, email y
         * DNI, los valide mediante expresiones regulares, no permitiendo continuar si
         * el formato no es el correcto.
         */
        Scanner sc = new Scanner(System.in);
        String nombre, fecha, email, dni;

        do {
            System.out.print("Introduce tu nombre y apellidos: ");
            nombre = sc.nextLine();
        } while (!esNombre(nombre));

        do {
            System.out.print("Introduce tu fecha de nacimiento (01/01/2026): ");
            fecha = sc.nextLine();
        } while (!esNombre(fecha));

        do {
            System.out.print("Introduce tu email: ");
            email = sc.nextLine();
        } while (!esNombre(email));

        do {
            System.out.print("Introduce tu DNI: ");
            dni = sc.nextLine();
        } while (!esNombre(dni));

    }

    public static boolean esNombre(String nombre) {
        return nombre.matches("^[A-Z][a-z]")
    }

    public static boolean esFecha(String fecha) {
        return fecha.matches("(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/(20[0-1][0-9]|202[0-6]|19[5-9][0-9])");
    }

    public static boolean esEmail(String email) {
        return email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}");
    }
    
    public static boolean esDni(String dni) {
        return dni.matches("[0-9]{8}[A-Z]");
    }

    // public static String[] preguntas(Scanner sc) {
    // String[] resultado = new String[4];

    // System.out.print("Introduce tu nombre y apellidos: ");
    // String nombre = sc.nextLine();

    // System.out.print("Introduce tu fecha de nacimiento (01/01/2026): ");
    // int fecha = Integer.parseInt(sc.nextLine());

    // System.out.print("Introduce tu email: ");
    // String email = sc.nextLine();

    // System.out.print("Introduce tu DNI: ");
    // int dni = Integer.parseInt(sc.nextLine());
    // }

}
