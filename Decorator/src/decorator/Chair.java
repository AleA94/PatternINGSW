package decorator;

public class Chair extends DecoratorRoom {
	public Chair(Room newRoom){
		super(newRoom);
		
		System.out.println("Add Chair");
	}
	
	public String getDescriptio(){
		return tmpRoom.getDescription() + " Chair";
	}

}
