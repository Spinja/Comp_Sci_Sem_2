import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

class starter {
	public static void toStringArrayList(ArrayList<Integer> a){
		for(int g = 0; g < a.size(); g++){
			System.out.println(a.get(g));
		}
	}
	
	public static int getArrayListAverage(ArrayList<Integer> b){
		int sum = 0;
		for(int f = 0; f < b.size(); f++){
			sum = sum + b.get(f);
		}
		return (sum / b.size());
	}
	
	public static int getArrayListMax(ArrayList<Integer> c){
		int max = 0;
		for(int e = 0; e < c.size(); e++){
			if(c.get(e) > max){
				max = c.get(e);
			}
		}
		return max;
	}
	
	public static int getArrayListMin(ArrayList<Integer> d){
		int min = 1000;
		for(int e = 0; e < d.size(); e++){
			if(d.get(e) < min){
				min = d.get(e);
			}
		}
		return min;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> pog = new ArrayList<Integer>();
		System.out.print("How many values: ");
		int champ = sc.nextInt();
		
		for(int d = 0; d < champ; d++){
			pog.add(d, (int)(Math.random() * 100)+1);
		}
		
		toStringArrayList(pog);
		System.out.println("Average: " + getArrayListAverage(pog));
		System.out.println("Max: " + getArrayListMax(pog));
		System.out.println("Min: " + getArrayListMin(pog));
	}
}
