import java.util.Scanner;

public class ValidadorContrasena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contrase;
        boolean correcta = true;

        System.out.println("Introduce una contraseña");
        contrase = sc.nextLine();

        do {
            //Más de 8 carácteres
            if (contrase.length() < 8) {
                correcta = false;
                System.out.println("Debe tener al menos 8 carácteres");
            } else {
                correcta = true;
            }

            if (contrase.contains(" ")) {
                correcta = true;
            } else {
                correcta = false;
                System.out.println("Debe contener al menos un espacio");
            }

            if (contrase.startsWith(contrase.toUpperCase())) {
                correcta = true;
            } else {
                correcta = false;
                System.out.println("Debe empezar por mayúscula");
            }
            
            
        } while (!correcta);


    }
}
