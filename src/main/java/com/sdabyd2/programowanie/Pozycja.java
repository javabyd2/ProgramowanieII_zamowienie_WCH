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

        System.out.println(String.format("%1$-20s %2$-10s %3$-4s %4$-10s", nazwaTowaru, cena + " zł", ileSztuk +
                " szt.", Double.toString(obliczWartosc()) + " zł"));

        return "";
    }
}
