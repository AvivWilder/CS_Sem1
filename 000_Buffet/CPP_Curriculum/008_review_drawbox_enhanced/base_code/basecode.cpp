// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	int x;
	char y;
	int z;
	int q;
	int a;
	int b;
	int w = 0;
	
	cout<<"Welcome to Aviv's Box Maker!"<<endl;
	cout<<"----------------------------"<<endl;
	cout<<endl<<"Please enter box width:"<<endl;
	cin>>x;
	q = x;
	cout<<"Please enter one character"<<endl;
	cin>>y;
	cout<<"Please enter box height"<<endl;
	cin>>z;
	cout<<"Please enter x coordinate"<<endl;
	cin>>a;
	cout<<"Please enter y coordinate"<<endl;
	cin>>b;
	cout<<endl<<endl<<endl<<endl;
	gotoxy(a, b);
	while (true){
		cout<<y;
		q = q - 1;
		if (q == 0){
			q = x;
			w = w + 1;
			gotoxy(a, b + w);
			
			z = z - 1;
			if (z == 0){
				break;
			}
			
		}
		
		
	}
		
		
		
		
		
		
	
	
	
	

}
