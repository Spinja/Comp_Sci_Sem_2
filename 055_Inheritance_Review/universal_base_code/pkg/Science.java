package pkg;
import java.util.Scanner;
import java.util.Random;


public class Science extends Course{
	String field;

	public Science(String teacher, int grade) {
		super(teacher, grade);
		field = "Zoology";
	}
	
	public Science(String teacher, int grade, String field){
		super(teacher, grade);
		this.field = field;
	}
	
	public String toString(){
		return ("The teacher for this " + field + " course was " + teacher + ". " + credit + " credit was received for this course.");
	}

}

