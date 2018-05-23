package facade;

public class Facciata {

	private static Facciata f;

	private Facciata() {
	}

	public static Facciata getInstance() {
		if (f == null)
			f = new Facciata();
		return f;
	}

	public int calcolaMedia(int[] numbers) {
		int somma = 0;

		for (int i : numbers)
			somma = new Somma().somma(somma, i);

		return new Divisione().divisione(somma, numbers.length);

	}
	
	public double calcolaMedia2(double[] numbers) {
		double somma = 0;

		for (double i: numbers)
			somma = new Somma().somma(somma, i);
		return new Divisione().divisione(somma,(double) numbers.length);

	}
	
	public float calcolaMedia3(float[] numbers) {
		float somma = 0;

		for (float i: numbers)
			somma = new Somma().somma(somma, i);

		return new Divisione().divisione(somma, (float) numbers.length);

	}
}
