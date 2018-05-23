package adapter;

import java.util.Scanner;

public class Main {

	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		Open o = new Open();
		System.out.println("inserisci il tipo di documento da aprire");
		String string = input.next();

		switch (string) {
		case ("txt"):
			o.open("txt", "Adapter");
			break;
		case ("word"):
			o.open("word", "Adapter");
			break;
		case ("pdf"):
			o.open("pdf", "Adapter");
			break;
		}
	}

}
