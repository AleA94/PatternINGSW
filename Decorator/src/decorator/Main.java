package decorator;

public class Main {
	public static void main(String[] args) {
				
		Room room= new Table(new Chair(new RoomWithSofa()));
		
		System.out.println("Description: " + room.getDescription());
		
	}
}
