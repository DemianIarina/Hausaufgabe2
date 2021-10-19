package com.company;

/**
 * Die Hochsprungklasse bietet eine Spezialisierung
 * der Klasse Leichtatletik, der 20 als gebrauchte
 * Zeit zuruckgibt
 * @author Demian Iarina
 */
public class Hochsprung extends Leichtathletik {

    /**
     *
     * @return 20, den Wert fur die Minuten
     * gebraucht un Hochsprung zu treiben
     */
    public double kalkuliereZeit(){
        return 20;
    }
}
