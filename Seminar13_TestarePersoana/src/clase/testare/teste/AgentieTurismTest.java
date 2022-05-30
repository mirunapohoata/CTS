package clase.testare.teste;
import static org.junit.Assert.*;
import clase.agentie.AgentieTurism;
import clase.agentie.PachetTuristic;
import clase.agentie.iPachetTuristic;
import clase.testare.categorii.TesteAdaugaPachet;
import clase.testare.categorii.TesteCalculeazaSumaTotala;
import clase.testare.categorii.TesteCuFake;
import clase.testare.dubluri.PachetDummy;
import clase.testare.dubluri.PachetFake;
import clase.testare.dubluri.PachetStub;
import org.junit.Test;
import org.junit.experimental.categories.Category;


public class AgentieTurismTest {
    @Test
    @Category({TesteAdaugaPachet.class})
    public void testAdaugaPachet() {
        AgentieTurism agentieTurism = new AgentieTurism();
        agentieTurism.adaugaPachet(new PachetDummy());
        agentieTurism.adaugaPachet(new PachetDummy());
        assertEquals(2, agentieTurism.getNumarPachete());
    }

    @Test
    @Category({TesteCalculeazaSumaTotala.class})
    public void testCalculeazaSumaTotalaStub() {
        AgentieTurism agentieTurism = new AgentieTurism();
        agentieTurism.adaugaPachet(new PachetStub());
        agentieTurism.adaugaPachet(new PachetStub());
        assertEquals(200.0, agentieTurism.calculareSumaTotalaPachete(), 0.001);
    }

    @Test
    @Category({TesteCuFake.class, TesteCalculeazaSumaTotala.class})
    public void testCalculeazaSumaTotalaFake() {
        AgentieTurism agentieTurism = new AgentieTurism();
        PachetFake p1 = new PachetFake();
        p1.setValoareGetPret(100.0);

        PachetFake p2 = new PachetFake();
        p2.setValoareGetPret(200.0);

        agentieTurism.adaugaPachet(p1);
        agentieTurism.adaugaPachet(p2);
        assertEquals(300.0, agentieTurism.calculareSumaTotalaPachete(), 0.001);
    }

}
