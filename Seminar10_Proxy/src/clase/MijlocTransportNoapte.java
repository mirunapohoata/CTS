package clase;

public class MijlocTransportNoapte implements MIjlocTransport {
    private MIjlocTransport mijlocTransport;
    @Override
    public void opresteInStatie() {
        if(mijlocTransport.getNrCalatori() > 0) {
            mijlocTransport.opresteInStatie();
        } else {
            System.out.println("Autobuzul de noapte nu va opri in statie.");
        }
    }

    @Override
    public int getNrCalatori() {
        return mijlocTransport.getNrCalatori();
    }

    public MijlocTransportNoapte(MIjlocTransport mijlocTransport) {
        this.mijlocTransport = mijlocTransport;
    }
}