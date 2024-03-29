package clase;

public class Facade {
    public static Autobuz autobuz = Autobuz.getInstance();

    public static void deschideUsi() {
        autobuz.deschideUsaFata();
        autobuz.deschideUsaMijloc();
        autobuz.deschideUsaSpate();
    }

    public static void punePeLiberUsi() {
        autobuz.puneLiberUsaFata();
        autobuz.puneLiberUsaMijloc();
        autobuz.puneLiberUsaSpate();
    }
}
