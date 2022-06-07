import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList <String> pie = new ArrayList<String>();
		System.out.print("Input an integer: ");
		int rate = sc.nextInt();
		for(int a = 0; a < rate; a ++){
			pie.add(a, "Cookies");
		}
		for(int a = 0; a < rate; a ++){
			System.out.println(pie.get(a));
		}
	}
}
