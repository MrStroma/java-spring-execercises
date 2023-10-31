package interfaces;

import java.util.ArrayList;
import java.util.List;

import dtos.Reservation;
import dtos.Table;

//Interface about Reservation, you can find the implementation
//on the ReservationServiceImpl class.
public interface ReservationService {

	public void bookTable(List<String> dates, List<String> schedules, List<Table> tables, List<Reservation> reservations);
	public void deleteReservation(Long id, List<Reservation> reservations);
	public List<Table> getAvailableTables(List<Table> tables);
}
