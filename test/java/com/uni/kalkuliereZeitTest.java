package com.uni;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class kalkuliereZeitTest {

    @Test
    void kalkuliereZeit() {

        Mannschaftssport m = new Mannschaftssport();
        assertEquals(m.kalkuliereZeit(), 120);

        Leichtathletik l = new Leichtathletik();
        assertEquals(l.kalkuliereZeit(), 50);

        Basketball b = new Basketball();
        assertEquals(b.kalkuliereZeit(), 55);

        Fussball f = new Fussball();
        assertEquals(f.kalkuliereZeit(), 65);

        Hindernislauf h = new Hindernislauf();
        assertEquals(h.kalkuliereZeit(), 30);

        Hochsprung hh = new Hochsprung();
        assertEquals(hh.kalkuliereZeit(), 20);

    }
}