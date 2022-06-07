import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Musician TwoSet = new Musician("Brett", "Violin");
		Musician Mozart = new Musician("Amadeus", "Piano");

		System.out.println(TwoSet.getName());
		TwoSet.practice();
		System.out.println(TwoSet.getInstrument());
		
		System.out.println(Mozart.getName());
		Mozart.perform();
		Mozart.playInstrument();
	}
}
