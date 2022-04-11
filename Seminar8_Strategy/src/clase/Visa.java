package clase;

public class Visa implements ModPlata {
    @Override
    public void platesteCalatoria(float pret) {
        System.out.println("A fost platita suma de " + pret + " lei cu cardul Visa!");
    }
}
