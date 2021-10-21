package com.uni;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

class kalkuliereDurschnittszeit {

    @Test
    void getVorname() {
        Benutzer b1 = new Benutzer("Andrada", "Lucaciu", Arrays.asList(new Basketball(), new Fussball(), new Hochsprung(), new Hindernislauf()));
        assertEquals("Andrada", b1.getVorname());
    }

    @Test
    void getNachname() {
        Benutzer b1 = new Benutzer("Andrada", "Lucaciu", Arrays.asList(new Basketball(), new Fussball(), new Hochsprung(), new Hindernislauf()));
        assertEquals("Lucaciu", b1.getNachname());
    }

    @Test
    void setVorname() {
        Benutzer b1 = new Benutzer("Andrada", "Lucaciu", Arrays.asList(new Basketball(), new Fussball(), new Hochsprung(), new Hindernislauf()));
        b1.setVorname("Andrea");
        assertEquals("Andrea", b1.getVorname());
    }

    @Test
    void setNachname() {
        Benutzer b1 = new Benutzer("Andrada", "Lucaciu", Arrays.asList(new Basketball(), new Fussball(), new Hochsprung(), new Hindernislauf()));
        b1.setNachname("Kriszte");
        assertEquals("Kriszte", b1.getNachname());
    }

    @Test
    void kalkuliereZeit() {
        Benutzer b1 = new Benutzer("Andrada", "Lucaciu", Arrays.asList(new Basketball(), new Fussball(), new Hochsprung(), new Hindernislauf()));
        assertEquals(170, b1.kalkuliereZeit());
    }


    @Test
    void kalkuliereDurschnittszeit() {
        Benutzer b1 = new Benutzer("Andrada", "Lucaciu", Arrays.asList(new Basketball(), new Fussball(), new Hochsprung(), new Hindernislauf()));
        assertEquals(42.5, b1.kalkuliereDurschnittszeit());
    }
}
