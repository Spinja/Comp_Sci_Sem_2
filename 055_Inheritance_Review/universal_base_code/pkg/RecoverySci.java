package pkg;
import java.util.Scanner;
import java.util.Random;


public class RecoverySci extends Science{
	
	public RecoverySci(String teacher, int grade) {
		super(teacher, grade);
	}
	
	public RecoverySci(String teacher, int grade, String field){
		super(teacher, grade, field);
	}
	
	public void calcCredit(){
		if(super.getGrade() > 60){
			super.setCredit(4);
		}
		else{
			super.setCredit(0);
		}
	}

}

