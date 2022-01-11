import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random cookie = new Random();
		int x = 1;
		int y;
		while (true){
			y = cookie.nextInt(99) + 1;
			System.out.println(y);
		
		if (x == 100){
			break;
		}

		x++;
		}
	}
}
