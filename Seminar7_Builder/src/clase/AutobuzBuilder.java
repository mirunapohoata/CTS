package clase;

public class AutobuzBuilder implements Builder{
    private Autobuz autobuz;

    public AutobuzBuilder() {
        this.autobuz = new Autobuz("Sofer1", 2, true, true, 5, "Statia finala: ASE");
    }


    @Override
    public Autobuz build() {
        return autobuz;
    }

    public AutobuzBuilder setNumeSofer(String numeSofer) {
        this.autobuz.setNumeSofer(numeSofer);
        return AutobuzBuilder.this;
    }

    public AutobuzBuilder setNrLinie(int nrLinie) {
        this.autobuz.setNrLinie(nrLinie);
        return AutobuzBuilder.this;
    }

    public AutobuzBuilder setPauzaSofer(boolean pauzaSofer) {
        this.autobuz.setPauzaSofer(pauzaSofer);
        return AutobuzBuilder.this;
    }

    public AutobuzBuilder setDeschideUsile(boolean deschideUsile) {
        this.autobuz.setDeschideUsile(deschideUsile);
        return AutobuzBuilder.this;
    }

    public AutobuzBuilder setOraIncepereProgram(int oraIncepereProgram) {
        this.autobuz.setOraIncepereProgram(oraIncepereProgram);
        return AutobuzBuilder.this;
    }

    public AutobuzBuilder setTextDerulat(String textDerulat) {
        this.autobuz.setTextDerulat(textDerulat);
        return AutobuzBuilder.this;
    }
}
