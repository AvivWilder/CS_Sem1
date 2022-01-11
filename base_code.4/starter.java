import java.util.Scanner;
import java.util.Random;

class Cake{
	String Frosting;
	int Tiers;
	String Flavor;


public Cake(String a, String b, int c){
	Frosting = b;
	Flavor = a;
	Tiers = c;
}

public void setFrosting(String b){
	Frosting = b;
}

public void setTiers(int c){
	Tiers = c;
}

public void setFlavor(String a){
	Flavor = a;
}

public String getFrosting(){
	return Frosting;
}

public String getFlavor(){
	return Flavor;
}

public int getTiers(){
	return Tiers;
}



}



class starter {
	public static void main(String args[]) {

	Cake Joe = new Cake("Chocolate", "Vanilla", 3);
	
	Joe.setFrosting("Strawberry");
	Joe.setFlavor("Lemon");
	
	System.out.println(Joe.getFlavor());
	System.out.println(Joe.getFrosting());
	System.out.println(Joe.getTiers());
	
	
	
	
	}
}	