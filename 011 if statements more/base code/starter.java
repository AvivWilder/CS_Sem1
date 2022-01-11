import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer");
		int a = sc.nextInt();
		System.out.println("Enter a different integer");
		int b = sc.nextInt();
		System.out.println("Enter another different integer");
		int c = sc.nextInt();
		System.out.println(" ");
		boolean joe;
		joe = a > b;
		boolean john;
		john = a > c;
		boolean jerry;
		jerry = b > a;
		boolean jeremy;
		jeremy = b > c;
		boolean jack;
		jack = c > a;
		boolean jordan;
		jordan = c > b;
		
		if(joe && john)
		{
			System.out.println(a + " is the largest number");
		}
		if (jerry && jeremy)
		{
			System.out.println(b + " is the largest number");
		}
		if (jack && jordan)
		{
			System.out.println(c + " is the largest number");
		}
		if (john && jeremy)
		{
			System.out.println(c + " is the smallest number");
		}
		if (jerry && jack)
		{
			System.out.println(a + " is the smallest number");
		}
		if (joe && jordan)
		{
			System.out.println(b + " is the smallest number");
		}
	}
}
