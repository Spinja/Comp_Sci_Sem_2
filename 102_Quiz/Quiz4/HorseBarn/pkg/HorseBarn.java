package pkg;
import java.util.Scanner;
import java.util.Random;


public class HorseBarn{
	private Horse[] spaces;
	
	public int findHorseSpace(String name){
		for(int co = 0; co < spaces.length; co ++){
			if(spaces[co].equals(name)){
				return co;
			}
		}
		return -1;
	}
	
	public void consolidate(){
		for(int c = 1; c < spaces.length; c ++){
			if(spaces[c - 1].equals(null)){
				spaces[c - 1] = spaces[c];
				spaces[c] = null;
			}
		}
	}

}
