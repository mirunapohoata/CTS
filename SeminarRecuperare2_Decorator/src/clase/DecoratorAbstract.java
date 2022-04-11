package clase;

public abstract class DecoratorAbstract implements IImprimanta {
    IImprimanta iImprimanta;

    @Override
    public void printeazaBilet() {
        iImprimanta.printeazaBilet();
    }

    public DecoratorAbstract(IImprimanta iImprimanta) {
        this.iImprimanta = iImprimanta;
    }

    public abstract void printeazaVerso();
}
