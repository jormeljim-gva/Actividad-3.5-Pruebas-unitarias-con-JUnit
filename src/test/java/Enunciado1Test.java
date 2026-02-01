import org.junit.jupiter.api.BeforeEach;
import  org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Enunciado1Test {
    private static Enunciado1 enunciado1;

    @Test
    void calculaValidos_ParticionEquivalente() {
        assertEquals("P4", Enunciado1.asignaPrima(20, "fernando", 10, '-'));

        assertEquals("P3", Enunciado1.asignaPrima(20, "fernando", 8, '+'));

        assertEquals("P2", Enunciado1.asignaPrima(20, "fernando", 18, '-'));

        assertEquals("P1", Enunciado1.asignaPrima(20, "fernando", 30, '+'));
    }

    @Test
    void calculaInvalidos_ParticionEquivalente() {
        assertEquals("ERROR", Enunciado1.asignaPrima(-2, "fernando", 10, '-'));

        assertEquals("ERROR", Enunciado1.asignaPrima(1111, "fernando", 10, '-'));

        assertEquals("ERROR", Enunciado1.asignaPrima(20, "jordimelgkkg", 10, '-'));

        assertEquals("ERROR", Enunciado1.asignaPrima(20, "", 10, '-'));

        assertEquals("ERROR", Enunciado1.asignaPrima(20, "fernando", -3, '-'));

        assertEquals("ERROR", Enunciado1.asignaPrima(20, "fernando", 2004, '-'));

        assertEquals("ERROR", Enunciado1.asignaPrima(20, "fernando", 10, '*'));
    }

    @Test
    void calculaValidos_ValoresLimite() {
        assertEquals("P4", Enunciado1.asignaPrima(1, "a", 0, '-'));

        assertEquals("P3", Enunciado1.asignaPrima(2, "ai", 1, '+'));

        assertEquals("P2", Enunciado1.asignaPrima(998, "aitorven", 998, '-'));

        assertEquals("P1", Enunciado1.asignaPrima(999, "aitorven", 999, '+'));
    }

    @Test
    void calculaInvalidos_ValoresLimite() {
        assertEquals("ERROR", Enunciado1.asignaPrima(0, "fernando", 0, '-'));

        assertEquals("ERROR", Enunciado1.asignaPrima(1000, "fernando", 0, '-'));

        assertEquals("ERROR", Enunciado1.asignaPrima(1, "fernando", -1, '-'));

        assertEquals("ERROR", Enunciado1.asignaPrima(1, "fernando", 1000, '-'));

        assertEquals("ERROR", Enunciado1.asignaPrima(2, "", 1, '+'));

        assertEquals("ERROR", Enunciado1.asignaPrima(2, "aitorventura", 1, '+'));
    }
}