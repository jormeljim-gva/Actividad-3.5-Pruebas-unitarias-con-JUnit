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
    void calculaLimitesValidos() {
        assertEquals(1, new Ejemplo3().calcula(1, 1, '*'));
        assertEquals(0, new Ejemplo3().calcula(2, 2, '-'));
        assertEquals(1, new Ejemplo3().calcula(999, 999, '/'));
        assertEquals(996004, new Ejemplo3().calcula(998, 998, '*'));
    }

    @Test
    void calculaInvalidos() {
        assertThrows(IllegalArgumentException.class,() -> new Ejemplo3().calcula(-4, 5, '+'));
        assertThrows(IllegalArgumentException.class,() -> new Ejemplo3().calcula(1002, 5, '+'));
        assertThrows(IllegalArgumentException.class,() -> new Ejemplo3().calcula(6, -5, '+'));
        assertThrows(IllegalArgumentException.class,() -> new Ejemplo3().calcula(6, 1222, '+'));
        assertThrows(IllegalArgumentException.class,() -> new Ejemplo3().calcula(6, 5, '?'));
    }

    @Test
    void calculaLimitesInvalidos() {
        assertThrows(IllegalArgumentException.class,() -> new Ejemplo3().calcula(0, 1, '+'));
        assertThrows(IllegalArgumentException.class,() -> new Ejemplo3().calcula(1001, 1, '+'));
        assertThrows(IllegalArgumentException.class,() -> new Ejemplo3().calcula(1, 0, '+'));
        assertThrows(IllegalArgumentException.class,() -> new Ejemplo3().calcula(1, 1001, '+'));
        assertThrows(IllegalArgumentException.class,() -> new Ejemplo3().calcula(1, 1, '?'));
    }

}