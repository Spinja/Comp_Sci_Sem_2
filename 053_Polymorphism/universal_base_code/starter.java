import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Performer[] P = new Performer[4];
		P[0] = new Performer("Bob");
		P[1] = new Musician("Cori", "Bass");
		P[2] = new Apprentice("Tak", 19, "Cello", "CatVHS", 3);
		P[3] = new Actor("Jargon", "theatre");
		
		P[0].perform();
		P[0].practice();
		P[1].perform();
		P[1].practice();
		((Apprentice)P[2]).practiceAtUniversity();
		((Apprentice)P[2]).playInstrument();
		((Actor)P[3]).monologue();
		P[3].perform();
	}
}
