package com.uni;

public class Mannschaftssport implements Sport{
    /**
     *
     * @return wir machen die Kombination der beiden Sportarten
     */
    @Override
    public double kalkuliereZeit(){
        Basketball B= new Basketball();
        Fussball F=new Fussball();

        return B.kalkuliereZeit()+ F.kalkuliereZeit();
    }
}
