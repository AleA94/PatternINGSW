package decorator;

public abstract class DecoratorRoom implements Room {
	protected Room tmpRoom;
	
	public DecoratorRoom(Room newRoom){
		tmpRoom= newRoom;
	}
	
	public String getDescription(){
		return tmpRoom.getDescription();
	}
}
