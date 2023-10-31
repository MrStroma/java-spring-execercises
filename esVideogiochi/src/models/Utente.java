package models;

import java.util.ArrayList;

public class Utente extends Admin {
	
	ArrayList<Utente> users = new ArrayList<>();
	String nickname;
	String password;
	
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	//da modificare in una lista
	public boolean login(String nickname, String password) {
	
		boolean logged = false;
		for(Utente user: users) {
			if(user.getNickname().equals(nickname) && user.getPassword().equals(password) ) {
				logged= true;
			} else {
				logged= false;
			} 
		}
		return logged;
		
	}
	
	public void login2(String nick, String pass) {
		for(Utente user: users) {
			if(users.contains(nick)) {
				
			}
		}
	}
	
	// fare logout
	
	
}
