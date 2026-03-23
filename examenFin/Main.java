import java.util.*;

public class Main {
    static ArrayList<Habitacion> habitaciones;
    static HashMap<String, Reserva> mapaReservas;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc;

        do {
            opc = mostrarMenu(sc);
            switch (opc) {
                case 1:
                    registrarHabitacion(sc);
                    break;
                case 2:
                    mostrarHabitacionesDisponibles();
                    break;
                case 3:
                    hacerReserva(sc);
                    break;
                case 4:
                    cancelarReserva(sc);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Gracias por usar el sistema");
                    break;
            }
        } while (opc != 0);

        sc.close();
    }

    /*------------------- */
    public static void registrarHabitacion(Scanner sc) {
        System.out.print("Numero de habitación: ");
        int numHabitacion = Integer.parseInt(sc.nextLine());

        System.out.print("Tipo (estandar/suite/deluxe): ");
        String tipo = sc.nextLine();

        for (Habitacion habitacion : habitaciones) {

            if (habitacion.getEstado().equals("resevada")) {
                System.out.println("Habitación ocupada.");
            } else {
                Habitacion habReserva = new Habitacion(numHabitacion, tipo, habitacion.getEstado());
                habitaciones.add(habReserva);

            }
        }
    }

    /*--------------------- */
    public static void mostrarHabitacionesDisponibles() {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getEstado().equals("disponible")) {
                System.out.println(habitacion);
            } else {
                System.out.println("No hay habitaciones disponibles");
            }
        }
    }

    /*----------------------- */
    public static ArrayList<Habitacion> buscarHabitacionDisponible(ArrayList<Habitacion> habitaciones) {
        ArrayList<Habitacion> habitacionesDisponibles = new ArrayList<>();

        for (Habitacion habitacion : habitaciones) {
            if (habitacion.estaDisponible()) {
                habitacionesDisponibles.add(habitacion);
            }
        }

        return habitacionesDisponibles;
    }

    /*---------------------- */
    public static void hacerReserva(Scanner sc) {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Dni: ");
        String dni = sc.nextLine();

        System.out.print("Tipo de habitación (Estándar, Suite, Deluxe): ");
        String tipo = sc.nextLine().toLowerCase();

        System.out.print("Número de noches: ");
        int noches = Integer.parseInt(sc.nextLine());

        Reserva reserva = new Reserva(nombre, dni, noches);
    }

    /*-------------------------- */
    public static void cancelarReserva(Scanner sc) {
        System.out.print("Introduce dni: ");
        String dni = sc.nextLine();

        for (Map.Entry<String, Reserva> reserva : mapaReservas.entrySet()) {
            for (Habitacion habitacion : habitaciones) {
                if (reserva.getValue().getDniCliente().equals(dni)) {
                    habitacion.liberar();
                    System.out.println("Habitación liberada");
                } else {
                    System.out.println("Error en liberación de habitación");
                }

            }
        }
    }

    /*--------------------------- */
    public static void mostrarReservasActivas() {

    }

    /*----------------------- */

    /*--------------------- */
    public static int mostrarMenu(Scanner sc) {
        System.out.println("===== SISTEMA HOTEL =====\r\n" + //
                "1. Registrar habitación\r\n" + //
                "2. Mostrar habitaciones disponibles\r\n" + //
                "3. Hacer reserva\r\n" + //
                "4. Cancelar reserva\r\n" + //
                "5. Ver reservas activas\r\n" + //
                "0. Salir\r\n" + //
                "=========================\r");
        System.out.print("Opción: ");

        return Integer.parseInt(sc.nextLine());
    }
}
