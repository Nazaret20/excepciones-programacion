import java.util.*;

public class ListaTareas {
    public static void main(String[] args) throws Exception {
        ArrayList<String> tareas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opc;

        do {
            opc = menu(sc);

            switch (opc) {
                case 1:
                    System.out.print("Dime la tarea: ");
                    tareas.add(sc.nextLine());
                    System.out.println("Tarea añadida.");
                    break;

                case 2:
                    System.out.print("Dime el número de la tarea a eliminar: ");
                    tareas.remove(Integer.parseInt(sc.nextLine()) - 1);
                    break;

                case 3:
                    System.out.println("Tus tareas son: ");
                    int i = 1;
                    for (String tarea : tareas) {
                        System.out.println("\t" + i + ".- " + tarea);
                        i++;
                    }
                    break;
            }

        } while (opc != 0);

        sc.close();
    }

    public static int menu(Scanner sc) {
        System.out.println("\n--- Lista de Tareas ---");
        System.out.println("1.- Crear Tarea");
        System.out.println("2.- Eliminar Tarea");
        System.out.println("3.- Mostrar Tareas");
        System.out.println("0.- Salir");
        System.out.print("\n\tSelecciona una opción: ");

        return Integer.parseInt(sc.nextLine());
    }
}