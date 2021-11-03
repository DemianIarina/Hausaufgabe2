package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BenutzerTest {

    @Test
    void kalkuliereZeit() {
        Basketball basketball1 = new Basketball();
        Basketball basketball2 = new Basketball();
        Fussball fussball1 = new Fussball();
        Hindernislauf hindernislauf1 = new Hindernislauf();
        Hochsprung hochsprung1 = new Hochsprung();
        Hochsprung hochsprung2 = new Hochsprung();

        List<Sport> sports= new ArrayList<>(Arrays.asList(basketball1,basketball2,fussball1,hindernislauf1,hochsprung1,hochsprung2)) ;  //man erstellt den array von Sports
        Benutzer benutzer1 = new Benutzer("Ion", "Pop", sports );

        assertEquals(benutzer1.kalkuliereZeit(),245.0);
    }

    @Test
    void testKalkuliereZeit() {
        Basketball basketball1 = new Basketball();
        Basketball basketball2 = new Basketball();
        Fussball fussball1 = new Fussball();
        Hindernislauf hindernislauf1 = new Hindernislauf();
        Hochsprung hochsprung1 = new Hochsprung();
        Hochsprung hochsprung2 = new Hochsprung();

        List<Sport> sports= new ArrayList<>(Arrays.asList(basketball1,basketball2,fussball1,hindernislauf1,hochsprung1,hochsprung2)) ;  //man erstellt den array von Sports
        Benutzer benutzer1 = new Benutzer("Ion", "Pop", sports );

        assertEquals(benutzer1.kalkuliereZeit(hochsprung1),20);
        assertEquals(benutzer1.kalkuliereZeit(basketball1),55);
        assertEquals(benutzer1.kalkuliereZeit(hindernislauf1),30);
    }

    @Test
    void kalkuliereDurchschnittsZeit() {
        Basketball basketball1 = new Basketball();
        Basketball basketball2 = new Basketball();
        Fussball fussball1 = new Fussball();
        Hindernislauf hindernislauf1 = new Hindernislauf();
        Hochsprung hochsprung1 = new Hochsprung();
        Hochsprung hochsprung2 = new Hochsprung();

        List<Sport> sports= new ArrayList<>(Arrays.asList(basketball1,basketball2,fussball1,hindernislauf1,hochsprung1,hochsprung2)) ;  //man erstellt den array von Sports
        Benutzer benutzer1 = new Benutzer("Ion", "Pop", sports );

        assertEquals(benutzer1.kalkuliereDurchschnittsZeit(),40.833333333333336);
    }
}