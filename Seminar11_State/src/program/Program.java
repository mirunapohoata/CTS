package program;

import clase.Autobuz;

public class Program {
    public static void main(String[] args) {
        Autobuz a1 = new Autobuz(111);
        a1.trimiteInService();
        a1.pleacaInCursa();
        a1.iesireDinService();
        a1.pleacaInCursa();
        a1.trimiteInService();
        a1.ajungeLaCapatDeLinie();
    }
}
