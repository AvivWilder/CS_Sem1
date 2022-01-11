import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Random cake = new Random();
	Scanner cookie = new Scanner(System.in);
	int x;
	int y;
	int z;
	System.out.println("Test your multiplication facts! When you want to stop, type 1000 as your answer.\n");
	while (true){
		x = cake.nextInt(12) + 1;
		y = cake.nextInt(12) + 1;
		System.out.println(x + ("*" + y));
		z = cookie.nextInt();
		int a = x*y;
		if (z == a){
			System.out.println("Correct\n");
		}
		else if (z == 1000){
			System.out.println("Thanks for playing!");
			break;
		}
		else{
			System.out.println("Incorrect - The answer is " + a + "\n");
		}
	}
	
	
		





		}
	
	
	
	
	}