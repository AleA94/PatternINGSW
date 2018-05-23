package decorator;

public class Table extends DecoratorRoom {
	public Table(Room newRoom){
		super(newRoom);
		
		System.out.println("Add Table");
	}
	
	public String getDescriptio(){
		return tmpRoom.getDescription() + " Table";
	}
}
