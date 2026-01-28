public class Enunciado1 {
    public String asignaPrima(int numEmpleado, String nombreEmpleado, int mesesTrabajo, char directivo) {
        if(numEmpleado >= 0 && String.valueOf(numEmpleado).length() == 3 && nombreEmpleado.length() >= 1 && nombreEmpleado.length() <= 10 &&
        mesesTrabajo >= 0 && String.valueOf(mesesTrabajo).length() == 3 && directivo == '+' || directivo == '-'){

        }
        return "Algo";
    }
}