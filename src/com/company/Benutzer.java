package com.company;

import java.util.List;

/**
 * Benutzerklasse, jeder Obj hat Name, Vorname und
 * eine Liste von Sportarten
 * @author Demian Iarina
 */
public class Benutzer {
    private String vorName;
    private String nachName;
    private List<Sport> sport;

    public Benutzer(String vorName, String nachName, List<Sport> sport) {
        this.vorName = vorName;
        this.nachName = nachName;
        this.sport = sport;
    }

    /**
     * berechnung die nötige Zeit für
     * die Treibung aller seinen Lieblingssporte
     * @return double
     */
    public double kalkuliereZeit(){
        double summe = 0;
        for(Sport aktualSport : sport){
            summe = summe + aktualSport.kalkuliereZeit();         //der Zeit fur jedes Sport wird zu der Summe addiert
        }
        return summe;
    }

    /**
     * wie viel Zeit für eine Sportart gebraucht wird
     * @param sport irgendeinem Sport von der Liste der Benutzer
     * @return double
     */
    public double kalkuliereZeit(Sport sport){
        return sport.kalkuliereZeit();                  //kalkuliereZeit fur die entsprechende typ wird aufgerufen
    }

    /**
     * wie lange er durchschnittlich für seinen Lieblingssport braucht
     * @return double
     */
    public double kalkuliereDurchschnittsZeit(){
        double summe = kalkuliereZeit();
        return summe/sport.size();                    //teilen durch die Anzahl von ausgeübten Sportarten
    }

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
