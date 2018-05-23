import java.util.Hashtable;

public class PrototypeCache {

	private static Hashtable<String, Prototype> prototypeMap = new Hashtable<String, Prototype>();

	public static Prototype getPrototype(String prototypeId) {
		Prototype prototype = prototypeMap.get(prototypeId);
		return (Prototype) prototype.clone();
	}

	public static void load() {

		TreeOfAsterisks TOA = new TreeOfAsterisks();
		TOA.setId("T");
		prototypeMap.put(TOA.getId(), TOA);

		GiftOfAsterisks GOA = new GiftOfAsterisks();
		GOA.setId("G");
		prototypeMap.put(GOA.getId(), GOA);
	}
}
