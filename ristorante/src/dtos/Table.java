package dtos;

//DTO about the class "Table"
public class Table {
	
	private Long id;
	private int numberOfSeats;
	private boolean isFree;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	public boolean isFree() {
		return isFree;
	}
	public void setFree(boolean isFree) {
		this.isFree = isFree;
	}
	
	@Override
	public String toString() {
		return "Table [id=" + id + ", numberOfSeats=" + numberOfSeats + ", isFree=" + isFree + "]";
	}
	
	
}
