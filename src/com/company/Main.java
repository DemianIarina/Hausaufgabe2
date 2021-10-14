package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Basketball b1 = new Basketball();
        Basketball b2 = new Basketball();
        Fussball f1 = new Fussball();
        Hindernislauf hi1 = new Hindernislauf();
        Hochsprung ho1 = new Hochsprung();
        Hochsprung ho2 = new Hochsprung();

        List<Sport> l= new ArrayList<>(Arrays.asList(b1,b2,f1,hi1,ho1,ho2)) ;
        Benutzer ben1 = new Benutzer("Ion", "Pop", l );

        System.out.println(ben1.kalkuliereZeit());
        System.out.println(ben1.kalkuliereZeit(hi1));
        System.out.println(ben1.kalkuliereDurchschnittsZeit());
    }
}
