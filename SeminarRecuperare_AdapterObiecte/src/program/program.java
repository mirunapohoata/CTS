package program;

import adapter_clase.AdapterMetrouClase;
import clase.Validator;
import clase.ValidatorAutobuz;
import clase.ValidatorSubteranAdapter;
import metrou.ValidatorMetrou;

public class program {

    public static void valideazaBilet(Validator validator) {
        validator.v_bilet();
    }

    public static void valideazaAbonament(Validator validator) {
        validator.validareAbonament();
    }

    public static void main(String[] args) {

        ValidatorAutobuz validatorAutobuz = new ValidatorAutobuz();
        valideazaBilet(validatorAutobuz);

        ValidatorMetrou validatorMetrou = new ValidatorMetrou();
        ValidatorSubteranAdapter adapter = new ValidatorSubteranAdapter(validatorMetrou);
        valideazaBilet(adapter);
        valideazaAbonament(adapter);

        AdapterMetrouClase adapterClase = new AdapterMetrouClase();
        valideazaAbonament(adapterClase);
    }
}
