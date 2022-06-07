package pkg;
import java.util.Scanner;
import java.util.Random;


public interface Creature {

	public boolean isDead();
	
	public boolean takeDamage(int d);
	
	public String getName();
	
	public void attack(Druid a);
	
	public String getWeapon();
	
	public int getHealth();

}

