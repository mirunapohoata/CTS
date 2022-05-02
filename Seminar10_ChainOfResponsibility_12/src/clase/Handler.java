package clase;

public abstract class Handler {
    protected Handler nextHandler;
    protected int prag;

    public Handler(Handler nextHandler, int prag) {
        this.nextHandler = nextHandler;
        this.prag = prag;
    }

    public Handler(int prag) {
        this.nextHandler = null;
        this.prag = prag;
    }

    public void setPrag(int prag) {
        this.prag = prag;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void afiseazaCuCeSaMearga(int distanta);
}
