import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Performer[] pro = new Performer[2];
		pro[0] = new Performer();
		pro[1] = new Performer("Beethoven", 195);
		Musician[] muse = new Musician[2];
		muse[0] = new Musician();
		muse[1] = new Musician("Piano");
		
		System.out.println(pro[0].getName());
		pro[0].practice();
		System.out.println();
		System.out.println(pro[1].getName());
		pro[1].perform();
		System.out.println();
		System.out.println(muse[0].getName());
		muse[0].perform();
		muse[0].playInstrument();
		System.out.println();
		muse[1].practice();
		System.out.println(muse[1].getInstrument());

	}
}
