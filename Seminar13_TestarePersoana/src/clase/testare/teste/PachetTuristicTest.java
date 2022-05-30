package clase.testare.teste;
import static org.junit.Assert.*;

import clase.agentie.PachetTuristic;
import clase.testare.categorii.TesteAplicaDiscount;
import clase.testare.categorii.TesteBoundary;
import clase.testare.categorii.TesteCuFake;
import clase.testare.categorii.TestePoateRezerva;
import clase.testare.dubluri.PersoanaFake;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class PachetTuristicTest {

    @Test
    @Category({TesteCuFake.class, TestePoateRezerva.class})
    public void testPoateRezerva() {
        PersoanaFake p1 = new PersoanaFake();
        p1.setValoareGetVarsta(21);

        PachetTuristic pachetTuristic = new PachetTuristic(p1, "Miami", 250.0);
        assertTrue(pachetTuristic.poateRezerva());
    }

    @Test
    @Category({TesteCuFake.class, TestePoateRezerva.class})
    public void testNuPoateRezerva() {
        PersoanaFake p1 = new PersoanaFake();
        p1.setValoareGetVarsta(15);

        PachetTuristic pachetTuristic = new PachetTuristic(p1, "Miami", 250.0);
        assertFalse(pachetTuristic.poateRezerva());
    }

    @Test
    @Category({TesteBoundary.class, TesteCuFake.class, TestePoateRezerva.class})
    public void testPoateRezervaBoundary() {
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setValoareGetVarsta(18);

        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Miami", 250.0);
        assertTrue(pachetTuristic.poateRezerva());
    }

    @Test
    @Category({TesteCuFake.class, TesteAplicaDiscount.class})
    public void testRightAplicaDiscount() {
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setValoareGetVarsta(68);
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Miami", 500.0);
        pachetTuristic.aplicaDiscountVarstnici(50);
        assertEquals(250.0, pachetTuristic.getPret(), 0.001);
    }

    @Test
    @Category({TesteCuFake.class, TesteAplicaDiscount.class})
    public void testRightAplicaDiscountTanar() {
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setValoareGetVarsta(30);
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Miami", 500.0);
        pachetTuristic.aplicaDiscountVarstnici(50);
        assertEquals(500.0, pachetTuristic.getPret(), 0.001);
    }

}
