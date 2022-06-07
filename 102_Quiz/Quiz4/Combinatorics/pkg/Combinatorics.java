package pkg;
import java.util.Scanner;
import java.util.Random;


public class Combinatorics {
	public static int factorial(int n) {
		if(n == 1){
			return 1;
		}
		else{
			for(int i = n; i > 0; i --){
				int fac = n * (n - 1);
			}
			return fac;
		}
		
	}
	
	public static void numCombinations(int n, int r){
		if(r > n){
			System.out.println("There are 0 ways of choosing " + r + " items from " + n + " choices.");
		}
		else{
			int nfac = factorial(n);
			int rfac = factorial(r);
			int nrfac = factorial(n - r);
			int comb = nfac / (rfac * nrfac);
			System.out.println("There are " + comb + " ways of choosing " + r + " items from " + n " choices.");
		}
	}

}
