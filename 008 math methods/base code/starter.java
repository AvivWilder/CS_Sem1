import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		double num1;
		num1 = Math.max(13-6*11, 30%7*(-2));
		System.out.println("Maximum - "+ num1);
		
		double num2;
		num2 = Math.sqrt(3*8+31%7);
		System.out.println("Square root - " + num2);
		
		double num3;
		num3 = Math.pow(37.0/3, 35%21);
		System.out.println("Power - " + num3);
		
		double num4;
		num4 = Math.max(Math.pow(2, 14%3), Math.sqrt(2*6));
		System.out.println("Maximum - " + num4);

	Scanner sc = new Scanner(System.in);
		
		System.out.println("EXTRA");
		
		System.out.print("Please enter a value ");
		double x = sc.nextDouble();
		
		System.out.print("Please enter a value ");
		double y = sc.nextDouble();
		
		System.out.println(Math.max(x, y));
		System.out.println(Math.sqrt(y));
		System.out.println(Math.pow(x, y));
	}
}
