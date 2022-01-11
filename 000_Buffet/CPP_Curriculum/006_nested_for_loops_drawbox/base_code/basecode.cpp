// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	int x;
	char y;
	int z;
	int q;
	
	cout<<"Welcome to Aviv's Box Maker!"<<endl;
	cout<<"----------------------------"<<endl;
	cout<<endl<<"Please enter box width:"<<endl;
	cin>>x;
	q = x;
	cout<<"Please enter one character"<<endl;
	cin>>y;
	cout<<"Please enter box height"<<endl;
	cin>>z;
	cout<<endl<<endl;
	while (true){
		cout<<y;
		q = q - 1;
		if (q == 0){
			q = x;
			cout<<endl;
			z = z - 1;
			if (z == 0){
				break;
			}
			
		}
		
		
	}
		
		
		
		
		
		
	
	
	
	

}
