package ie.itcarlow.lab2;

public class HotelRoom {
	
	private int roomNumber;
	private String roomType;
	private int occupied; // 0 = vacant, 1 = occupied
	private double rate;
	
	public HotelRoom() {
	}
	
	public HotelRoom(int roomNumber, String roomType, int occupied, double rate) {
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.occupied = occupied;
		this.rate = rate;
	}

	public int getRoomNumber() {
		return roomNumber;
	}
	
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public String getRoomType() {
		return roomType;
	}
	
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	
	public int getOccupied() {
		return occupied;
	}
	
	public boolean isOccupied() {
		if (occupied == 1) {
			return true;
		} else {
			return false;
		}
	}
	
	public void setOccupied(int newOccupied) {
		occupied = newOccupied;
	}
	
	public double getRate() {
		return rate;
	}
	
	public void setRate(double newRate) {
		rate = newRate;
	}
	


}
