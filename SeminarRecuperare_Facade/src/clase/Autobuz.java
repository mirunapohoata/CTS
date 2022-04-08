package clase;

public class Autobuz {
    private static Autobuz autobuz = null;

    private Autobuz() {
    }

    public void deschideUsaFata() {
        System.out.println("A fost deschisa usa din fata!");
    }

    public void deschideUsaMijloc() {
        System.out.println("A fost deschisa usa din mijloc!");
    }

    public void deschideUsaSpate() {
        System.out.println("A fost deschisa usa din spate!");
    }

    public void puneLiberUsaFata() {
        System.out.println("Usa din fata a fost pusa pe liber!");
    }

    public void puneLiberUsaMijloc() {
        System.out.println("Usa din mijloc a fost pusa pe liber!");
    }

    public void puneLiberUsaSpate() {
        System.out.println("Usa din spate a fost pusa pe liber!");
    }

    public static Autobuz getInstance() {
        if(autobuz != null) {
            return autobuz;
        } else {
            autobuz = new Autobuz();
            return autobuz;
        }
    }
}
