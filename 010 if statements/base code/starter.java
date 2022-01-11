import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Integer");
		int a = sc.nextInt();
		System.out.println("Enter an Integer");
		int b = sc.nextInt();
		boolean x = a != b;
		if(x)
		{
			System.out.println("The values are different! HAHAHAHAHA!");
		}
		boolean y = a == b;
		if(y)
		{
			System.out.println("YAY! The values are equal!");
		}
	}
}
