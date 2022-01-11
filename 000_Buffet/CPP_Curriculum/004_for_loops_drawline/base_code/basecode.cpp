// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	char x;
	int y;
	char z;
	int q = 1;
	int r = 13;
	
	cout<<"Welcome to Aviv's Line Machine!"<<endl;
	cout<<"---------------------------------"<<endl<<endl;
	cout<<"What would you like your line to be made of (any character)"<<endl;
	cin>>x;
	cout<<"How long would you like your line to be?"<<endl;
	cin>>y;
	cout<<"Would you like the line to be horizontal, vertical, or diagonal? (h, v, or d)"<<endl;
	cin>>z;
	cout<<endl<<endl;
	if (z == 'h'){
		while (true){
			cout<<x;
			y = y - 1;
		
			if (y == 0){
				break;
				}
		}
		
	}
	
	
	else if (z == 'v'){
		while (true){
			cout<<x<<endl;
			y = y - 1;
		
	
		if (y == 0){
			break;
			}
		}
	
	}	
		
	else if (z == 'd'){
		while (true){
		cout<<x<<endl;
		y =  y - 1;
			q = q + 1;
			r = r + 1;
			gotoxy(q,r);
			if (y == 0){
				break;
			}
		
		}
		
		}	
	}
	
	
	
	


