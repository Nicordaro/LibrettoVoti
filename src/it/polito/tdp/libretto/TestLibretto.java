package it.polito.tdp.libretto;

public class TestLibretto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libretto lib = new Libretto();
		
		lib.add( new Voto("Analisi", 30));
		lib.add( new Voto("Chimica", 28));
		
		System.out.println("Stampo i voti.");
		
		lib.stampa();
		
	}

}