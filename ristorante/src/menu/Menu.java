package menu;

import java.util.ArrayList;
import java.util.List;

import services.ReservationServiceImpl;
import java.util.Scanner;

import dtos.Reservation;
import dtos.Table;

//MENU
public class Menu {
	Scanner scannerLine = new Scanner(System.in);
	Scanner scannerInt = new Scanner(System.in);
	ReservationServiceImpl rsi = new ReservationServiceImpl();
	

	
	public void menu(List<String> dates, List<String> schedules, List<Table> tables, List<Reservation> reservations, Long id) {
		System.out.println("Welcome, press 1 to book a table, press 2 to delete a reservation, press 3 to get all available tables");
		
		int choice = scannerInt.nextInt();
		
		switch(choice) {
			
		case 1:
			
			rsi.bookTable(dates, schedules, tables, reservations);
			break;
		
		case 2:
			rsi.deleteReservation(id, reservations);
			break;
			
		case 3:
			rsi.getAvailableTables(tables);
			break;
			
		}
	}

}
