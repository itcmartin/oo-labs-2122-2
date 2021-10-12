package ie.itcarlow.lab2;

public class Driver {

	public static void main(String[] args) {

		System.out.println("Welcome to Hotel System");
		
		HotelRoom roomA = new HotelRoom();
		roomA.setRoomNumber(201);
		roomA.setRoomType("Single");
		roomA.setOccupied(1);
		roomA.setRate(100);
		
		HotelRoom roomB = new HotelRoom();
		roomB.setRoomNumber(202);
		roomB.setRoomType("Double");
		roomB.setOccupied(0);
		roomB.setRate(80);
		
		if (roomB.isOccupied() == false) {
			System.out.println("Booking for the first time!");
			roomB.setOccupied(1);
		}
		
		if (roomB.isOccupied() == false) {
			System.out.println("Trying to double-book!");
			roomB.setOccupied(1);
		}
		
		HotelRoom roomC = new HotelRoom(202, "Single", 0, 90);
		
		System.out.println("Information about the rooms:");
		System.out.println("Room A:");
		System.out.println("Room Number: " + roomA.getRoomNumber());
		System.out.println("Room Type: " + roomA.getRoomType());
		System.out.println("Occupied (0=vacant,1=occupied): " + roomA.getOccupied());
		System.out.println("Rate: " + roomA.getRate());
		
		System.out.println("Room B:");
		System.out.println("Room Number: " + roomB.getRoomNumber());
		System.out.println("Room Type: " + roomB.getRoomType());
		System.out.println("Occupied (0=vacant,1=occupied): " + roomB.getOccupied());
		System.out.println("Rate: " + roomB.getRate());

	}

}
