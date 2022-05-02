package clase;

public class Autobuz implements MIjlocTransport {
    private String nrAutobuz;
    private int nrCalatori;

    public Autobuz(String nrAutobuz, int nrCalatori) {
        this.nrAutobuz = nrAutobuz;
        this.nrCalatori = nrCalatori;
    }

    @Override
    public void opresteInStatie() {
        System.out.println("Autobuzul " + nrAutobuz + " a oprit in statie cu " + nrCalatori + " calatori.");
    }

    public int getNrCalatori() {
        return nrCalatori;
    }
}
