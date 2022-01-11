import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Input an Integer");
	int x = sc.nextInt();
	System.out.println("Input another Integer");
	int y = sc.nextInt();
	System.out.println("Input a third integer");
	int z = sc.nextInt();
	
	int aa = x%2;
	int bb = y%2;
	int cc = z%2;
	int dd = x%3;
	int ee = y%3;
	int ff = z%3;
	int gg = x%4;
	int hh = y%4;
	int ii = z%4;
	int jj = x%5;
	int kk = y%5;
	int ll = z%5;
	
	
	
	boolean a = aa==0;
	boolean b = bb==0;
	boolean c = cc==0;
	boolean d = dd==0;
	boolean e = ee==0;
	boolean f = ff==0;
	boolean g = gg==0;
	boolean h = hh==0;
	boolean i = ii==0;
	boolean j = jj==0;
	boolean k = kk==0;
	boolean l = ll==0;
	
	System.out.println("\n");
	
	if (a)
	{
		System.out.println(x + " is an even number");
	}
	else
	{
		System.out.println(x + " is an odd number");
	}
	
	
	
	if (b)
	{
		System.out.println(y + " is an even number");
	}
	else
	{
		System.out.println(y + " is an odd number");
	}
	
	
	
	if (c)
	{
		System.out.println(z + " is an even number");
	}
	else
	{
		System.out.println(z + " is an odd number");
	}
	
	
	
	if (d)
	{
		System.out.println("\n" + x + " is divisible by 3");
	}
	else
	{
		System.out.println("\n" + x + " is not divisible by 3");
	}
	
	
	
	if (e)
	{
		System.out.println(y + " is divisible by 3");
	}
	else
	{
		System.out.println(y + " is not divisible by 3");
	}
	
	
	
	if (f)
	{
		System.out.println(z + " is divisible by 3");
	}
	else
	{
		System.out.println(z + " is not divisible by 3");
	}
	
	
	
		if (g)
	{
		System.out.println("\n" + x + " is divisible by 4");
	}
	else
	{
		System.out.println("\n" + x + " is not divisible by 4");
	}
	
	
	
		if (h)
	{
		System.out.println(y + " is divisible by 4");
	}
	else
	{
		System.out.println(y + " is not divisible by 4");
	}
	
	
	
		if (i)
	{
		System.out.println(z + " is divisible by 4");
	}
	else
	{
		System.out.println(z + " is not divisible by 4");
	}
	
	
	
		if (j)
	{
		System.out.println("\n" + x + " is divisible by 5");
	}
	else
	{
		System.out.println("\n" + x + " is not divisible by 5");
	}
	
	
	
	if (j)
	{
		System.out.println(y + " is divisible by 5");
	}
	else
	{
		System.out.println(y + " is not divisible by 5");
	}
	
	
	
	if (j)
	{
		System.out.println(z + " is divisible by 5");
	}
	else
	{
		System.out.println(z + " is not divisible by 5");
	}
	
	
	
	
	
	}
}
