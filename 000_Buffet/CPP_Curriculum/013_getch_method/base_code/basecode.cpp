// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	int x;
	int y;
	int z;
	int a;
	char b;
	char c;
	b = '#';
	
	cout<<"Press any key and hit enter to generate a number from 1 - 1000!"<<endl;
	cout<<"Press q to quit."<<endl;
	
	
	x = 10;
	
	gotoxy(25, 4);
	
	while (true){
		if (x == 0){
			break;
		}
		cout<<b;
		x = x - 1;
	}
	gotoxy(25, 8);
	x = 10;
		
	while (true){
		if (x == 0){
			break;
		}
		cout<<b;
		x = x - 1;
	}
	
	y = 4;
	a = 4;
	gotoxy(25, 4);
	
	while (true){
		if (y == 0){
			break;
		}
		gotoxy(25, a + 1);
		cout<<b;
		gotoxy(34, a + 1);
		cout<<b;
		y = y - 1;
		a = a + 1;
	}
	
	gotoxy(1, 4);
	
	while (true){
		gotoxy(1, 4);
		c = getch();
		if (c == 'q'){
			break;
		}
		else{
			gotoxy(28,6);
			cout<<random(100) + 1;
	}
	
	}
	
	
	cout<<endl<<endl<<endl;
}
