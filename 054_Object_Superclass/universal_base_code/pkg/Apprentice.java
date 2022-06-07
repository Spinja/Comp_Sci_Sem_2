package pkg;
import java.util.Scanner;
import java.util.Random;


public class Apprentice extends Musician{
	String school;
	int yearsOfExperience;

	public Apprentice() {
		this("Beetrice", 17, "Flute", "CVHS", 0);
	}
	
	public Apprentice(String school, int yearsOfExperience){
		this("Beetrice", 17, "Flute", school, yearsOfExperience);
	}
	
	public Apprentice(String instrument, String school, int yearsOfExperience){
		this("Beetrice", 17, instrument, school, yearsOfExperience);
	}
	
	public Apprentice(String name, int age, String instrument, String school, int yearsOfExperience){
		this.name = name;
		this.age = age;
		this.instrument = instrument;
		this.school = school;
		this.yearsOfExperience = yearsOfExperience;
	}
	
	public void playInstrument(){
		System.out.println("Beep bop dappadoooo");
	}
	
	public void practice(){
		System.out.println(name + " practiced for " + yearsOfExperience + " years!");
	}
	
	public void perform(){
		System.out.println(name + " attempted to perform (emphasis on attempted)!");
	}
	
	public void practiceAtUniversity(){
		super.practice();
		System.out.println("at " + school + "!");
	}
	
	public String toString(){
		return (name + " plays the " + instrument + ", and goes to " + school + ".");
	}

}

