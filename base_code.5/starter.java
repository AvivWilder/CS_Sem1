import java.util.Scanner;
import java.util.Random;


class Car{
	String brand = new String("toyota");
}
class starter {
	public static int fact(int a){
	
		int numm = a;
		int nummm = a;
		while (true){
			numm = numm - 1;
			nummm = nummm*numm;
			if (numm == 1){
				break;
			}
		}
		return nummm;
	}
	

		
	
	public static void main(String args[]) {
	System.out.println("");
	
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	
	int q = fact(12);
	System.out.println(q);
	
	Car myCar = new Car();
	System.out.println(myCar.brand);
	}
}	