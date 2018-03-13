package it.polito.tdp.libretto;

import java.util.Collections;

public class TestLibretto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libretto lib = new Libretto();
		Libretto newlib = new Libretto(lib.getVoti());
		
		
		lib.add( new Voto("Analisi", 30));
		lib.add( new Voto("Chimica", 28));
		lib.add( new Voto("TdP", 25));
		
		lib.stampa();
		
		System.out.println(lib.toString());
		
		System.out.println("Voti pari a 25:");
		lib.stampa25();
		
		System.out.println("TdP voto:");
		System.out.println(lib.getMarkfromClass("TdP"));
		System.out.println("TdP voto:");
		System.out.println(lib.getMarkfromClass("tdp"));
	
		lib.add(new Voto("TdP", 25));
		lib.add(new Voto("TdP", 29));

		System.out.println(lib.toString());
		
		
		System.out.println("Libretto");
		System.out.println(lib.toString());
		
		//Collections.sort(newlib.getVoti());
		
	}

}