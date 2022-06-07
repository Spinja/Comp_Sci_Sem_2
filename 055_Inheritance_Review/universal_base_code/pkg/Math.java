package pkg;
import java.util.Scanner;
import java.util.Random;


public class Math extends Course {
	String difficulty;

	public Math(String teacher, int grade) {
		super(teacher, grade);
		difficulty = "Moderate";
		super.calcCredit();
	}
	
	public Math(String teacher, int grade, String difficulty){
		super(teacher, grade);
		this.difficulty = difficulty;
		super.calcCredit();
	}
	
	public String toString(){
		return ("The teacher for this course was " + teacher + ". The difficulty was " + difficulty + ". " + credit + " credit was received for this course.");
	}

}

