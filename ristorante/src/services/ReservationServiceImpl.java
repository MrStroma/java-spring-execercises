package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.Reservation;
import dtos.Table;
import interfaces.ReservationService;

//Service class about the Reservation dto
public class ReservationServiceImpl implements ReservationService {
	
	Scanner scannerLine = new Scanner(System.in);
	Scanner scannerInt = new Scanner(System.in);
	Scanner scannerLong= new Scanner(System.in);
	
	
	//Method used to booktable
	//Check wheter the date and schedules are free, if its positive, then create a new
	//Reservation and a new table
	@Override
	public void bookTable(List<String> dates, List<String> schedules, List<Table> tables, List<Reservation> reservations) {
		// TODO Auto-generated method stub
		
		System.out.println("Insert id reservation");
		Long id = scannerLong.nextLong();
		System.out.println("Insert a date");
		String dateBooking = scannerLine.nextLine();
		System.out.println("Insert a schedule");
		String scheduleBooking = scannerLine.nextLine();
		System.out.println("Insert number of people");
		int numberPeople = scannerInt.nextInt();
		
		for(String date:dates) {
			if(dates.contains(dateBooking)) {
				for(String schedule:schedules) {
					if(schedules.contains(scheduleBooking)) {
						Reservation reservation = new Reservation();
						reservation.setId(id);
						reservation.setDate(dateBooking);
						reservation.setNumberOfPeople(numberPeople);
						reservation.setSchedule(scheduleBooking);
						reservations.add(reservation);
						Table table = new Table();
						table.setId(id);
						table.setFree(false);
						table.setNumberOfSeats(numberPeople);
						tables.add(table);
					} else {
						System.out.println("please, this hour is taken, change hour");
					}
				}
			} else {
				System.out.println("There are no dates available");
			}
		}
		
		
	}
	
	//Method used to delete a reservation, check the ID
	@Override
	public void deleteReservation(Long id, List<Reservation> reservations) {
		for(Reservation reservation: reservations) {
			if(reservation.getId() == id) {
				reservations.remove(reservation);
				System.out.println("delete succesfully");
			} else {
				System.out.println("no reservation with this id");
			}
		}
		
	}

	@Override
	public List<Table> getAvailableTables(List<Table> tables) {
		for(Table table:tables) {
			if(table.isFree()) {
				List<Table> tablesFree = new ArrayList<Table>();
				tablesFree.add(table);
				for(Table tableFree:tablesFree) {
					System.out.println("table free with id: "+tableFree.getId());
				}
			} else if(tables == null) {
				System.out.println("There are no availables tables");
			}
		}
		return tables;
		// TODO Auto-generated method stub
		
	}




}
