import java.util.Scanner;

public class ValidadorContrasena {

    public static boolean esSegura(String contrase) {
        

        
        boolean correcta = true;

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

            if (contrase.substring(0, 1).equals(contrase.substring(0, 1))) {
                correcta = true;
            } else {
                correcta = false;
                System.out.println("Debe empezar por mayúscula");
            }

            Character numero = contrase.charAt(-1);
            if (Character.isDigit(numero)) {
                correcta = true;
            } else {
                correcta = false;
                System.out.println("Debe haber un número al final");
            }

        return true;
            
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una contraseña");
        //contrase = sc.nextLine();
           
           
            
        


    }
}
