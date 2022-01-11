import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	System.out.println("What month is your birthday in (number)?");
	int month = sc.nextInt();
	System.out.println("What day is your birthay (number)?");
	int day = sc.nextInt();
	System.out.println("How many letters are in your name?");
	int name = sc.nextInt();

	double x;
	
	int num1 = rand.nextInt(1000) + 1;
	int num2 = rand.nextInt(1000) + 1;
	int num3 = rand.nextInt(1000) + 1;
	
	if (num1 > num2 && num2 > num3){
		x = month*day/name;
	}
	
	else if (num2 > num1 && num1 > num3){
		x = day*name/month*rand.nextInt(10)/rand.nextInt(10);
	}
	
	else if (num3 > num2 && num2 > num1){
		x = name*month/day;
	}
	else{
		x = name+month/(day+month/name);
	}
	System.out.println(num1 + " " + num2 + " " + " " + num3);
	System.out.println("Your lucky number is " + x);
		
	}
}
