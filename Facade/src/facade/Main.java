package facade;

public class Main {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5 };
		double[] numbers2 = { 2.556, 2.3889, 2.445 };

		Facciata f = Facciata.getInstance();
		System.out.println("Media " + f.calcolaMedia(numbers));

		System.out.println("Media " + f.calcolaMedia2(numbers2));

	
	}
}
