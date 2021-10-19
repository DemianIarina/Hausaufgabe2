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
        double sum = 0;
        for(Sport s : sport){
            sum = sum + s.kalkuliereZeit();         //der Zeit fur jedes Sport wird zu der Summe addiert
        }
        return sum;
    }

    /**
     * wie viel Zeit für eine Sportart gebraucht wird
     * @param s irgendeinem Sport von der Liste der Benutzer
     * @return double
     */
    public double kalkuliereZeit(Sport s){
        return s.kalkuliereZeit();                  //kalkuliereZeit fur die entsprechende typ wird aufgerufen
    }

    /**
     * wie lange er durchschnittlich für seinen Lieblingssport braucht
     * @return double
     */

    public double kalkuliereDurchschnittsZeit(){
        double sum = kalkuliereZeit();
        return sum/sport.size();                    //teilen durch die Anzahl von ausgeübten Sportarten
    }

    /**
     * getter Vorname
     * @return String
     */
    public String getVorName() {
        return vorName;
    }

    /**
     * setter Vorname
     * @param vorName der Vorname der Benutzer
     */
    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    /**
     * getter Nachname
     * @return String
     */
    public String getNachName() {
        return nachName;
    }

    /**
     * setter Nachname
     * @param nachName der Nachname der Benutzer
     */
    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    /**
     * getter List
     * @return List
     */
    public List<Sport> getSport() {
        return sport;
    }

    /**
     * setter List
     * @param sport die liste der Sportarten gemacht von der Benutzer
     */
    public void setSport(List<Sport> sport) {
        this.sport = sport;
    }
}
