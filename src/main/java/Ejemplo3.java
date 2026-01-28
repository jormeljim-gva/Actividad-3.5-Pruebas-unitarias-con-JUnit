public class Ejemplo3 {

    public static int calcula(int numero, int numero2, char operador) {
        if (numero > 1 && numero < 1000 && numero2 > 1 && numero2 < 1000){
            switch (operador){
                case '+':
                    return numero + numero2;
                case '-':
                    return numero - numero2;
                case '*':
                    return numero * numero2;
                case '/':
                    return numero / numero2;
                default:
                    throw new IllegalArgumentException("Operador no válido");
            }
        }
        else throw new IllegalArgumentException("ERROR");
    }
}