package clase;

public abstract class MijlocTransportPesine {
    protected abstract void opresteS1();
    protected abstract void opresteS2();
    protected abstract void opresteS3();

    public final void parcurgeTraseu() {
        opresteS1();
        opresteS2();
        opresteS3();
    }
    public final void parcurgeTraseuInvers() {
        opresteS3();
        opresteS2();
        opresteS1();
    }
}
