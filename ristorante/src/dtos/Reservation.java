package dtos;

import java.util.Date;

//DTO about the class "Reservation"
public class Reservation {
	
	private Long id;
	private String date;
	private String schedule;
	private int numberOfPeople;
	private Table table;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getSchedule() {
		return schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	public int getNumberOfPeople() {
		return numberOfPeople;
	}
	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}
	public Table getTable() {
		return table;
	}
	public void setTable(Table table) {
		this.table = table;
	}
	
	@Override
	public String toString() {
		return "Reservation [id=" + id + ", date=" + date + ", schedule=" + schedule + ", numberOfPeople="
				+ numberOfPeople + ", table=" + table + "]";
	}
	
	
}
