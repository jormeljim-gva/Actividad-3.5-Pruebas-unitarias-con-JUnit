import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejemplo3Test {

    @Test
    void calculaValidos() {
        assertEquals(18, new Ejemplo3().calcula(12, 6, '+'));
        assertEquals(6, new Ejemplo3().calcula(12, 6, '-'));
        assertEquals(72, new Ejemplo3().calcula(12, 6, '*'));
        assertEquals(2, new Ejemplo3().calcula(12, 6, '/'));

    }
    @Test
    void calculaInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> new Ejemplo3().calcula(1001, -1, '+'));
    }

}