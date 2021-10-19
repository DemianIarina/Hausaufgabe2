package com.company;

/**
 * Die Fussbalklasse bietet eine Spezialisierung
 * der Klasse Mannschaftsport, der 65 als gebrauchte
 * Zeit hat
 * @author Demian Iarina
 */
public class Fussball extends Mannschaftssport{

    /**
     *
     * @return 65, den Wert fur die Minuten
     * gebraucht un Fussball zu spielen
     */
    public double kalkuliereZeit(){
        return 65;
    }
}
