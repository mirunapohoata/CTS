package teste;

import clase.Persoana;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestGetVarsta {

    @Test
    public void testCorrectVarsta() {
        Persoana persoana = new Persoana("Maria", "6000211330212");
        assertEquals(22, persoana.getVarsta());
    }

    @Test
    public void testBoundaryVarstaInferior() {
        Persoana persoana = new Persoana("Maria", "3000211330212");
        assertEquals(222, persoana.getVarsta());
    }

    @Test
    public void testBoundaryVarstaSuperior() {
        Persoana persoana = new Persoana("Maria", "6220211330212");
        assertEquals(0, persoana.getVarsta());
    }

    @Test(expected = CNPIncorect.class)
    public void testErrorVarsta() {
        Persoana persoana = new Persoana("Maria", "6230211330212");
        persoana.getVarsta();
    }

    @Test(timeout = 143)
    public void testPerformanceVarsta() {
        Persoana persoana = new Persoana("Maria", "6000211330212");
        persoana.getVarsta();
    }

    @Test
    public void testOrderVarsta() {
        Persoana persoana1 = new Persoana("Maria", "6010211330212");
        Persoana persoana2 = new Persoana("Andrei", "1000211330212");
        assertTrue(persoana1.getVarsta() < persoana2.getVarsta());
    }

    @Test(expected = NullPointerException.class)
    public void testExistenceVarsta() {
        Persoana persoana = new Persoana("Maria", null);
        persoana.getVarsta();
    }

}