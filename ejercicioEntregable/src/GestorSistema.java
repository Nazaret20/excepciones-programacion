import java.util.ArrayList;

public class GestorSistema {
    private ArrayList<Alumno> alumnos;
    private ArrayList<Asignatura> asignaturas;

    public GestorSistema(ArrayList<Alumno> alumnos, ArrayList<Asignatura> asignaturas) {
        this.alumnos = alumnos;
        this.asignaturas = asignaturas;
    }

    /*----------------------------- */

    public static void anadirAlumno(ArrayList<Alumno> alumnos, Alumno alumno) {
        if (!alumno.getNombre().equals(alumno)) {
            alumnos.add(alumno);
        } else {
            System.out.println("El alumno ya existe.");
        }
    }

    public static void mostrarAlumno(ArrayList<Alumno> alumnos) {
        for (ArrayList<Alumno> alumno : alumnos) {
            System.out.println(alumno);
        }
    }

    public static void eliminarAlumno() {
        
    }

    public static void anadirAsignatura() {
        
    }

    public static void mostrarAsignatura() {
        
    }

    public static void eliminarAsignatura() {
        
    }

    public void guardarDatosEnFichero() {

    }

    public void cargarDatosDeFichero() {

    }

    /*----------------------------- */
    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
    
}
