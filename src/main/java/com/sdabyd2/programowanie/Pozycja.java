package com.sdabyd2.programowanie;

public class Pozycja {

    private String nazwaTowaru;
    private int ileSztuk;
    private double cena;

    public Pozycja(String nazwaTowaru, int ileSztuk, double cena) {
        this.nazwaTowaru = nazwaTowaru;
        this.ileSztuk = ileSztuk;
        this.cena = cena;
    }

    double obliczWartosc() {
        return this.ileSztuk * this.cena;
    }

    @Override
    public String toString() {
        return String.format("%1$-20s %2$-10s %3$-4s %4$-10s", nazwaTowaru, cena + " zł", ileSztuk +
                " szt.", Double.toString(obliczWartosc()) + " zł");

    }

    public String getNazwaTowaru() {
        return nazwaTowaru;
    }

    public void setNazwaTowaru(String nazwaTowaru) {
        this.nazwaTowaru = nazwaTowaru;
    }

    public int getIleSztuk() {
        return ileSztuk;
    }

    public void setIleSztuk(int ileSztuk) {
        this.ileSztuk = ileSztuk;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    double obliczWartoscZRabatem() {
        double sumaZRabatem = cena * ileSztuk;
        if (ileSztuk > 5 && ileSztuk < 10) {
            sumaZRabatem = sumaZRabatem * 0.05;
        } else if (ileSztuk > 10 && ileSztuk < 20) {
            sumaZRabatem = sumaZRabatem * 0.1;
        } else if (ileSztuk > 20) {
            sumaZRabatem = sumaZRabatem * 0.15;
        }
        return sumaZRabatem;
    }
}
