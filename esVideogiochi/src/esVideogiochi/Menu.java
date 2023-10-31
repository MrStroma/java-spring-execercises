package esVideogiochi;

import java.util.ArrayList;
import java.util.Scanner;

import models.Utente;
import models.VideoGioco;

public class Menu {
	//Qui creerò il menu
	
	//ArrayList<Task> tasks= new ArrayList<Task>();
	ArrayList<Utente> users = new ArrayList<Utente>();
	Utente user = new Utente();
	Operazioni operazione = new Operazioni();
	Utente utente;
	Scanner scannerLine= new Scanner(System.in);
	Scanner scannerInt= new Scanner(System.in);
	boolean isLogged;
	boolean continua = true;
	
	
	
	

	public void menu() {
		
		
		while(continua) {
			
		Utente user = new Utente();
		user.setNickname("prova");
		user.setPassword("prova");
		users.add(user);
		System.out.println("Vuoi loggarti(1) o registrarti(2)?");
		int risposta= scannerInt.nextInt();
		
		switch(risposta) {
		
		case 1:
			System.out.println("Inserisci email");
			String email= scannerLine.nextLine();
			System.out.println("Inserisci password");
			String password= scannerLine.nextLine();
			
			for(Utente utente: users) {
				
				if(utente.login(email, password) == true) {
					System.out.println("sei loggato");
					isLogged=true;
					if(utente.getNickname().equals("admin") && utente.getPassword().equals("admin")) {
						operazione.adminPanel();
					}
				} else {
					System.out.println("non ci sono utenti con questi elementi");
					isLogged=false;
				}
			}
			break;
		
		case 2:
			System.out.println("Inserisci email");
			String emailRegister= scannerLine.nextLine();
			System.out.println("Inserisci password");
			String passwordRegister= scannerLine.nextLine();		
			for(Utente utente:users) {
			if(utente.getNickname().equals(emailRegister) && utente.getPassword().equals(passwordRegister)) {
				System.out.println("utente gia registrato, prova il login");
				break;
			} else if(utente.getNickname().contains(emailRegister)) {
				System.out.println("utente gia registrato, prova il login");

			}
				
			else if(!utente.getNickname().contains(emailRegister)){
				operazione.creaUser(emailRegister,passwordRegister);
				
			}
			
			}
			for(Utente newutente:users) {
				System.out.println(newutente.getNickname()+ " - "+newutente.getPassword());
			}
						
								

					
					
				
				
		//	}
			
			
			// qui poi inserisco il metodo per creare task;

		System.out.println("sono fuori dal case");
			
		if(isLogged== true) {
			System.out.println("true");
		}
		
		//PANNELLO ADMIN
		/*
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
				VideoGioco gioco= operazione.createGioco(titolo, genere);
				operazione.addGioco(gioco);
				break;
			case 2:
				break;
 			case 3:
 				break;
 			case 4:
 				operazione.getAll();
 				break;
			}
		*/

	}
	
	
		}//fine while	
}//fine menu metodo
}
