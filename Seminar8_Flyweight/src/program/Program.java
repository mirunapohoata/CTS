package program;

import clase.Autobuz;
import clase.Linie;
import flyweight.factory.FlyweightFactory;

public class Program {
    public static void main (String[] args) {

        Autobuz a1 = new Autobuz("Autobuz1", 2022, 50);
        Autobuz a2 = new Autobuz("Autobuz2", 2022, 60);
        Autobuz a3 = new Autobuz("Autobuz3", 2022, 70);
        Autobuz a4 = new Autobuz("Autobuz4", 2022, 80);

        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Linie linie1 = flyweightFactory.getLinie(101);
        Linie linie2 = flyweightFactory.getLinie(202);

        a1.descriereAutobuz(flyweightFactory.getLinie(303));
        a2.descriereAutobuz(linie2);
        a3.descriereAutobuz(linie1);
        a4.descriereAutobuz(linie2);

    }
}
