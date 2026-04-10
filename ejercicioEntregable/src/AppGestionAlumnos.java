import java.util.Scanner;

public class AppGestionAlumnos {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opc;

        do {
            opc = menu(sc);
            switch (opc) {
                case 1:
                    gestionarAlumnos(sc);
                    
                    break;
                
                case 2:
                    gestionarAsignaturas(sc);
                    
                    break;

                case 3:
                    asignarModificarNotasAlums(sc);
                    
                    break;

                case 4:
                    guardarDatosEnFichero(sc);
                    
                    break;

                case 5:
                    cargarDatosDeFichero(sc);
                    
                    break;
            
                default:
                    System.out.println("\nGracias por usar el sistema.");
                    break;
            }
        } while (opc != 0);

        sc.close();
    }


    public static void gestionarAlumnos(Scanner sc) {
        System.out.println("¿Qué necesitas hacer? (añadir, mostrar, eliminar)");    
        String opc = "";

        switch (opc) {
            case "añadir":
                
                break;

            case "mostrar":
                
                break;

            case "eliminar":
                
                break;
        
            default:
                break;
        }
    }

    public static void gestionarAsignaturas(Scanner sc) {
        System.out.println("¿Qué necesitas hacer? (añadir, mostrar, eliminar)");    
        String opc = "";

        switch (opc) {
            case "añadir":
                
                break;

            case "mostrar":
                
                break;

            case "eliminar":
                
                break;
        
            default:
                break;
        }
    }

    public static void asignarModificarNotasAlums(Scanner sc) {
        
    }

    public static void guardarDatosEnFichero(Scanner sc) {
        
    }

    public static void cargarDatosDeFichero(Scanner sc) {
        
    }

    public static int menu(Scanner sc) {
        System.out.println("\n1. Gestionar alumnos: Añadir, mostrar, eliminar.\r\n" + //
                "2. Gestionar asignaturas: Añadir, mostrar, eliminar.\r\n" + //
                "3. Asignar y modificar notas de los alumnos en sus asignaturas.\r\n" + //
                "4. Guardar todos los datos en un fichero binario.\r\n" + //
                "5. Cargar los datos desde un fichero binario.\r\n" + //
                "0. Salir");
        System.out.print("\tIntroduzca una opción: ");

        return Integer.parseInt(sc.nextLine());
    }
}
