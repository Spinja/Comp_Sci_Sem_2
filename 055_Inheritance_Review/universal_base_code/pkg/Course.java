package pkg;
import java.util.Scanner;
import java.util.Random;


public class Course {
	String teacher;
	int grade;
	int credit;
	
	public Course(String teacher, int grade) {
		this.teacher = teacher;
		this.grade = grade;
		calcCredit();
	}
	
	public void calcCredit(){
		if(grade >= 90){
			credit = 4;
		}
		else if(grade >= 80){
			credit = 3;
		}
		else if(grade >= 70){
			credit = 2;
		}
		else if(grade >= 60){
			credit = 1;
		}
		else{
			credit = 0;
		}
	}
	
	public String getTeacher(){
		return teacher;
	}
	
	public int getGrade(){
		return grade;
	}
	
	public int getCredit(){
		return credit;
	}
	
	public void setTeacher(String teacher){
		this.teacher = teacher;
	}
	
	public void setGrade(int grade){
		this.grade = grade;
	}
	
	public void setCredit(int credit){
		this.credit = credit;
	}
	
	public String toString(){
		return ("The teacher for this course was " + teacher + ". " + credit + " credit was received for this course.");
	}
	
	public boolean equals(Object other){
		if(other instanceof Course){
			return this.getTeacher() == ((Course)other).getTeacher();
		}
		return false;
	}

}

