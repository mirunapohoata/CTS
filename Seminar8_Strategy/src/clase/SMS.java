package clase;

public class SMS implements ModPlata {
    @Override
    public void platesteCalatoria(float pret) {
        System.out.println("A fost platita suma de " + pret + " lei prin SMS!");
    }
}
