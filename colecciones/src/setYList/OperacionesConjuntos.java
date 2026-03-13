package setYList;
import java.util.HashSet;

public class OperacionesConjuntos {
    public static void main(String[] args) throws Exception {
        HashSet<Integer> c1 = new HashSet<>();
        HashSet<Integer> c2 = new HashSet<>();
        HashSet<Integer> union = new HashSet<>();
        HashSet<Integer> interseccion = new HashSet<>();

        c1.add(1);
        c1.add(2);
        c1.add(3);
        c2.add(3);
        c2.add(4);
        System.out.println("El conjunto 1 es: " + c1);
        System.out.println("El conjunto 2 es: " + c2);

        //para la unión
        for (Integer numero : c1) {
            union.add(numero);            
        }
        for (Integer numero : c2) {
            union.add(numero);            
        }
        System.out.print("La unión de los dos es: ");
        for (Integer numero : union) {
            System.out.print(numero + " ");
        }

        //para la intersección
        for (Integer numero : c1) {
            if(c2.contains(numero))
                interseccion.add(numero);
        }
        System.out.print("\nLa intersección de los dos es: ");
        for (Integer numero : interseccion) {
            System.out.print(numero + " ");
        }
    }
}
