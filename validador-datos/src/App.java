import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        CuentaBancaria cuenta = new CuentaBancaria(1000);
        

        System.out.print("Dime la cantidad a sacar: ");
        double cantidad = sc.nextDouble();

        try {
            cuenta.retirar(cantidad);
            System.out.println("Cantidad retirada correctamente. \nSaldo actual: " + cuenta.getSaldo());
        } catch (IllegalArgumentException e) {
            System.out.println("Error controlado: " + e.getMessage());
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error controlado: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error controlado: " + e.toString());
        }

        System.out.println("Finalizado correctamente");
        
        sc.close();
        
    }
}
