package teste;

import clase.Persoana;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestGetSex {

    @Test
    public void testRightSex() {
       Persoana p1 = new Persoana("Maria", "6000102330212");
       assertEquals("F", p1.getSex());
    }

    @Test
    public void testBoundarySexInferior() {
        Persoana p1 = new Persoana("Ion", "1000103301024");
        assertEquals("M", p1.getSex());
    }
    @Test
    public void testBoundarySexSuperior() {
        Persoana p1 = new Persoana("Maria", "6000103301024");
        assertEquals("F", p1.getSex());
    }

    @Test
    public void testCorectitudineSex() {
        Persoana persoana = new Persoana("Maria", "6000103301024");
        assertEquals("F", persoana.getSex());
    }

    @Test
    public void testCrossCheckSex() {
        Persoana persoana = new Persoana("Marian", "5000103301024");
        assertEquals(persoana.CNP.charAt(0)%2==0 ? "F" : "M", persoana.getSex());
    }

    @Test(expected = CNPIncorect.class)
    public void testErrorConditionSex() {
        Persoana persoana = new Persoana("Maria", "0000103301024");
        persoana.getSex();
    }
    @Test (timeout = 100)
    public void testPerformanceSex() {
        Persoana persoana = new Persoana("Maria", "6000103301024");
        persoana.getSex();
    }

    @Test
    public void testFormatSex() {
        Persoana persoana = new Persoana("Maria", "6000103301024");
        assertEquals(1, persoana.getSex().length());
    }

    @Test (expected = NullPointerException.class)
    public void testExistenceSex() {
        Persoana persoana = new Persoana("Maria", null);
        persoana.getSex();
    }
}