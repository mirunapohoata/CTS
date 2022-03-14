package ase.cts.clase;

public class Elev extends Aplicant {
    private int clasaElev;
    private String tutore;

    public void setClasaElev(int clasa) {
        this.clasaElev = clasa;
    }
    public void setTutore(String tutore) {
        this.tutore = tutore;
    }


    @Override
    public String toString() {
        return "Elev: " + super.toString() + "Clasa=" + clasaElev + ", Tutore=" + tutore;
    }

    public Elev() {
        super();
    }

}
