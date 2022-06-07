import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Druid ja = new Druid();
		Wizard jo = new Wizard();
		Warrior ji = new Warrior();
		
		System.out.println(jo.getName());
		jo.printArt();
		System.out.println(ji.getName());
		ji.printArt();
		System.out.println(ja.getName());
		ja.printArt();

		
	}
}
