package composite;

import java.util.ArrayList;

public class Shape implements GeneralShape {

	private ArrayList<GeneralShape> subordinates;

	public Shape() {
		
		subordinates = new ArrayList<GeneralShape>();
	}

	public void add(GeneralShape s) {
		subordinates.add(s);
	}

	public void remove(GeneralShape s) {
		subordinates.remove(s);
	}

	public void stampa() {
		System.out.println("sono una figura composta da:");
		for(int i=0; i<subordinates.size(); i++)
			subordinates.get(i).stampa();
	}

}
