// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	int x;
	char y;
	int z;
	int q;
	int w;
	int j;
	int k;
	int l;
	int m;
	int n;
	int s = 30;
	
	cout<<"Welcome to Aviv's Box Maker!"<<endl;
	cout<<"----------------------------"<<endl;
	cout<<endl<<"Please enter box width:"<<endl;
	cin>>x;
	q = x;
	cout<<"Please enter box height"<<endl;
	cin>>z;
	cout<<"Please enter one character"<<endl;
	cin>>y;
	cout<<"Please enter x coordinate"<<endl;
	cin>>k;
	cout<<"Please enter y coordinate"<<endl;
	cin>>l;
	cout<<endl<<endl;

	w = x - 2;
	j = z - 2;


	gotoxy(k + s, l + s);
	
	while (true){
		if(q == 0){
		break;
		}
		cout<<y;
		q = q - 1;
	}
	
	n = l + 1;
	
	while (true){
	while (true){
		cout<<endl;
		gotoxy(k + s,n + s);
		n = n + 1;
		cout<<y;
		while (j != 0){
			if (w == 0){
				cout<<y;
				j = j - 1;
				w = x - 2;
				break;
			
			}
			
			cout<<" ";
			w = w - 1;
		
		
		
		}
	break;
}

if (j== 0){
break;
}
}


cout<<endl;
q = x;


gotoxy(k,(j + 1) +l);
while (true){
	
		if(q == 0){
		break;
		}
		cout<<y;
		q = q - 1;
	}

	
	
	cout<<endl<<endl<<endl<<endl;


	// while (true){
	// 	cout<<x;
	// 	while (true){
	// 		if (w == 0){
	// 			cout<<endl;
	// 			break;
	// 		}
	// 		cout<<" ";
	// 		w = w - 1;
	// 	}
	// }














// /*
// 	while (true){
// 	cout<<y;
// 	q = q - 1;
// 	if (q == 1){
// 		cout<<endl;
// 		while( true){
// 			cout<<y;
// 			while (true){
// 				w = w - 1;
// 				cout<<" ";
// 				if (w == 0){
// 					cout<<y;
// 					j = j - 1;
// 					if (j == 0){
// 						cout<<y;
// 						x = x - 1;
// 						if (x == 0){
// 							break;
// 						}
// 					}
// 				}
			
// 			}
			
// 		}
// 	}
// 	}


	//	cout<<y;
	//	q = q - 1;
	//	if (q == 0){
	//		q = x;
	//		cout<<endl;
	//		z = z - 1;
	//		if (z == 0){
	//			break;
	//		}
			
	//	}
		
	
		
	}
		
		
		
		
		
		
	
	
	
	


