package com.uni;

import java.util.List;

public class Benutzer {
    //Benutzerattribute
    /**
     *  /**
     * ein Objekt von Typ "Benutzer" erstellen
     * @param vorname ein String
     * @param nachname ein String
     * @param sport eine Liste von Sportarten
     *
     */
    private String vorname;
    private String nachname;
    private List<Sport> sport;

    //Constructor
    public Benutzer(String Vorname, String Nachname, List<Sport> sport){
        this.vorname =Vorname;
        this.nachname =Nachname;
        this.sport= sport;
    }

    //Getters
    public String getVorname(){
        return vorname;
    }

    public String getNachname(){
        return nachname;
    }

    public List<Sport> getSport() {
        return sport;
    }

    //Setters
    public void setVorname(String andrea){
        this.vorname = vorname;
    }

    public void setNachname(String kriszte){
        this.nachname = nachname;
    }

    public void setSport(List<Sport>sport){
        this.sport= sport;
    }

    /**
     *
     * @return kalkuliereZeit Methode - Zeit fur alle Sportarten
     */
    public double kalkuliereZeit(){
        double summe=0;
        for(Sport s:sport){
            summe+=s.kalkuliereZeit();
        }
        return summe;
    }

    /**
     *
     * @return kalkuliereZeit(Sport s) Methode -Zeit nur fur ein Sport
     */
    //wir benuzen INSTANCEOF um zu wissen, ob der Sport den wir suchen, erscheint er auch in der Mannschaftliste oder Leichtathletikliste
    public double kalkuliereZeit(Sport s){
        int kontor=0;
        for(int i=0;i<sport.size();i++) {
            if (sport.get(i) == s)
                kontor++;
            else if (sport.get(i) instanceof Mannschaftssport && s instanceof Fussball && !(s instanceof Basketball) && !(sport.get(i) instanceof Basketball))
                kontor++;
            else if (sport.get(i) instanceof Mannschaftssport && s instanceof Basketball && !(s instanceof Fussball) && !(sport.get(i) instanceof Fussball))
                kontor++;
            else if (sport.get(i) instanceof Leichtathletik && s instanceof Hindernislauf && !(s instanceof Hochsprung) && !(sport.get(i) instanceof Hochsprung))
                kontor++;
            else if (sport.get(i) instanceof Leichtathletik && s instanceof Hochsprung && !(s instanceof Hindernislauf) && !(sport.get(i) instanceof Hindernislauf))
                kontor++;
        }
        if (kontor == 0)
            kontor = 1;
        return kontor * s.kalkuliereZeit();

    }

    /**
     *
     * @return kalkuliereDurschnittszeit Methode- die durchschnittliche Zeit aller Sportarten
     */
    public double kalkuliereDurschnittszeit(){
        return kalkuliereZeit()/ sport.size();
    }


}
