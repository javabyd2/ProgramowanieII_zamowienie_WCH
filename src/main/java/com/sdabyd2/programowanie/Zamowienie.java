package com.sdabyd2.programowanie;

import java.util.ArrayList;
import java.util.List;

public class Zamowienie {

    private List<Pozycja> pozycje = new ArrayList<>();
    private int ileDodanych;
    private int maksRozmiar;
    private int lacznaIloscPoztcji;

    public Zamowienie() {
        this.maksRozmiar = 10;
    }

    public Zamowienie(int maksRozmiar) {
        this.maksRozmiar = maksRozmiar;
    }

    public void dodajPozycje(Pozycja pozycja) {
        pozycje.add(pozycja);

    }

    public void dodajPozycjeUpdate(Pozycja pozycja) {
        boolean zwiekszIlosc = false;
        for (int i = 0; i < pozycje.size(); i++) {
            if (pozycje.get(i).getNazwaTowaru().equals(pozycja.getNazwaTowaru())) {
                zwiekszIlosc = true;
                break;
            } else {
                zwiekszIlosc = false;
            }
        }
        if (zwiekszIlosc) {
            for (int j = 0; j < pozycje.size(); j++) {
                if (pozycje.get(j).getNazwaTowaru().equals(pozycja.getNazwaTowaru())) {
                    pozycje.get(j).setCena(pozycja.getCena());
                    pozycje.get(j).setIleSztuk(pozycje.get(j).getIleSztuk() + pozycja.getIleSztuk());
                }
            }
        } else {
            pozycje.add(pozycja);
        }
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
        System.out.println("\nZamowienie");
        for (Pozycja p : pozycje) {
            System.out.println(p.toString());
        }
        System.out.println("\nRazem:\t" + obliczWartosc() + " zł");
        return "";
    }

    void usunPozycje(int indeks) {
        pozycje.remove(indeks);
    }

    void edytujPozycje(int indeks, String nazwaTowaru, double cena, int ileSztuk) {
        pozycje.get(indeks).setNazwaTowaru(nazwaTowaru);
        pozycje.get(indeks).setCena(cena);
        pozycje.get(indeks).setIleSztuk(ileSztuk);
    }


}
