package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Basketball basketball1 = new Basketball();
        Basketball basketball2 = new Basketball();
        Fussball fussball1 = new Fussball();
        Hindernislauf hindernislauf1 = new Hindernislauf();
        Hochsprung hochsprung1 = new Hochsprung();
        Hochsprung hochsprung2 = new Hochsprung();

        List<Sport> sports= new ArrayList<>(Arrays.asList(basketball1,basketball2,fussball1,hindernislauf1,hochsprung1,hochsprung2)) ;  //man erstellt den array von Sports
        Benutzer benutzer1 = new Benutzer("Ion", "Pop", sports );

        System.out.print("Nötige Zeit für die Treibung aller seinen Lieblingssporte: ");
        System.out.println(benutzer1.kalkuliereZeit());
        System.out.print("Nötige Zeit für eine Sportart gebraucht: ");
        System.out.println(benutzer1.kalkuliereZeit(hindernislauf1));
        System.out.print("Durchschnittlich Zeit gebraucht: ");
        System.out.println(benutzer1.kalkuliereDurchschnittsZeit());
    }
}
