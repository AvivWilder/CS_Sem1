import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your 1st period class?");
		String per1 = sc.nextLine();
		System.out.println("What is your 2nd period class?");
		String per2 = sc.nextLine();
		System.out.println("What is your 3rd period class?");
		String per3 = sc.nextLine();
		System.out.println("What is your GPA in " + per1 + "?");
		double gpa1 = sc.nextDouble();
		System.out.println("What is your GPA in " + per2 + "?");
		double gpa2 = sc.nextDouble();
		System.out.println("What is your GPA in " + per3 + "?");
		double gpa3 = sc.nextDouble();
		double avggpa = ((gpa1+gpa2+gpa3)/3);
		System.out.println(per1 + " - " + gpa1);
		System.out.println(per2 + " - " + gpa2);
		System.out.println(per3 + " - " + gpa3);
		System.out.print("Average GPA - " + avggpa);
		
	}
}
