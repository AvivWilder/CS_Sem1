// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	
	char x;
	cout<<"Enter a snowflake (*)"<<endl;
	cin>>x;
	int y = 0;
	
	
	gotoxy(24, 14);
	cout<<"|  | |  |";
	gotoxy(24, 13);
	cout<<"|  | |  |";
	gotoxy(24, 12);
	cout<<"|   _   |";
	gotoxy(24, 11);
	cout<<" /_____\\|";
	gotoxy(24, 10);
	cout<<"  /   \\ |";
	gotoxy(24, 9);
	cout<<"   / \\__";
	gotoxy(24, 8);
	cout<<"       $";
	gotoxy(24, 7);
	cout<<"       $";
	gotoxy(24, 6);
	cout<<"       $";
	
	
	
	
	
	
	gotoxy(0, 15);
	cout<<"____________________________________________________________________________________________________________________________"<<endl;
	
	while (true){
		gotoxy(4, y + 4);
		cout<<x<<endl;
		sleep(1);
		gotoxy(4, y + 4);
		cout<<" "<<endl;

		cout<<" "<<endl;
		if (y == 10){
			break;
		}
		y = y + 1;
	
	
	
	}
	
	
}
