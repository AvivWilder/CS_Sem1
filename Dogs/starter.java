import java.util.Scanner;
import java.util.Random;


class Dog{
	String Breed;
	String Name;
	int Age = 3;
	
	public Dog(){
		Breed = new String("big red dog");
		Name = new String("Clifford");
		Age = 3;
	}
	
	public Dog(String a){
		Scanner sc = new Scanner(System.in);
		Name = a;
		Breed = ("dogdog");
		Age = 1;
	}
		
	public Dog(String a, String b){
		Name = a;
		Breed = b;
		Age = 1;
	}
		
	public Dog(String a, int b){
		Name = a;
		Breed = ("dog dog");
		Age = b;
	}
	
	public void setName(String c){
		Name = c;
	}
	
	public void setAge(int d){
		d = Age;
	}
		
	public void setBreed(String e){
		Breed = e;
	}
	
	public String getName(){
		return Name;
	}
	
	public int getAge(){
		return Age;
	}
	
	public String getBreed(){
		return Breed;
	}
	
	public boolean isSleeping(){
		Random cookie = new Random();
		int x = cookie.nextInt(2);
		boolean sleeping;
		if(x == 0){
			sleeping = true;
		}
		else{
			sleeping = false;
		}
		return sleeping;
	}
	
	public void bark(){
		System.out.println(Name + " barks");
	}
	
	
	
	
	
}






class starter {
	public static void main(String args[]) {
	
	Dog one = new Dog("Apple");
	one.setAge(5);
	Dog two = new Dog("Orange", "Chihuahua");
	two.getBreed();
	boolean joe = false;
	
	if (one.isSleeping()){
		System.out.println("Apple is sleeping");
	}
	else{
		one.bark();
		joe = true;
	}
	
	if (joe){
		two.bark();
	}
	else{
		
	}
	
	
	}
}
