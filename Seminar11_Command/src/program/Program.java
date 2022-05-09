package program;

import clase.Autobuz;
import clase.ManagerComenzi;
import clase.PleacaInCursa;

public class Program {
    public static void main(String[] args) {
        ManagerComenzi manager = new ManagerComenzi();
        Autobuz a1 = new Autobuz("Mercedes");
        Autobuz a2 = new Autobuz("Scania");
        manager.invoca(new PleacaInCursa(a1,81));
        manager.invoca(new PleacaInCursa(a2, 100));
        manager.invoca(new PleacaInCursa(a1, 381));
        manager.invoca(new PleacaInCursa(a2, 368));
        manager.invoca(new PleacaInCursa(a1, 222));

        manager.executaComanda();
        manager.executaComanda();
        manager.executaComanda();
        manager.executaComanda();
        manager.executaComanda();
    }
}
