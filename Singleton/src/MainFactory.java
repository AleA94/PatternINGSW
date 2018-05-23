

import java.util.*;

public class MainFactory {

	public static Scanner input = new Scanner(System.in);


	public static void main(String[] args) {
		
		int i=0;
		while(i==0)
		{
		System.out.println("What tree/gift you want to print? *,?,o");
		String string = input.next();
		System.out.println("Inserisci l'altezza");
		int h = input.nextInt();
		
		SingletonFactory.init(string);
		SingletonFactory singleton = SingletonFactory.getInstance();
		singleton.makeTree().print(h);
		System.out.println();
		singleton.makeGift().print(h);
		
			i=input.nextInt();
		}
		
	}

}
