package pkg;
import java.util.Scanner;
import java.util.Random;


public class BatteryCharger {
	private int[] rateTable;
	
	private int getChargingCost(int startHour, int chargeTime){
		int start = startHour;
		int time = chargeTime;
		int cost = 0;
		for(int c = 0; c < chargeTime; c++){
			if(start > 23){
				start = 0;
			}
			cost += rateTable[start];
			start++;
		}
		return cost;
	}
	
	public int getChargeStartTime(int chargeTime){
		int opt = 1000000;
		int time = chargeTime;
		for(int co = 0; co < 24; co++){
			if(getChargingCost(rateTable[co], time) < opt){
				opt = co;
			}
		}
		return opt;
	}

}

