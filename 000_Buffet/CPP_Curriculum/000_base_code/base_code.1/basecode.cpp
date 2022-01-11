// base code file
#include "./hfiles/poole.h"



main(){
	srand(time(NULL));
	int x;
	x = random(1000);
	int y;
	
	cout<<"Guess a number from 1-1000. The program will tell you wheter your guess should be higher or lower."<<endl;
	
	while (true){
		cin>>y;
		
		if (y == x){
			cout<<"CORRECT!";
			break;
		}
		else if (y > x){
			cout<<"Lower";
			cout<<endl;
		}
		else if (y < x){
			cout<<"Higher";
			cout<<endl;
		}
	}
	
	
	

}
