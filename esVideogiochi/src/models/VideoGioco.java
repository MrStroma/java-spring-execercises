package models;

public class VideoGioco {
	
	String nome;
	String genere;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	
	public void gioca() {
		System.out.println("Sto giocando a "+ getNome());
	}
	

}
