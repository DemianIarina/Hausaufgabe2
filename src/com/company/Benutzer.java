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
        double sum = 0;
        for(Sport s : sport){
            sum = sum+ s.kalkuliereZeit();         //der Zeit fur jedes Sport wird zu der Summe addiert
        }
        return sum;
    }

    //wie viel Zeit für eine Sportart gebraucht wird.
    public double kalkuliereZeit(Sport s){
        return s.kalkuliereZeit();                  //kalkuliereZeit fur die entsprechende typ wird aufgerufen
    }

    //wie lange er durchschnittlich für seinen Lieblingssport braucht
    public double kalkuliereDurchschnittsZeit(){
        double sum = kalkuliereZeit();
        return sum/sport.size();                    //teilen durch die Anzahl von ausgeübten Sportarten
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
