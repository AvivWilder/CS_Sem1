import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner cake = new Scanner(System.in);
	Random rand = new Random();
	System.out.println("Welcome to Aviv's Digital Slot Machine!");
	System.out.println("In this game, you will wager some money. Each time, you can lose, win double, win triple, or get the secret jackpot. You have 100 dollars to spend");
	double x;
	double left = 100;
	int r1;
	int r2;
	int r3;
	while (true) {
		System.out.println("-------------------------------------------------------------\nWould you like to wager? (Yes, yes, Y, y)---You have $" + left);
		String yesorno = cake.nextLine();
		if ((yesorno.equals("Yes")) || (yesorno.equals("yes")) || (yesorno.equals("Y")) || (yesorno.equals("y")))
		{
			System.out.println("Enter a wager");
			x = cake.nextDouble();
			cake.nextLine();
			r1 = rand.nextInt(10) + 1;
			r2 = rand.nextInt(10) + 1;
			r3 = rand.nextInt(10) + 1;
				while (true){
				if (x > left){
					System.out.println("That is more money than you have! Try again");
					x = cake.nextDouble();
					cake.nextLine();
					left = left;
				}
				if (x < 0 || x == 0){
					System.out.println("That is an illegal wager! Try again");
					x = cake.nextInt();
					cake.nextLine();
				}
				else
				{
					break;
				}
				}
				left = left-x;
				
				if (r1 == 7 && r2 == 7 && r3 == 7){
					System.out.println("LUCKY 7 BONUS! 10 times your wager!");
					left = left+10*x;
				}
				
				else if (r1 == r2 && r2 == r3)
				{
					System.out.println("JACKPOT! Your wager has been tripled\nThe numbers were| " + r1 + " | " + r2 + " | " + r3 + " |");
					
					left = left+3*x;
				}
				else if (r1 == r2 || r2 == r3 || r1 == r3)
				{
					System.out.println("Nice! Your wager has been doubled\nThe numbers were|" + r1 + "|" + r2 + "|" + r3 + "|");
				
					left = left+2*x;
				}
				else
				{
					System.out.println("Sorry, you didn't win. Better luck next time!\nThe numbers were|" + r1 + "|" + r2 + "|" + r3 + "|");
					if (left == 0){
						System.out.println("\n-------------------------------------------------------------\nYou have run out of money. Come back soon!");
						break;
				}
				}
		}
		
		
		
		else if ((yesorno.equals("No")) || (yesorno.equals("no")) || (yesorno.equals("N")) || (yesorno.equals("n"))){
			System.out.println("Aww, we'll miss you. Come back soon! You still have $ " + left + " left.");
			break;
		}
		else{
			System.out.println("I don't understand that! (Type anything to continue)");
			yesorno = cake.nextLine();
		}
		}
		if (left < 0 || left == 0){
			
		}
		
		
		
		
	}
	
	
	
	
	
	}
	