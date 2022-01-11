import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to be a wizard, a warrior, or a rogue? (answer all lowercase)");
		String role = sc.nextLine();
		boolean apple;
		apple = (role.equals("wizard"));
		
		boolean orange;
		orange = (role.equals("warrior"));
		
		boolean banana;
		banana = (role.equals("rogue"));
		
		if (apple)
		{
			System.out.println("Magic time!");
		}
		if (orange)
		{
			System.out.print("We have a fighter!");
		}
		if (banana)
		{
			System.out.print("How dare you!");
		}
	}
}
