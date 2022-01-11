import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is your name? ");
		String name = sc.nextLine();
		System.out.println("Your name is " + name);
		
		System.out.print("How old are you? ");
		int age = sc.nextInt();
		System.out.println("You are " + age + " years old");
		
		System.out.print("What month were you born in (number)? ");
		int month = sc.nextInt();
		System.out.println("Your were born in month " + month);
		
		System.out.print("What day of the month were you born on? ");
		int day = sc.nextInt();
		System.out.println("You were born on day " + day + " of your month");
		
		System.out.print("What year were you born in? ");
		int year = sc.nextInt();
		System.out.println("You were born in " + year);
		
		System.out.print("How many cents is a buck fifty? ");
		int buckfifty = sc.nextInt();
		System.out.println("A buck fifty is " + buckfifty + " cents");
	}
}
