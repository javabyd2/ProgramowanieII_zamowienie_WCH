package com.sdabyd2.programowanie;

import java.util.ArrayList;
import java.util.List;

public class Zamowienie {

    private List<Pozycja> pozycje = new ArrayList<>();
    private int ileDodanych;
    private int maksRozmiar;

    public Zamowienie() {
        this.maksRozmiar = 10;
    }

    public Zamowienie(int maksRozmiar) {
        this.maksRozmiar = maksRozmiar;
    }

    public void dodajPozycje(Pozycja p) {
        pozycje.add(p);
    }

    public double obliczWartosc() {
        double wartoscZamowienia = 0;
        for (int i = 0; i < pozycje.size(); i++) {
            wartoscZamowienia += pozycje.get(i).obliczWartosc();
        }
        return wartoscZamowienia;
    }

    @Override
    public String toString() {
        System.out.println("Zamowienie");
        for (Pozycja p : pozycje) {
            System.out.println(p.toString());
        }
        System.out.println("Razem:\t" + obliczWartosc()+" zł");
        return "";
    }
}
