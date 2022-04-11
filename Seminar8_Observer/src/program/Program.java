package program;

import clase.Autobuz;
import clase.Calator;
import clase.ICalator;
import clase.MijlocTransport;

public class Program {
    public static void main(String[] args) {

        MijlocTransport autobuz = new Autobuz(163);
        ICalator c1 = new Calator("Calator1");
        ICalator c2 = new Calator("Calator2");
        ICalator c3 = new Calator("Calator3");

        autobuz.adaugaCalator(c1);
        autobuz.adaugaCalator(c2);

        autobuz.anuntaCalatori();

        autobuz.stergeCalator(c2);
        autobuz.adaugaCalator(c3);
        autobuz.anuntaCalatori();
    }
}
