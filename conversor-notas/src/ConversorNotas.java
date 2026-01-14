public class ConversorNotas {

    public String conversor(int nota) throws NotaFueraDeRangoException {

        if (nota < 0) {
            throw new NotaFueraDeRangoException("Nota menor de 0");
        }

        if (nota > 10) {
            throw new NotaFueraDeRangoException("Nota mayor de 10");
        }

        if (nota <= 4) {
            return "Suspenso";
        } else if (nota <= 6) {
            return "Aprobado";
        } else if (nota <= 8) {
            return "Notable";
        } else {
            return "Sobresaliente";
        }
    }
}

