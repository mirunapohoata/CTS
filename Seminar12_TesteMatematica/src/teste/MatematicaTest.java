package teste;

import clase.Matematica;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatematicaTest {

    private Matematica mate;

    @Before
    public void setUp() {
        mate = Matematica.getInstance();
        System.out.println("am trecut pe aici");
    }

    @Test
    public void testSumaCorecta() {
        int rezultatObtiut = mate.suma(7,5);
        assertEquals(12, rezultatObtiut);
    }

    @Test
    public void testRaport1() {
        double rezultatObtinut = mate.raport(24,6);
        assertEquals(4, rezultatObtinut,0.001 );
    }

    @Test
    public void testRaport2() {
        double rezultat = mate.raport(9, 2);
        assertEquals(4.5, rezultat ,0.001 );
    }

    @Test
    public void testRaport3() {
        double rezultat = mate.raport(-10, 2);
        assertEquals(-5, rezultat ,0.001 );
    }

    @Test
    public void testRaportShouldThrowException() {
        try {
            mate.raport(57, 0);
            fail("nu trebuia sa ajunga aici");
        } catch (IllegalArgumentException ert) {

        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRaportShouldThrowException2() {
        mate.raport(7, 0);
    }

    @Test
    public void testPar() {
        boolean rez = mate.estePar(4);
        assertTrue(rez);
        assertFalse(mate.estePar(5));
        assertTrue(mate.estePar(350));
        assertFalse(mate.estePar(27));
    }

    @Test
    public void testNumerePare() {
        assertEquals(5, mate.nNumerePare(5).size());
        assertEquals(10, mate.nNumerePare(10).size());
        assertEquals(1, mate.nNumerePare(1).size());
    }

    @Test
    public void testListaNula() {
        assertNull(mate.nNumerePare(0));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testListaIllegalArgumentException() {
        mate.nNumerePare(-1);
    }

    @Test
    public void testSingleton() {
        Matematica mate2 = Matematica.getInstance();
        assertSame(mate, mate2);
    }

    @Test
    public void testRaport4() {
        assertEquals(1, mate.raport(5, 5), 0.001);
    }
}