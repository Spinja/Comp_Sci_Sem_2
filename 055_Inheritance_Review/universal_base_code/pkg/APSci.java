package pkg;
import java.util.Scanner;
import java.util.Random;


public class APSci extends Science{

	public APSci(String teacher, int grade) {
		super(teacher, grade);
	}
	
	public APSci(String teacher, int grade, String field){
		super(teacher, grade, field);
	}
	
	public void calcCredit(){
		if(grade >= 90){
			credit = 5;
		}
		else if(grade >= 80){
			credit = 4;
		}
		else if(grade >= 70){
			credit = 3;
		}
		else if(grade >= 60){
			credit = 2;
		}
		else{
			credit = 1;
		}
	}

}

