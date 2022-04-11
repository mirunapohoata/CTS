package clase;

public class Validator {
    private float pretCalatorie;
    private ModPlata modPlata;

    public Validator(float pretCalatorie) {
        this.pretCalatorie = pretCalatorie;
        this.modPlata = new Visa();
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void valideazaCalatorie() {
        modPlata.platesteCalatoria(pretCalatorie);
    }
}
