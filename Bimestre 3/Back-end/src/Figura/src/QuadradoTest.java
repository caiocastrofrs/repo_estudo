import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadradoTest {
    Figuras quadrado, circulo;
    @BeforeEach
    void doBefore() {
        quadrado = new Quadrado(15);
        circulo = new Circulo(10);
    }
    @Test
    void getPerimetro() {
        assertEquals(60, quadrado.calcularPerimetro());
        assertEquals(10, circulo.calcularPerimetro());
    }
}