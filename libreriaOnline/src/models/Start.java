package models;

import java.util.ArrayList;
import java.util.List;


public class Start {
	public static void main(String[] args) {
		
		//CLASSE TEST
		List<Recensione> recensioni = new ArrayList<Recensione>();
		List<Libro> libri = new ArrayList<Libro>();
		LibreriaOnline libreria = new LibreriaOnline();
		Utente utente = new Utente();
		Libro libro= new Libro();
		UtentiMetodi metodi = new UtentiMetodi();
		
		//AGGIUNTA UTENTE
		utente.setId(1);
		utente.setEmail("stroma");
		utente.setNome("pippo");
		
		//AGGIUNTA LIBRO
		libro.setId(1);
		libro.setAutore("pippo");
		libro.setGenere("AVVENTURA");
		libro.setPrezzo(10);
		libro.setTitolo("harry");
		libri.add(libro);
		libreria.setListaLibri(libri);
		for(Libro libro1: libreria.getListaLibri()) {
			System.out.println(libro1.getId());
		}
		
		//TEST METODI
		utente.acquistaLibro(libro, libreria);
		
		utente.lasciaRecensione(libro, utente);
			
		libreria.setListaLibri(libri);
		libreria.setListaRecensioni(recensioni);
		List<Libro> libriStessoGenere =metodi.stessoGenere("AVVENTURA", "pippo", libreria);
		for(Libro libriScelti:libriStessoGenere) {
			System.out.println(libriScelti.getTitolo());
		}
	}
	
	
}
