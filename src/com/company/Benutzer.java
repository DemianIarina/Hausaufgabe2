package com.company;

import java.util.List;

public class Benutzer {
    private String vorName;
    private String nachName;
    private List<Sport> sport;

    public Benutzer(String vorName, String nachName, List<Sport> sport) {
        this.vorName = vorName;
        this.nachName = nachName;
        this.sport = sport;
    }

    //die nötige Zeit für die Treibung aller seinen Lieblingssporte
    public double kalkuliereZeit(){
        return 0;
    }

    //wie viel Zeit für eine Sportart gebraucht wird.
    public double kalkuliereZeit(Sport s){
        return 0;
    }

    //wie lange er durchschnittlich für seinen Lieblingssport braucht
    public double kalkuliereDurchschnittsZeit(){
        return 0;
    }

    //getter & setters
    public String getVorName() {
        return vorName;
    }

    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    public String getNachName() {
        return nachName;
    }

    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    public List<Sport> getSport() {
        return sport;
    }

    public void setSport(List<Sport> sport) {
        this.sport = sport;
    }
}
