import java.util.HashMap;

public class Alumno {
    private String nombre, curso;
    private HashMap<Asignatura, Double> notas;

    public Alumno(String nombre, String curso, HashMap<Asignatura, Double> notas) {
        this.nombre = nombre;
        this.curso = curso;
        this.notas = notas;
    }

    /*----------------------------- */
    public static void anadirNotas(double nota, Asignatura asignatura, HashMap<Asignatura, Double> notas) {

        if (!notas.containsKey(asignatura)) {
            notas.put(asignatura, nota);
        } else {
            System.out.println("La nota ya existe en esa asignatura.");
        }
    }

    public static void modificarNotas(double nota, Asignatura asignatura, HashMap<Asignatura, Double> notas) {

        if (notas.containsKey(asignatura)) {
            notas.put(asignatura, nota);
        } else {
            System.out.println("No se ha podido modificar la nota.");
        }
    }

    public static void eliminarNotas(Asignatura asignatura, HashMap<Asignatura, Double> notas) {

        if (notas.containsKey(asignatura)) {
            notas.remove(asignatura);
        } else {
            System.out.println("La asignatura no existe.");
        }
    }

    /*----------------------------- */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public HashMap<Asignatura, Double> getNotas() {
        return notas;
    }

    public void setNotas(HashMap<Asignatura, Double> notas) {
        this.notas = notas;
    }

}
