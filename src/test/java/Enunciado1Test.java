import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Enunciado1Test {

    @Test
    void calculaValidos() {
        assertEquals("P1", new Enunciado1().asignaPrima(120, "fernando", 130, '+'));
        assertEquals("P2", new Enunciado1().asignaPrima(120, "fernando", 118, '-'));
        assertEquals("P3", new Enunciado1().asignaPrima(120, "fernando", 108, '+'));
        assertEquals("P4", new Enunciado1().asignaPrima(120, "fernando", 110, '-'));
    }

    @Test
    void calculaLimitesValidos() {
        assertEquals("P4", new Enunciado1().asignaPrima(100, "a", 100, '-'));
        assertEquals("P1", new Enunciado1().asignaPrima(999, "aitoraitoo", 999, '+'));
    }

    @Test
    void calculaInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> new Enunciado1().asignaPrima(-2, "fernando", 110, '-'));
        assertThrows(IllegalArgumentException.class, () -> new Enunciado1().asignaPrima(1002, "fernando", 110, '-'));
        assertThrows(IllegalArgumentException.class, () -> new Enunciado1().asignaPrima(120, "fernando", -5, '-'));
        assertThrows(IllegalArgumentException.class, () -> new Enunciado1().asignaPrima(120, "estenombreesmuylargo", 110, '-'));
        assertThrows(IllegalArgumentException.class, () -> new Enunciado1().asignaPrima(120, "fernando", 110, '?'));
    }

    @Test
    void calculaLimitesInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> new Enunciado1().asignaPrima(100, "", 112, '+'));
        assertThrows(IllegalArgumentException.class, () -> new Enunciado1().asignaPrima(100, "a", 1000, '+'));
    }
}