package clase;

public class AutobuzBuilder implements Builder{
    private String numeSofer;
    private int nrLinie;
    private boolean pauzaSofer;
    private boolean deschideUsile;
    private int oraIncepereProgram;
    private String textDerulat;

    public AutobuzBuilder() {
        this.numeSofer = numeSofer;
        this.nrLinie = nrLinie;
        this.pauzaSofer = pauzaSofer;
        this.deschideUsile = deschideUsile;
        this.oraIncepereProgram = oraIncepereProgram;
        this.textDerulat = textDerulat;
    }

    @Override
    public Autobuz build() {
        return new Autobuz(this.numeSofer, this.nrLinie, this.pauzaSofer,
                this.deschideUsile, this.oraIncepereProgram, this.textDerulat);
    }

    public AutobuzBuilder setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
        return this;
    }

    public AutobuzBuilder setNrLinie(int nrLinie) {
        this.nrLinie=nrLinie;
        return this;
    }

    public AutobuzBuilder setPauzaSofer(boolean pauzaSofer) {
        this.pauzaSofer=pauzaSofer;
        return this;
    }

    public AutobuzBuilder setDeschideUsile(boolean deschideUsile) {
        this.deschideUsile=deschideUsile;
        return this;
    }

    public AutobuzBuilder setOraIncepereProgram(int oraIncepereProgram) {
        this.oraIncepereProgram=oraIncepereProgram;
        return this;
    }

    public AutobuzBuilder setTextDerulat(String textDerulat) {
        this.textDerulat=textDerulat;
        return this;
    }
}
