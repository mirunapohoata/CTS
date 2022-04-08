package clase;

import metrou.ValidatorMetrou;

public class ValidatorSubteranAdapter implements Validator {
    private ValidatorMetrou validatorMetrou;

    @Override
    public void validareAbonament() {
        validatorMetrou.validareAbonament();
    }

    @Override
    public void v_bilet() {
        validatorMetrou.validareCalatorie();
    }

    public ValidatorSubteranAdapter(ValidatorMetrou validatorMetrou) {
        this.validatorMetrou = validatorMetrou;
    }
}