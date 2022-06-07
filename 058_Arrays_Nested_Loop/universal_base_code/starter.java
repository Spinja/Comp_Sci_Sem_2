import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Symbol: ");
		String sym = sc.nextLine();
		System.out.print("Width: ");
		int wi = sc.nextInt();
		System.out.print("Height: ");
		int hi = sc.nextInt();
		
		for(int a = 0; a < hi; a++){
			for(int b = 0; b < wi; b++){
				System.out.print(sym);
			}
			System.out.println();
		}
	}
}
