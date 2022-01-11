import java.util.Scanner;
import java.util.Random;





class starter {
	
	public static void drawbox(String a, int b, int c){
		
		
		for(int y = 0; y < c; y++){
			for(int x = 0; x < b; x++){
				System.out.print(a);
			}
			System.out.println("");
		}
		
		
		
	}
	
	public static void main(String args[]) {
	
		drawbox(">>>>>> ", 100, 40);
		
		
		


	
	}
}
