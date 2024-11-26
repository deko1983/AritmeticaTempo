import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

import org.junit.Test;

import exception.AritmeticaException;
import exception.TempoNegativoException;
import exception.TempoNotScalareException;

public class AritmeticaTest {

    @Test
    public void testSomma()  {
        Tempo d1 = new Tempo(1, 50);
        Tempo d2 = new Tempo(1, 70);

        Tempo distanzaSomma = d1.add(d2);

        assertEquals(new Tempo(3, 20), distanzaSomma);
    }

    @Test
    public void testSottrazione() throws AritmeticaException  {
        Tempo d1 = new Tempo(1, 70);
        Tempo d2 = new Tempo(1, 50);

        Tempo distanzaSub = d1.subtract(d2);

        assertEquals(new Tempo(0, 20), distanzaSub);
    }

    @Test
    public void testMoltiplicazione() throws AritmeticaException {
        // TODO
    }

    @Test
    public void testDivisione() throws AritmeticaException {
        // TODO
    }

    @Test
    public void testScalare() throws AritmeticaException {
        // TODO
    }

    @Test
    public void testDistanzaNegativaException()  {
        Tempo d1 = new Tempo(1, 70);
        Tempo d2 = new Tempo(4, 50);
        
        assertThrowsExactly(TempoNegativoException.class, () -> d1.subtract(d2));
    }

    @Test
    public void testDistanzaNotScalareException()  {
        Tempo d1 = new Tempo(1, 70);
        Tempo d2 = new Tempo(4, 50);
        
        assertThrowsExactly(TempoNotScalareException.class, () -> d1.multiply(d2));
    }
    
}
