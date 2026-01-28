import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejemplo1Test {
    private static Ejemplo1 ejemplo1;

    @BeforeAll
    static void beforeAll() {
        ejemplo1 = new Ejemplo1();
    }

    @AfterAll
    static void afterAll() {
        ejemplo1 = null;
    }

    @Test
    void clasesEquivalencia() {
        assertEquals("SI", ejemplo1.esAdmitido(65));
        assertEquals("NO", ejemplo1.esAdmitido(33));
        assertEquals("NO", ejemplo1.esAdmitido(99));
    }

    @Test
    void limites() {
        assertEquals("SI", ejemplo1.esAdmitido(50));
        assertEquals("SI", ejemplo1.esAdmitido(51));
        assertEquals("SI", ejemplo1.esAdmitido(90));
        assertEquals("SI", ejemplo1.esAdmitido(89));
        assertEquals("NO", ejemplo1.esAdmitido(49));
        assertEquals("NO", ejemplo1.esAdmitido(91));
    }
}