import org.junit.jupiter.api.BeforeEach;
import  org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Enunciado1Test {
    private static Enunciado1 enunciado1;

    @BeforeEach
    void setUp() {
        enunciado1 = new Enunciado1();
    }

    @Test
    void calculaValidos() {
        assertEquals("P1", enunciado1.asignaPrima(20, "fernando", 030, '+'));
        assertEquals("P2", enunciado1.asignaPrima(20, "fernando", 018, '-'));
        assertEquals("P3", enunciado1.asignaPrima(20, "fernando", 008, '+'));
        assertEquals("P4", enunciado1.asignaPrima(20, "fernando", 010, '-'));
    }

    @Test
    void calculaLimitesValidos() {

    }

    @Test
    void calculaInvalidos() {
        assertEquals("ERROR", enunciado1.asignaPrima(-2, "fernando", 010, '-'));
        assertEquals("ERROR", enunciado1.asignaPrima(1111, "fernando", 010, '-'));
        assertEquals("ERROR", enunciado1.asignaPrima(020, "minombreesaitor", 010, '-'));
        assertEquals("ERROR", enunciado1.asignaPrima(020, "", 010, '-'));
        assertEquals("ERROR", enunciado1.asignaPrima(020, "fernando", -3, '-'));
        assertEquals("ERROR", enunciado1.asignaPrima(020, "fernando", 2004, '-'));
        assertEquals("ERROR", enunciado1.asignaPrima(020, "fernando", 010, '*'));
    }

    @Test
    void calculaLimitesInvalidos() {

    }
}