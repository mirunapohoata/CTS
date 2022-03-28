package factory.main;

import factory.FabricaMijlocTransport;
import factory.MijlocTransport;
import factory.TipTransport;

public class Main {
    public static void main(String[] args) {
        FabricaMijlocTransport fabrica = new FabricaMijlocTransport();
        MijlocTransport autobuz = fabrica.getMijlocTransport(TipTransport.AUTOBUZ, 222);
        MijlocTransport troleibuz = fabrica.getMijlocTransport(TipTransport.TROLEIBUZ, 333);
        MijlocTransport tramvai = fabrica.getMijlocTransport(TipTransport.TRAMVAI, 555);

        System.out.println(autobuz.toString());
        System.out.println(troleibuz.toString());
        System.out.println(tramvai.toString());
    }
}
