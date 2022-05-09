package clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerAutobuze {
    private List<MementoAutobuz> mementoAtobuze;

    public ManagerAutobuze() {
        this.mementoAtobuze = new ArrayList<>();
    }

    public MementoAutobuz getMementoAutobuz(int pozitie) {
        return mementoAtobuze.get(pozitie);
    }

    public void adaugareMemento(MementoAutobuz memento) {
        mementoAtobuze.add(memento);
    }
}
