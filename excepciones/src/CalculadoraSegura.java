mport java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraSegura {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int resultado = 0;
        boolean continuar = true;

        while (continuar) {
            try {
                System.out.print("Dime el primer número: ");
                int num1 = Integer.parseInt(sc.nextLine());

                System.out.print("Dime el segundo número: ");
                int num2 = Integer.parseInt(sc.nextLine());

                System.out.print("Dime la operación (+, -, *, /): ");
                String oper = sc.nextLine();

                switch (oper) {
                    case "+":
                        resultado = num1 + num2;
                        break;

                    case "-":
                        resultado = num1 - num2;
                        break;

                    case "*":
                        resultado = num1 * num2;
                        break;

                    case "/":
                        resultado = num1 / num2;
                        break;
                }

                System.out.printf("El resultado de %d %s %d es %d", num1, oper, num2, resultado);
            } catch (ArithmeticException ae) {
                System.out.println("ERROR: " + ae.getMessage());
            } catch (InputMismatchException ime) {
                System.out.println("ERROR: " + ime.getMessage());
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }

            System.out.print("\n¿Quieres intentarlo de nuevo (s/n)? ");
            String respuesta = sc.nextLine();

/*             if(respuesta.equals("s"))
                continuar = true;
            else
                continuar = false;
*/
            continuar = respuesta.equals("s");
        }
        sc.close();
    }
}