package facade;

public class Somma {

	@SuppressWarnings({ "unchecked" })
	public <T> T somma(T primoAddendo, T secondoAddendo) {
		if (primoAddendo.getClass() == Integer.class) {
			return (T) (Integer) ((Integer) primoAddendo + (Integer) secondoAddendo);
		}
		if (primoAddendo.getClass() == Double.class) {

			return (T) Double.valueOf(
					Double.valueOf(((Double) primoAddendo).doubleValue() + ((Double) secondoAddendo).doubleValue()));
		}

		if (primoAddendo.getClass() == Float.class) {
			return (T) Float.valueOf(((Float) primoAddendo).floatValue() + ((Float) secondoAddendo).floatValue());
		}

		return null;

	}
}
