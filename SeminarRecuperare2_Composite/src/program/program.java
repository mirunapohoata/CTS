package program;

import clase.Autobuz;
import clase.FlotaCompanie;

public class program {
    public static void main (String[] args) {
        Autobuz a1 = new Autobuz("producator1", "Model1", 10);
        Autobuz a2 = new Autobuz("producator2", "Model1", 7);
        Autobuz a3 = new Autobuz("producator3", "Model1", 30);
        Autobuz a4 = new Autobuz("producator4", "Model1", 100);
        Autobuz a5 = new Autobuz("producator5", "Model1", 30);
        Autobuz a6 = new Autobuz("producator6", "Model1", 45);


        FlotaCompanie flota1 = new FlotaCompanie("Flota1");
        FlotaCompanie flota2 = new FlotaCompanie("Flota2");
        FlotaCompanie flota3 = new FlotaCompanie("Flota3");
        FlotaCompanie flotaCompanie = new FlotaCompanie("Flota Companie");

        try {
            flota1.adaugaItem(a1);
            flota1.adaugaItem(a2);
            flota2.adaugaItem(a3);
            flota3.adaugaItem(a4);
            flota2.adaugaItem(a5);
            flota3.adaugaItem(a6);

            flotaCompanie.adaugaItem(flota1);
            flotaCompanie.adaugaItem(flota2);
            flotaCompanie.adaugaItem(flota3);

            flotaCompanie.descriereItem();

            flotaCompanie.stergeItem(flota1);

            System.out.println("Suma totala garantata = "
                    + flotaCompanie.calculeazaSumaGarantata(3)
                    + " lei");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

