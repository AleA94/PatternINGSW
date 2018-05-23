package decorator;

public class RoomWithSofa implements Room {
	
	private String description = "Sofa Room";
	
	public void setDescription(String d){
		description=d;
	}
			
	public String getDescription(){
		return description;
	}
}
