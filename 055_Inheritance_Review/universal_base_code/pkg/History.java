package pkg;
import java.util.Scanner;
import java.util.Random;


public class History extends Course{
	int era;

	public History(String teacher, int grade) {
		super(teacher, grade);
		era = 2000;
	}
	
	public History(String teacher, int grade, int era){
		super(teacher, grade);
		this.era = era;
	}
	
	public String toString(){
		return ("The teacher for this course was " + teacher + ". It was taken in the era " + era + ". " + credit + " credit was received for this course.");
	}

}

