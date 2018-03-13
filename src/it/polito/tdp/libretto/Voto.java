package it.polito.tdp.libretto;

//POJO

public class Voto {
	
	private String esame;
	private int voto;
	//private LocalDate data;
	
	public String getEsame() {
		return esame;
	}
	public Voto(String esame, int voto) {
		super();
		this.esame = esame;
		this.voto = voto;
	}
	public void setEsame(String esame) {
		this.esame = esame;
	}
	public int getVoto() {
		return voto;
	}
	public void setVoto(int voto) {
		if(voto<18 || voto>30) {
			throw new IllegalArgumentException("Valore non ammesso");
		}
		this.voto = voto;
	}
	@Override
	public String toString() {
		return "Voto [esame=" + esame + ", voto=" + voto + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((esame == null) ? 0 : esame.hashCode());
		result = prime * result + voto;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voto other = (Voto) obj;
		if (esame == null) {
			if (other.esame != null)
				return false;
		} else if (!esame.equals(other.esame))
			return false;
		if (voto != other.voto)
			return false;
		return true;
	}
	
	
	
}