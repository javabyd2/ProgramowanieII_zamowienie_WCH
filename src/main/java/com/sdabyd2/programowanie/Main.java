package com.sdabyd2.programowanie;

public class Main {
    public static void main(String[] args) throws Exception {

        Pozycja p1 = new Pozycja("Brokuły", 1, 3);
        System.out.println(p1);
        Pozycja p2 = new Pozycja("Kasza gryczana", 1, 4);
        Pozycja p3 = new Pozycja("Kurczak", 1, 8);


        Zamowienie zamowienie = new Zamowienie(20);
        zamowienie.dodajPozycjeUpdate(p1);
        zamowienie.dodajPozycjeUpdate(p2);
        zamowienie.dodajPozycjeUpdate(p2);
        zamowienie.dodajPozycjeUpdate(p3);
        zamowienie.dodajPozycjeUpdate(p3);
        System.out.println(zamowienie);


    }
}
