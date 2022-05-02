package clase;

public class TroleibuzHandler extends Handler{

    public TroleibuzHandler(int prag) {
        super(prag);
    }

    @Override
    public void afiseazaCuCeSaMearga(int distanta) {
        if(distanta < prag) {
            System.out.println("Te poti deplasa cu troleibuzul!");
        } else {
            nextHandler.afiseazaCuCeSaMearga(distanta);
        }
    }
}
