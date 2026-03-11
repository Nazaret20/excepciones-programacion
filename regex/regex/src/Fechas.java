import java.util.Scanner;

public class Fechas {
    public static void main(String[] args) {
        /*
         Haz un programa que pida al usuario su nombre, fecha de nacimiento, email y DNI, los valide mediante expresiones regulares, no permitiendo continuar si el formato no es el correcto.
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
        } while (!esFecha(fecha));

        do {
            System.out.print("Introduce tu email: ");
            email = sc.nextLine();
        } while (!esEmail(email));

        do {
            System.out.print("Introduce tu DNI: ");
            dni = sc.nextLine();
        } while (!esDni(dni));

        sc.close();
    }

    public static boolean esNombre(String nombre) {
        return nombre.matches("([A-Z][a-z]+)( [A-Za-z]+)( [A-Za-z]+)");
    }

    public static boolean esFecha(String fecha) {
        return fecha.matches("(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/(20[0-1][0-9]|202[0-6]|19[5-9][0-9])");
    }

    public static boolean esEmail(String email) {
        return email.toLowerCase().matches("[a-z][a-z0-9._-]{5,32}@[a-z][a-z0-9._-]{2,32}\\.[a-z]{2,32}");
    }
    
    public static boolean esDni(String dni) {
        return dni.matches("[0-9]{8}[A-Z]");
    }

    
    
}
