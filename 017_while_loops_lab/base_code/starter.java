import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter a name");
	String name = sc.nextLine();
	System.out.println("How many times would you like the name to be repeated?");
	int rep = sc.nextInt();;
	
	while(true)
	{
		System.out.print(name + " ");
		if (rep == 1)
		{
			break;
		}
		rep = rep-1;
	
	}




	}
}
