// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	int x;
	int s;
	int y = 4;
	
	gotoxy(25, 4);
	x = 10;
	while (true){
		if (x == 0){
			break;
		}
		cout<<"#";
		x = x - 1;
	}

	gotoxy(25, 8);
	x = 10;
	while (true){
		if (x == 0){
			break;
		}
		cout<<"#";
		x = x - 1;
	}
	s = 1;
	x = 4;
	gotoxy(25, 4);
	while (true){
		if (y == 0){
			break;
		}
		gotoxy(25, x + s);
		cout<<"#";
		gotoxy(34, x + s);
		cout<<"#";
		y = y - 1;
		s = s + 1;
	}
	
	gotoxy(28, 6);
		char b;
		int c = 1;
		
		gotoxy(3, 3);
		cout<<"q to quit, all other characters to play."<<endl;
		while (true){
			
				//kbhit()==0;
				while (kbhit()==0){
		
			
				gotoxy(28, 6);
				cout<<c;
				//gotoxy(0, 0);
				if (c == 99){
				c = 0;
				
				}
				c = c + 1;
			
				//	b = getch();
				
				if (b == 'q'){
					cout<<"Thanks for playing!";
					
				}
				else{
				c = 1;
			
			
			
		
				}
			}
		
		}
		
}
