package program;

import clase.MijlocTransportPesine;
import clase.Tramvai;

public class Program {
    public static void main(String[] args) {
        MijlocTransportPesine t1 = new Tramvai();

        t1.parcurgeTraseu();
        System.out.println("***********************************************");
        t1.parcurgeTraseuInvers();
        System.out.println("***********************************************");
    }
}
