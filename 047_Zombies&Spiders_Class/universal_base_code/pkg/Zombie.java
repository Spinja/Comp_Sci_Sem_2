package pkg;
import java.util.Scanner;
import java.util.Random;


public class Zombie implements Creature {
	Random rand = new Random();
	String name = new String("");
	int health;
	int attack;
	String weapon;

	public Zombie() {
		name = "Zack";
		health = rand.nextInt(6) + 5;
		attack = rand.nextInt(6) + 5;
		weapon = "Wooden Sword";
	}
	
	public Zombie(String name, int health, int attack, String weapon){
		this.name = name;
		this.health = health;
		this.attack = attack;
		this.weapon = weapon;
	}
	
	public boolean isDead(){
		if(health <= 0){
			return true;
		}
		return false;
	}
	
	public boolean takeDamage(int d){
		health = health - d;
		if(isDead()){
			return true;
		}
		return false;
	}
	
	public String getName(){
		return name;
	}
	
	public void attack(Druid a){
		a.health = a.health - attack;
	}
	
	public String getWeapon(){
		return weapon;
	}
	
	public int getHealth(){
		return health;
	}

}

