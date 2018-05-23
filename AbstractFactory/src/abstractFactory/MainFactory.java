package abstractFactory;

import java.util.*;

public class MainFactory {

	public static Scanner input = new Scanner(System.in);


	public static void main(String[] args) {
		System.out.println("What tree/gift you want to print? *,?,o");
		String string = input.next();
		System.out.println("Inserisci l'altezza");
		int h = input.nextInt();
		Factory factory=null;
		Tree tree=null;
		Gift gift=null;
		switch (string) {
		case "*":
			factory=new FactoryOfAsterisks();
			break;
		case "?":
			factory=new FactoryofQuestionMarks();
			break;
		case "o":
			factory=new FactoryOfCircles();
			break;
		}
		tree=factory.makeTree();
		gift=factory.makeGift();
		tree.print(h);
		System.out.println();
		gift.print(h);
	}

}
