package esVideogiochi;

import java.util.ArrayList;
import java.util.Scanner;

import models.Admin;
import models.Utente;
import models.VideoGioco;

public class Operazioni implements IOperazioni {
	
	ArrayList<VideoGioco> games = new ArrayList<VideoGioco>();
	ArrayList<Utente> users = new ArrayList<Utente>();
	Admin admin = new Admin();
	ArrayList<String> tasks = new ArrayList<String>();
	Scanner scannerLine= new Scanner(System.in);
	Scanner scannerInt= new Scanner(System.in);
	
	public void tasks(String task) {
		tasks.add(task);
		admin.setRichieste(tasks);
	}

	@Override
	public VideoGioco createGioco(String nome, String genere) {
		VideoGioco game = new VideoGioco();
		game.setNome(nome);
		game.setGenere(genere);
		return game;
		
	}

	@Override
	public void getAll() {
		for(VideoGioco game:games) {
			System.out.println(game.getNome()+ "-"+game.getGenere());
		}
		
	}

	@Override
	public void addGioco(VideoGioco gioco) {
		games.add(gioco);
		
	}

	@Override
	public void deleteGioco(String nome) {
		int index=games.indexOf(nome);
		games.remove(index);
	}

	@Override
	public void updateGioco(VideoGioco gioco, String nome, String genere) {
		gioco.setNome(nome);
		gioco.setGenere(genere);
		
	}
	
	public void creaUser(String email, String password) {
		Utente utente = new Utente();
		utente.setNickname(email);
		utente.setPassword(password);
		users.add(utente);
		
		
	}
	
	
	public void adminPanel() {
		System.out.println("Vuoi aggiungere un gioco? 1");
		System.out.println("Vuoi rimuovere un gioco? 2");
		System.out.println("Vuoi modificare un gioco? 3");
		System.out.println("Vuoi visualizzare la lista dei giochi? 4");
		int adminpanel= scannerInt.nextInt();
		switch(adminpanel) {
		case 1:
			System.out.println("Inserisci nuovo titolo");
			String titolo= scannerLine.nextLine();
			System.out.println("Inserisci genere");
			String genere= scannerLine.nextLine();
			VideoGioco gioco= createGioco(titolo, genere);
			addGioco(gioco);
			break;
		case 2:
			break;
			case 3:
				break;
			case 4:
				getAll();
				break;
		}
	
	}
	


}
