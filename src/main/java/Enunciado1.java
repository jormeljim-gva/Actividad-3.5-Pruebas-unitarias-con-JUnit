public class Enunciado1 {
    public String asignaPrima(int numEmpleado, String nombreEmpleado, int mesesTrabajo, char directivo) {
        if(numEmpleado >= 0 && String.valueOf(numEmpleado).length() == 3 && nombreEmpleado.length() >= 1 && nombreEmpleado.length() <= 10 &&
        mesesTrabajo >= 0 && String.valueOf(mesesTrabajo).length() == 3 && directivo == '+' || directivo == '-'){

            if (mesesTrabajo >= 12) {
                if (directivo == '+') {
                    return "P1";
                } else {
                    return "P2";
                }
            } else {
                if (directivo == '+') {
                    return "P3";
                } else {
                    return "P4";
                }
            }

        }
        else throw new IllegalArgumentException("ERROR");
    }
}