package pkg;
import java.util.Scanner;
import java.util.Random;


public class Actor extends Performer{
	String type;

	public Actor() {
		type = "theater";
		
	}
	
	public Actor(String name, String type){
		super(name);
		this.type = type;
	}
	
	public void practice(){
		System.out.println(super.getName() + " tried to practice, but got distracted by Minecraft.");
	}
	
	public void perform(){
		System.out.println(super.getName() + "'s performance was postponed!");
	}
	
	public void monologue(){
		System.out.println("According to all known laws of aviation, there is no way a bee should be able to fly. Its wings are too small to get its fat little body off the ground. The bee, of course, flies anyway. Because bees don't care what humans think is impossible.");
	}

}

