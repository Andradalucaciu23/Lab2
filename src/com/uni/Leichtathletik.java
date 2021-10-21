package com.uni;

public class Leichtathletik implements Sport {
    /**
     * return: wir machen die Kombination der beiden Sportarten
     */
    @Override
    public double kalkuliereZeit(){
        Hochsprung H=new Hochsprung();
        Hindernislauf HH=new Hindernislauf();

        return H.kalkuliereZeit()+ HH.kalkuliereZeit();
    }
}
