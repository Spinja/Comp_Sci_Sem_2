import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void rowAverage(int[][] m){
		int av;
		int average;
		int num;
		for(int a = 0; a < m.length; a++){
			av = 0;
			average = 0;
			num = 0;
			for(int b = 0; b < m[0].length; b++){
				av = av + m[a][b];
				num++;
			}
			average = av / num;
			System.out.println("Average of row " + (a + 1) + ": " + average);
		}
	}
	
	public static int average(int[][] n){
		int av = 0;
		int num = 0;
		for(int a = 0; a < n.length; a++){
			for(int b = 0; b < n[0].length; b++){
				av = av + n[a][b];
				num++;
			}
		}
		int average = av / num;
		return average;
	}
	
	public static void printAll(int[][] o){
		for(int a = 0; a < o.length; a++){
			for(int b = 0; b < o[0].length; b++){
				System.out.print(o[a][b] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Width: ");
		int wi = sc.nextInt();
		System.out.print("Height: ");
		int hi = sc.nextInt();
		
		int[][] leggo = new int[hi][wi];
		for(int a = 0; a < leggo.length; a++){
			for(int b = 0; b < leggo[0].length; b++){
				leggo[a][b] = (int)(Math.random() * 10);
			}
		}
		
		rowAverage(leggo);
		System.out.println(average(leggo));
		printAll(leggo);
	}
}
