package composite;

public class Main {

	public static void main(String[] args) {
		GeneralShape circle= new Circle();
		GeneralShape rectangle= new Rectangle();
		GeneralShape CR= new Shape();
		
		CR.add(rectangle);
		CR.add(circle);
		CR.stampa();
	}

}
