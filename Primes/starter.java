import java.util.Scanner;
import java.util.Random;

class starter {
	public static boolean checkPrime(int a){
		int x = a;

		int q;
		int j = x - 1;
		int duck = x;
		boolean prime;
	
		while (true){
			q = x%(j);
		
		//	if (x == 2){
		//		prime = true;
		//		break;
		//	}
			if ((q != 0) && (j == 2) ||(x == 2)){
				prime = true;
		
				break;
			}
			
			if (q == 0){
				prime = false;
				break;
			}
			
		j = j - 1;
		duck = duck - 1;
		}
		
		return prime;
		
		
	}
	
	
	public static void printPrimes(int a){
		int x = a;
		
		while (true){
			checkPrime(x);
			
			
			
			
			if (checkPrime(x)){
				System.out.println(x);
			}
			else{
				
			}
			if (x == 2){
				break;
			}
		
		
		x = x - 1;
		
	
		}
		
	}
	
	
	
	
	public static void main(String args[]) {
	//boolean joe = checkPrime(3);
	
	//System.out.println(joe);
	
	boolean joe = checkPrime(3);
	System.out.println(joe);
	printPrimes(11);
	
	
	
	}
	

	
	
}	
		