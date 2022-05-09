package program;

import clase.Autobuz;
import clase.ManagerAutobuze;
import clase.MementoAutobuz;

public class Program {
    public static void main(String[] args) {
        ManagerAutobuze manager = new ManagerAutobuze();

        Autobuz a1 = new Autobuz("Sofer1", 20, "Model1", 2020);

        manager.adaugareMemento(a1.creareMemento());

        a1.setNumeSofer("Sofer1_1");

        manager.adaugareMemento(a1.creareMemento());

        a1.setConsumMediu(25);
        System.out.println(a1.toString());
        manager.adaugareMemento(a1.creareMemento());

        a1.revenireStareAnterioara(manager.getMementoAutobuz(0));
        System.out.println(a1.toString());
        a1.revenireStareAnterioara(manager.getMementoAutobuz(1));
        System.out.println(a1.toString());
    }
}
