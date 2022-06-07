import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Creature[] cree = new Creature[2];
		Druid roll = new Druid("Steve");
		cree[0] = new Zombie();
		cree[1] = new Spider();
		int ded = 0;
		
		while(true){
			if(cree[0].getHealth() > 0 && roll.attack(cree[0])){
				ded ++;
			}
			System.out.println(cree[0].getName() + "'s Health: " + cree[0].getHealth());
			if(cree[1].getHealth() > 0 && roll.attack(cree[1])){
				ded ++;
			}
			System.out.println(cree[1].getName() + "'s Health:" + cree[1].getHealth());
			if(ded >= 2){
				System.out.println(roll.getName() + " defeated " + cree[0].getName() + " and " + cree[1].getName() + "!");
				break;
			}
		}
	}
}
