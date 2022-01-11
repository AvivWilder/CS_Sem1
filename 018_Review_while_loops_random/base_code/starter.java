import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	int x = rand.nextInt(1000) + 1;
	int guess;
	System.out.println("After this, you will guess a number from 1 to 1,000. You will keep guessing until you win.");
	while(true)
	{
		System.out.println("Guess a number from 1 to 1,000");
		guess = sc.nextInt();
		if (x == guess)
		{
			break;
		}
		
		
	}
		
	System.out.print("Congratulations, you won!");
		
		
		
	}
}
