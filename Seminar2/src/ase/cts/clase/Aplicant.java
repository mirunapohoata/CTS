package ase.cts.clase;

import java.util.Arrays;

public abstract class Aplicant {
    protected String nume;
    protected String prenume;
    protected int varsta;
    protected int punctaj;
    protected int nr_proiecte;
    protected String[] denumireProiect;


    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void statut() {
        if (punctaj > 80)
            System.out.println("Aplicantul " + nume + " " + prenume + " a fost acceptat.");
        else
            System.out.println("Aplicantul " + nume + " " + prenume + " nu a fost acceptat.");
    }

    public int getPunctaj() {
        return punctaj;
    }

    public void setPunctaj(int punctaj) {
        this.punctaj = punctaj;
    }


    public Aplicant() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Aplicant(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect) {
        super();
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.punctaj = punctaj;
        this.nr_proiecte = nr_proiecte;
        this.denumireProiect = denumireProiect;
    }

    public int getNr_proiecte() {
        return nr_proiecte;
    }

    public void setNr_proiecte(int nr_proiecte, String[] denumireProiect) {
        this.nr_proiecte = nr_proiecte;
        this.denumireProiect = new String[this.nr_proiecte];
        for(int i=0; i<this.nr_proiecte; i++) {
            this.denumireProiect[i]=denumireProiect[i];
        }
    }

    @Override
    public String toString() {
        return "Nume='" + nume + '\'' +
                ", Prenume='" + prenume + '\'' +
                ", Varsta=" + varsta +
                ", Punctaj=" + punctaj +
                ", Nr_proiecte=" + nr_proiecte +
                ", DenumireProiect=" + Arrays.toString(denumireProiect);
    }

    public void afisareSumaBani(int sumaBani) {
        System.out.println("Aplicantul " + getNume() + " " + getPrenume() + " primeste" + sumaBani + " Euro/zi in proiect.");
    }
}
