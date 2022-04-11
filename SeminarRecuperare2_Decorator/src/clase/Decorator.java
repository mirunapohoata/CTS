package clase;

public class Decorator extends DecoratorAbstract {

    private String mesaj;

    public Decorator(IImprimanta iImprimanta, String mesaj) {
        super(iImprimanta);
        this.mesaj = mesaj;
    }

    @Override
    public void printeazaVerso() {
        System.out.println("Verso: " + mesaj);
    }
}
