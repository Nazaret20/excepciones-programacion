public class CuentaBancaria {
    private double saldo = 0;

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void retirar(double cantidad) throws SaldoInsuficienteException {
        
        if (cantidad < 0) {
            throw new IllegalArgumentException("Cantidad negativa");
        }
        
        if (cantidad > this.saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
        saldo -= cantidad;
        
    }

    /*---------------------- */
    public double getSaldo() {
        return saldo;
    }
 
    
}
