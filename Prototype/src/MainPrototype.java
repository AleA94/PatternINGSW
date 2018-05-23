
import java.util.*;

public class MainPrototype {

	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		PrototypeCache.load();

		Prototype clonedP = (Prototype) PrototypeCache.getPrototype("T");
		System.out.println("Prototype " + clonedP.getType());
		clonedP.print(4);

		System.out.println();

		Prototype clonedP2 = (Prototype) PrototypeCache.getPrototype("G");
		System.out.println("Prototype " + clonedP2.getType());
		clonedP2.print(4);
	}

}
