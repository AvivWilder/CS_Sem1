// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	char x;
	int y;
	char z;
	
	int a;
	int b;
	
	cout<<"Welcome to Aviv's Line Machine!"<<endl;
	cout<<"---------------------------------"<<endl<<endl;
	cout<<"What would you like your line to be made of (any character)"<<endl;
	cin>>x;
	cout<<"How long would you like your line to be?"<<endl;
	cin>>y;
	cout<<"Would you like the line to be horizontal, vertical, or diagonal? (h, v, or d)"<<endl;
	cin>>z;
	cout<<"Please enter an x coordinate"<<endl;
	cin>>a;
	cout<<"Please enter a y coordinate"<<endl;
	cin>>b;
	
	cout<<endl<<endl;
	
	int q = 1 + a;
	int r = 16 + b;
	
	
	cout<<endl<<endl;
	if (z == 'h'){
		gotoxy(a, b);
		while (true){
			gotoxy(a+q, b+r);
			cout<<x;
			y = y - 1;
		
			if (y == 0){
				break;
				}
		}
		
	}
	
	
	else if (z == 'v'){
		gotoxy(a, b);
		while (true){
			gotoxy(a+q, b+r);
			cout<<x<<endl;
			y = y - 1;
		
	
		if (y == 0){
			break;
			}
		}
	
	}	
		
	else if (z == 'd'){
		gotoxy(a, b);
		while (true){
		cout<<x<<endl;
		y =  y - 1;
			q = q + 1;
			r = r + 1;
			gotoxy(q,r);
			if (y == -1){
				break;
			}
		
		}
		
		}	
	}
	
	
	
	


