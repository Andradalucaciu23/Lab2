package com.uni;


import java.util.ArrayList;
import java.util.Arrays;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Fussball f=new Fussball();
        Basketball b=new Basketball();
        Hindernislauf h=new Hindernislauf();
        Hochsprung hh=new Hochsprung();
        Mannschaftssport l=new Mannschaftssport();
        Leichtathletik m=new Leichtathletik();

        Benutzer b1=new Benutzer("Andrada", "Lucaciu",Arrays.asList(f,b,h,hh,l,m));

        System.out.println("Benutzer");
        System.out.println();
        System.out.print(b1.getVorname());
        System.out.print(" ");
        System.out.println(b1.getNachname());
        System.out.println();
        System.out.println("kalkuliereZeit");
        System.out.println(b1.kalkuliereZeit());
        System.out.println();
        System.out.println("kalkuliereZeit(Sport)");
        System.out.println(b1.kalkuliereZeit(f));
        System.out.println(b1.kalkuliereZeit(b));
        System.out.println(b1.kalkuliereZeit(h));
        System.out.println(b1.kalkuliereZeit(hh));
        System.out.println();
        System.out.println("kalkuliereDurschnittzeit");
        System.out.println((b1.kalkuliereDurschnittszeit()));
    }
}
