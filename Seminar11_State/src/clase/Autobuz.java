package clase;

public class Autobuz {
    private int numarAutobuz;
    private Stare stare;

    public Autobuz(int numarAutobuz) {
        this.numarAutobuz = numarAutobuz;
        this.stare = new LaCapatDeLinie();
    }

    public Stare getStare() {
        return stare;
    }

    public int getNumarAutobuz() {
        return numarAutobuz;
    }

    protected void setStare(Stare stare) {
        this.stare = stare;
    }

    public void pleacaInCursa() {
       new InCursa().doAction(this);
    }

    public void ajungeLaCapatDeLinie() {
        new LaCapatDeLinie().doAction(this);
    }

    public void trimiteInService(){
        new LaReparat().doAction(this);
    }

    public void iesireDinService() {
        new LaCapatDeLinie().doAction(this);
    }

}
