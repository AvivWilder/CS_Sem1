import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Random cake = new Random();
	Scanner cookie = new Scanner(System.in);
	int y = cake.nextInt(1000) + 1;
	System.out.println("You will try to guess a number from 1-1000. The program will tell you if the actual number is higher or lower than your guess.");
	int x;
	while (true){
		x = cookie.nextInt();
		if (x == y){
			System.out.println("You got the number! " + x);
			break;
		}
		else if (x > y){
			System.out.println("Lower");
		}
		else{
			System.out.println("Higher");
		}
	}
	
	
		





		}
	
	
	
	
	}