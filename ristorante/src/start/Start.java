package start;

import java.util.ArrayList;
import java.util.List;

import dtos.Reservation;
import dtos.Table;
import services.ReservationServiceImpl;
import interfaces.ReservationService;
import menu.Menu;
//TESTING CLASS
public class Start {
	public static void main(String[] args) {
		
		Menu menu = new Menu();
		ReservationServiceImpl rsi = new ReservationServiceImpl();
		Table table = new Table();
		List<String> dates = new ArrayList<String>();
		List<String> schedules = new ArrayList<String>();
		List<Table> tables = new ArrayList<Table>();	
		List<Reservation> reservations = new ArrayList<Reservation>();
		Long id= (long) 1;
		
		table.setId((long) 10);
		table.setFree(true);
		table.setNumberOfSeats(5);
		tables.add(table);
		
		dates.add("01/10/2023");
		dates.add("02/10/2023");
		
		schedules.add("10");
		schedules.add("11");
		
		//rsi.bookTable(dates, schedules, tables, reservations);
		//rsi.deleteReservation(id, reservations);
		//rsi.getAvailableTables(tables);
		
		//TESTING MENU
		menu.menu(dates, schedules, tables, reservations, id);
		
		
	}
	

}
