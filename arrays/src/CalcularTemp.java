
import java.util.Scanner;

public class CalcularTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int VECES_TEMP = 7;
        

        //double[] fn = {3, 6, 7, 8, 9, 2, 5};
        double[] temp = new double[VECES_TEMP];
        String[] days = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        for (int i = 0; i < VECES_TEMP; i++) {
            System.out.printf("Dime la temperatura del %s: ", days[i]);
            temp[i] = Double.parseDouble(sc.nextLine());
        }

        double suma, tempMax, tempMin;
        int posTempMax, posTempMin;

        suma = temp[0];
        posTempMax = 0;
        tempMax = temp[posTempMax];
        posTempMin = 0;
        tempMin = temp[posTempMin];

        for (int i = 1; i < VECES_TEMP; i++) {
            suma += temp[i];

            if (temp[i] > tempMax) {
                tempMax = temp[i];
                posTempMax = i;
            }

            if (temp[i] < tempMin) {
                tempMin = temp[i];
                posTempMin = i;
            }
        }

        System.out.printf("El promedio de temperatura ha sido de %.1fºC\n", suma/VECES_TEMP);
        System.out.printf("La máxima se alcanzó el %s y fue de %.1fºC\n", days[posTempMax], tempMax);
        System.out.printf("La mínima se alcanzó el %s y fue de %.1fºC\n", days[posTempMin], tempMin);




        sc.close();
    }
}
