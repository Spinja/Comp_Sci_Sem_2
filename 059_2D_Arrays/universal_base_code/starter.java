import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int[][] eggo = new int[3][3];
		eggo[0][0] = 1;
		eggo[1][0] = 2;
		eggo[2][0] = 3;
		eggo[0][1] = 4;
		eggo[1][1] = 5;
		eggo[2][1] = 6;
		eggo[0][2] = 7;
		eggo[1][2] = 8;
		eggo[2][2] = 9;
		
		int av = 0;
		int num = 0;
		for(int a = 0; a < eggo.length; a++){
			for(int b = 0; b < eggo[0].length; b++){
				av = av + eggo[a][b];
				num++;
			}
		}
		
		System.out.println(av / num);
	}
}
