import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Apprentice[] bts = new Apprentice[4];
		bts[0] = new Apprentice();
		bts[1] = new Apprentice("Hoover", 5);
		bts[2] = new Apprentice("Viola", "Clark", 1);
		bts[3] = new Apprentice("Jacques", 14, "Oboe", "East", 1293);
		
		bts[0].playInstrument();
		bts[1].practice();
		bts[2].perform();
		bts[3].practiceAtUniversity();
	}
}
