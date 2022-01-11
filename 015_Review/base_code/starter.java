import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("What is your name?");
	String name = sc.nextLine();
	System.out.println("\nWhat is your title?");
	String title = sc.nextLine();
	System.out.println("\nWould you like to be a Wizard, a Warrior, or a Rogue?");
	String role = sc.nextLine();
	
	boolean wizard;
	wizard = (role.equals("Wizard")) || (role.equals("wizard"));
	boolean warrior;
	warrior = (role.equals("Warrior")) || (role.equals("warrior"));
	boolean rogue;
	rogue = (role.equals("Rogue")) || (role.equals("rogue"));
	
	if (wizard)
	{
		System.out.println("You are a wizard! You use magic spells to conquer your enemies.");
	}

	if (warrior)
	{
		System.out.println("You are a warrior! You use brute force and weapons to conquer your enemies.");	
	}

	if (rogue)
	{
		System.out.println("You are a rogue! A risky decision, my friend.");
	}	

	System.out.println("\nThe time has come. You must now pick your stats. Here are your options:");
	System.out.println("\nStrength - You are buff, and can carry large items. You attack with tremendous force.");
	System.out.println("Dexterity - You are agile and can move quickly. Your body is very flexible.");
	System.out.println("Intelligence - You are better at performing spells, and you are able to see through opponents' plans.");
	System.out.println("Constitution - You have a lot of health, making you a force to be reckoned with.");
	System.out.println("Charisma - You are a kind person, and can often charm your opponents into doing what you want.");
	System.out.println("\nYou can have up to ten points in each category. You have 25 points to spend.");
	
	System.out.println("\nStrength - (1-10)");
	int strength = sc.nextInt();
	
	
	
	boolean strengthx;
	strengthx = strength > 10;
	if (strengthx)
	{
		System.out.println("Input a smaller value");
		strength = sc.nextInt();
	}
	int left1 = (25-strength);
	System.out.println("You have " + left1 + " points remaining.");
	
	System.out.println("\nDexterity - (1-10)");
	int dexterity = sc.nextInt();
	
	
	
	boolean dexterityx;
	dexterityx = dexterity > 10;
	if (dexterityx)
	{
		System.out.println("Input a smaller value");
		dexterity = sc.nextInt();
	}
	int left2 = (left1-dexterity);
	System.out.println("You have " + left2 + " points remaining.");
	
	System.out.println("\nIntellligence - (1-10)");
	int intelligence = sc.nextInt();
	
	
	
	boolean intelligencex;
	intelligencex = intelligence > 10 || intelligence > left2;
	if (intelligencex)
	{
		System.out.println("Input a smaller value");
		intelligence = sc.nextInt();
	}
	int left3 = (left2-intelligence);
	System.out.println("You have " + left3 + " points remaining.");
	
	System.out.println("\nConstitution - (1-10)");
	int constitution = sc.nextInt();
	
	
	boolean constitutionx;
	constitutionx = constitution > 10 || constitution > left3;
	if (constitutionx)
	{
		System.out.println("Input a smaller value");
		constitution = sc.nextInt();
	}
	
	int left4 = (left3-constitution);
	System.out.println("You have " + left4 + " points remaining.");
	
	System.out.println("\nCharisma - (1-10)");
	int charisma = sc.nextInt();
	
	
	
	boolean charismax;
	charismax = charisma > 10 || charisma > left4;
	if (charismax)
	{
		System.out.println("Input a smaller value");
		charisma = sc.nextInt();
	}
	
	int left5 = (left4-charisma);
	
	boolean zeropoints;
	zeropoints = left5 < 0;
	if (zeropoints)
	{
		System.out.println("You have finished picking your stats, and have 0 points to spare.");
	}
	else
	{
		System.out.println("You have finished picking your stats, and have " + left5 + " points to spare.");
	}
	
	System.out.println("\nYou are " + name + " the " + title + ", and you are a " + role);
	
	System.out.println("\nStrength - " + strength);
	System.out.println("Dexterity - " + dexterity);
	System.out.println("Intelligence - " + intelligence);
	System.out.println("Constitution - " + constitution);
	System.out.println("Charisma - " + charisma);
	
	System.out.println("\nGood luck on your quest, " + name + "!");
	
	
	}
}
