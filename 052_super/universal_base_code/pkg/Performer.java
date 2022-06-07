package pkg;
import java.util.Scanner;
import java.util.Random;


public class Performer {
	String name;
	int age;

	public Performer() {
		name = "Doja Cat";
		age = 26;
	}
	
	public Performer(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public Performer(String name){
		this.name = name;
		age = 26;
	}
	
	public String getName(){
		return name;
	}
	
	public void practice(){
		System.out.print(name + " is practicing");
	}
	
	public void perform(){
		System.out.print(name + " is performing");
	}

}

