package clase;

public class Autobuz {
    private String numeSofer;
    private int nrLinie;
    private boolean pauzaSofer;
    private boolean deschideUsile;
    private int oraIncepereProgram;
    private String textDerulat;

    public Autobuz(String numeSofer, int nrLinie, boolean pauzaSofer, boolean deschideUsile, int oraIncepereProgram, String textDerulat) {
        this.numeSofer = numeSofer;
        this.nrLinie = nrLinie;
        this.pauzaSofer = pauzaSofer;
        this.deschideUsile = deschideUsile;
        this.oraIncepereProgram = oraIncepereProgram;
        this.textDerulat = textDerulat;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "numeSofer='" + numeSofer + '\'' +
                ", nrLinie=" + nrLinie +
                ", pauzaSofer=" + pauzaSofer +
                ", deschideUsile=" + deschideUsile +
                ", oraIncepereProgram=" + oraIncepereProgram +
                ", textDerulat='" + textDerulat + '\'' +
                '}';
    }

    // setterii sunt default => pot fi apelati doar de clasele din acelasi pachet
     void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    void setNrLinie(int nrLinie) {
        this.nrLinie = nrLinie;
    }

    void setPauzaSofer(boolean pauzaSofer) {
        this.pauzaSofer = pauzaSofer;
    }

    void setDeschideUsile(boolean deschideUsile) {
        this.deschideUsile = deschideUsile;
    }

    void setOraIncepereProgram(int oraIncepereProgram) {
        this.oraIncepereProgram = oraIncepereProgram;
    }

    void setTextDerulat(String textDerulat) {
        this.textDerulat = textDerulat;
    }
}
