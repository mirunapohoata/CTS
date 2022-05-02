package program;

import clase.*;

public class Program {
    public static void main(String[] args) {
        AutobuzHandler autobuzHandler = new AutobuzHandler(null, 5);
        TroleibuzHandler troleibuzHandler = new TroleibuzHandler(3);
        TramvaiHandler tramvaiHandler = new TramvaiHandler(10);
        MetrouHandler metrouHandler = new MetrouHandler();

        troleibuzHandler.setNextHandler(autobuzHandler);
        autobuzHandler.setNextHandler(tramvaiHandler);
        tramvaiHandler.setNextHandler(metrouHandler);

        troleibuzHandler.afiseazaCuCeSaMearga(4);
        troleibuzHandler.afiseazaCuCeSaMearga(2);
        troleibuzHandler.afiseazaCuCeSaMearga(20);
        troleibuzHandler.afiseazaCuCeSaMearga(9);

        System.out.println("*****************************************");

        Handler autobuzHCluj = new AutobuzHandler(null,3000);
        Handler tramvaiHCluj = new TramvaiHandler(8);
        Handler troleibuzHCluj = new TroleibuzHandler(3);

        troleibuzHCluj.setNextHandler(tramvaiHCluj);
        tramvaiHCluj.setNextHandler(autobuzHCluj);
        troleibuzHCluj.afiseazaCuCeSaMearga(5);
        troleibuzHCluj.afiseazaCuCeSaMearga(1);
        troleibuzHCluj.afiseazaCuCeSaMearga(50);
    }
}