import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Guess a number from 1 to 1,000");
		int num1 = sc.nextInt();
		int rand_number1 = rand.nextInt(1000) + 1;
		boolean correct;
		boolean larger;
		larger = num1 > rand_number1;
		boolean smaller;
		smaller = num1 < rand_number1;
		correct = num1 == rand_number1;
		if (correct)
		{
			System.out.print("CORRECT!");
		}
		else if (larger)
		{
			System.out.print("Your guess was larger than the number");
		}
		else
		{
			System.out.print("Your guess was smaller than the number");
		}
	}
}
