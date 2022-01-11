// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	int x;
	int y;
	char i;
	int z;
	int q;
	int w;
	int j;
	int u;
	int v;
	char a;
	char r;
	
	
	
	cout<<"Welcome to Aviv's Calculator!"<<endl;
	cout<<"----------------------------"<<endl;
	cout<<endl<<"Please enter a character"<<endl;
	cin>>i;
	cout<<"Please enter a number (max 5 digits)"<<endl;
	cin>>x;
	cout<<"Please enter an operation"<<endl;
	cin>>a;
	cout<<"Please enter a number (max 5 digits)"<<endl;
	cin>>y;
	cout<<endl<<endl;

	int b = 33;

	gotoxy(65, 5);
	while (true){
		if (b == 0){
			break;
		}
		cout<<i;
		b = b - 1;
	}
	
	b = 33;
	
	gotoxy(65, 13);
	while (true){
		if (b == 0){
			break;
		}
		cout<<i;
		b = b - 1;
	}
	int c = 65;
	int s = 0;
	int o = 8;

	while (true){
		if (o == 0){
			break;
		}
		
		gotoxy(65, 6 + s);
		cout<<i;
		gotoxy(97, 6 + s);
		cout<<i;
		s = s + 1;
		o = o - 1;
	}






	
	if(a == '+')
	{
		z = x+y;
	}
	
	if(a == '-')
	{
		z = x-y;
	}
	
	if(a == '*')
	{
		z = x*y;
	}
	
	if(a == '/')
	{
		z = x/y;
	}
	
	gotoxy(68, 9);
	cout<<x<<" "<<a<<" "<<y<<" = "<<z;



// // 	w = x - 2;
// // 	j = z - 2;

	
// // 	while (true){
// // 		if(q == 0){
// // 		break;
// // 		}
// // 		cout<<y;
// // 		q = q - 1;
// // 	}
	
	
// // 	while (true){
// // 	while (true){
// // 		cout<<endl;
// // 		cout<<y;
// // 		while (j != 0){
// // 			if (w == 0){
// // 				cout<<y;
// // 				j = j - 1;
// // 				w = x - 2;
// // 				break;
			
// // 			}
			
// // 			cout<<" ";
// // 			w = w - 1;
		
		
		
// // 		}
// // 	break;
// // }

// // if (j== 0){
// // break;
// // }
// // }


// // cout<<endl;
// // q = x;

// // while (true){
// // 		if(q == 0){
// 		break;
// 		}
// 		cout<<y;
// 		q = q - 1;
// 	}

	
		
	}
		
		
		
		
		
		
	
	
	
	


