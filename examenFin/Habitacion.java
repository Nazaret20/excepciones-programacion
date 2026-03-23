public class Habitacion {
    private int numero;
    private String tipo;
    private String estado;

    public Habitacion(int numero, String tipo, String estado) {
        this.numero = numero;
        this.tipo = tipo;
        this.estado = estado;
    }
    /*----------------------- */

    public void reservar() {
        this.estado = "resevada";
    }

    public void liberar() {
        this.estado = "disponible";
    }

    public boolean estaDisponible() {
        if (this.estado.equals("disponible")) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Habitacion: " + numero + " - Tipo: " + tipo + " - Estado: " + estado;
    }

    /*------------------------------ */

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
