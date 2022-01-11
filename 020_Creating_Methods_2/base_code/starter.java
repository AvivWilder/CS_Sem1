import java.util.Scanner;
import java.util.Random;

class starter {
	
	
	public static int pow(int a, int b){
		int x;
		int y;
		x = a;
		y = b;
		int q;
		q = y - 1;
		while (true)
		{
		
			if (q == 0)
			{
				break;
			}
			
			x = x*(a);
			q = q - 1;
	
		}
		return x;
	}
	
	
	public static void main(String args[]) {
	


	System.out.println(pow(2,5));

		
	}
}
