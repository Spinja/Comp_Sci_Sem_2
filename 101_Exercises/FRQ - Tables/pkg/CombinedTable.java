package pkg;
import java.util.Scanner;
import java.util.Random;


public class CombinedTable {
	int seats;
	double desir;

	public CombinedTable(SingleTable tab, SingleTable le) {
		SingleTable a = tab;
		SingleTable b = le;
		seats = (a.getNumSeats() + b.getNumSeats()) - 2;
		if(a.getHeight() == b.getHeight()){
			desir = (a.getViewQuality() + b.getViewQuality()) / 2;
		}
		else{
			desir = (a.getViewQuality() + b.getViewQuality()) / 2;
			desir = desir - 10;
		}
	}
	
	public boolean canSeat(int a){
		int num = a;
		if(seats >= num){
			return true;
		}
		else{
			return false;
		}
	}
	
	public double getDesirability(){
		return desir;
	}

}

