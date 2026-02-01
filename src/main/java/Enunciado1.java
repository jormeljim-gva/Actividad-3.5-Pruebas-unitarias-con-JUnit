public class Enunciado1 {

    public static void main(String[] args) {
        // Prueba rápida manual
        int a = 111;
        String b = "fernando";
        int c = 10;
        char d = '-';

        System.out.println(asignaPrima(a, b, c, d));
    }

    public static String asignaPrima(int numEmpleado, String nombreEmpleado, int mesesTrabajo, char directivo) {
        if(numEmpleado > 0 && String.valueOf(numEmpleado).length() <= 3 &&
                nombreEmpleado != null && nombreEmpleado.length() >= 1 && nombreEmpleado.length() <= 10 &&
                mesesTrabajo >= 0 && String.valueOf(mesesTrabajo).length() <= 3 &&
                (directivo == '+' || directivo == '-')){

            if (mesesTrabajo >= 12) {
                switch (directivo) {
                    case '+':
                        return "P1";
                    case '-':
                        return "P2";
                    default:
                        return "ERROR";
                }
            } else {
                switch (directivo) {
                    case '+':
                        return "P3";
                    case '-':
                        return "P4";
                    default:
                        return "ERROR";
                }
            }

        } else {
            return "ERROR";
        }
    }
}