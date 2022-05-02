package clase;

public class Tramvai extends MijlocTransportPesine{
    @Override
    protected void opresteS1() {
        System.out.println("Oprire in statia 1!");
    }

    @Override
    protected void opresteS2() {
        System.out.println("Oprire in statia 2!");
    }

    @Override
    protected void opresteS3() {
        System.out.println("Oprire in statia 3!");
    }
}
