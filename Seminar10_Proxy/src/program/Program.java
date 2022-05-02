package program;

import clase.Autobuz;
import clase.MijlocTransportNoapte;

public class Program {
    public static void main (String[] args) {
        Autobuz a1 = new Autobuz("1234abc", 20);
        Autobuz a2 = new Autobuz("5678def", 0);

        MijlocTransportNoapte m1 = new MijlocTransportNoapte(a1);
        MijlocTransportNoapte m2 = new MijlocTransportNoapte(a2);

        a1.opresteInStatie();
        a2.opresteInStatie();
        m1.opresteInStatie();
        m2.opresteInStatie();
    }
}
