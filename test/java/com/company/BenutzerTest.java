package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BenutzerTest {


    @Test
    void kalkuliereZeit() {
        Basketball b1 = new Basketball();
        Basketball b2 = new Basketball();
        Fussball f1 = new Fussball();
        Hindernislauf hi1 = new Hindernislauf();
        Hochsprung ho1 = new Hochsprung();
        Hochsprung ho2 = new Hochsprung();

        List<Sport> l= new ArrayList<>(Arrays.asList(b1,b2,f1,hi1,ho1,ho2)) ;  //man erstellt den array von Sports
        Benutzer ben1 = new Benutzer("Ion", "Pop", l );

        assertEquals(ben1.kalkuliereZeit(),245.0);
    }

    @Test
    void testKalkuliereZeit() {
        Basketball b1 = new Basketball();
        Basketball b2 = new Basketball();
        Fussball f1 = new Fussball();
        Hindernislauf hi1 = new Hindernislauf();
        Hochsprung ho1 = new Hochsprung();
        Hochsprung ho2 = new Hochsprung();

        List<Sport> l= new ArrayList<>(Arrays.asList(b1,b2,f1,hi1,ho1,ho2)) ;  //man erstellt den array von Sports
        Benutzer ben1 = new Benutzer("Ion", "Pop", l );

        assertEquals(ben1.kalkuliereZeit(ho2),20);
        assertEquals(ben1.kalkuliereZeit(b1),55);
        assertEquals(ben1.kalkuliereZeit(hi1),30);
    }

    @Test
    void kalkuliereDurchschnittsZeit() {
        Basketball b1 = new Basketball();
        Basketball b2 = new Basketball();
        Fussball f1 = new Fussball();
        Hindernislauf hi1 = new Hindernislauf();
        Hochsprung ho1 = new Hochsprung();
        Hochsprung ho2 = new Hochsprung();

        List<Sport> l= new ArrayList<>(Arrays.asList(b1,b2,f1,hi1,ho1,ho2)) ;  //man erstellt den array von Sports
        Benutzer ben1 = new Benutzer("Ion", "Pop", l );

        assertEquals(ben1.kalkuliereDurchschnittsZeit(),40.833333333333336);
    }

    @Test
    void getVorName() {

    }

    @Test
    void setVorName() {
    }

    @Test
    void getNachName() {
    }

    @Test
    void setNachName() {
    }

    @Test
    void getSport() {
    }

    @Test
    void setSport() {
    }
}