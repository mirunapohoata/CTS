package clase;

public class LaReparat implements Stare{
    @Override
    public void doAction(Autobuz autobuz) {
        if(autobuz.getStare() instanceof LaCapatDeLinie) {
            System.out.println("Autobuzul cu numarul " + autobuz.getNumarAutobuz() +
                    " este trimis in service!");
            autobuz.setStare(this);
        } else {
            System.out.println("Autobuzul nu poate fi trimis in service! Trebuie sa ajunga la capat de linie!");
        }
    }
}
