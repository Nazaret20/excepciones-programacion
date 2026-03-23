public class Reserva {
    private String nombreCliente, dniCliente;
    private Habitacion habitacion;
    private int noches;

    public Reserva(String nombreCliente, String dniCliente, int noches) {
        this.nombreCliente = nombreCliente;
        this.dniCliente = dniCliente;
        this.noches = noches;
    }

    public double calcularCosteTotal(Reserva reserva) {
        int precioNoche = 0;
        switch (dniCliente) {
            case "estandar":
                precioNoche = 50;
                break;
            case "suite":
                precioNoche = 100;
                break;
            case "deluxe":
                precioNoche = 200;
            default:
                break;
        }
        double costeTotal = precioNoche * reserva.getNoches();
        return costeTotal;
    }

    @Override
    public String toString() {
        return "Cliente: " + nombreCliente +
                "\nDNI: " + dniCliente +
                "\nNúmero habitación: " + habitacion.getNumero() +
                "\nTipo habitación: " + habitacion.getTipo() +
                "\nNoches: " + noches +
                "\nCoste total: ";
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public int getNoches() {
        return noches;
    }

    public void setNoches(int noches) {
        this.noches = noches;
    }

}
