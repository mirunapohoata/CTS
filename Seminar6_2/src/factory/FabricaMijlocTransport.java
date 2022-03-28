package factory;

public class FabricaMijlocTransport {

    public MijlocTransport getMijlocTransport(TipTransport tipTransport, int nrInmatriculare) {
       switch (tipTransport) {
           case AUTOBUZ:
               return new Autobuz(nrInmatriculare);
           case TRAMVAI:
               return new Tramvai(nrInmatriculare);
           case TROLEIBUZ:
               return new Tramvai(nrInmatriculare);
           default:
               return null;
       }
    }
}
