package it.polito.tdp.libretto;

import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	private List<Voto> voti;
	
	public Libretto() {
		this.voti = new ArrayList<>();
		}
	
	public void add(Voto v) {
		if(this.voti.contains(v)) {
			System.out.println("Il voto esiste già!");
			return;
		}
		
		for(Voto voto : this.voti) {
			if(voto.getEsame().equals(v.getEsame())){
				System.out.println("Trovato esame uguale. Aggiorno voto.");
				voto.setVoto(v.getVoto());
				return;
			}
		}
		this.voti.add(v);
	}
	
	public void stampa() {
		System.out.println("Ci sono "+ voti.size() +" voti:");
		for(Voto v : this.voti) {
			System.out.println(v);
		}
	}
	
	public void stampa25() {
		for(Voto v : this.voti) {
			if(v.getVoto()==25)
			System.out.println(v);
		}
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Ci sono "+ voti.size() +" voti: (StringBuilder)\n");
		for(Voto v : this.voti) {
			sb.append(v.toString());
			sb.append("\n");
		}
		return sb.toString();
	}
	
	public String getMarkfromClass(String nomeCorso) {
		for(Voto v : this.voti) {
			// MAI USARE == PER IL CONFRONTO
//			if(v.getEsame().toLowerCase() ==nomeCorso.toLowerCase()) {
//				return String.valueOf(v.getVoto());
			
			//CORRETTO
			if(v.getEsame().toLowerCase().equals(nomeCorso.toLowerCase())) {
				return String.valueOf(v.getVoto());
			}
		}
		return "nomeCorso not found";
	}
	
}
