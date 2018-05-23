package facade;

public class Divisione {

	@SuppressWarnings({ "unchecked"})
	public <T> T divisione(T dividendo, T divisore) {
		if (dividendo.getClass() == Integer.class) {
			if((Integer)divisore !=0)
				return (T) (Integer) ((Integer) dividendo / (Integer) divisore);
		}
		if (dividendo.getClass() == Double.class) {
			if((Double)divisore !=0)
				return (T) Double.valueOf(((Double) dividendo).doubleValue()
						/ ((Double) divisore).doubleValue());
		}

		if (dividendo.getClass() == Float.class) {
			if((Float) divisore !=0)
				return (T) Float.valueOf(((Float) dividendo).floatValue()
						/ ((Float) divisore).floatValue());
		}

		return null;

	}
}