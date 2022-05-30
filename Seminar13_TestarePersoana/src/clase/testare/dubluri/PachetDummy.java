package clase.testare.dubluri;

import clase.agentie.iPachetTuristic;

public class PachetDummy implements iPachetTuristic {

    @Override
    public boolean poateRezerva() {
        return false;
    }

    @Override
    public void aplicaDiscountVarstnici(int procent) {

    }

    @Override
    public Double getPret() {
        return null;
    }
}
