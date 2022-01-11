// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	int x;
	int y;
	int z;
	char a;
	cout<<"Enter an Integer"<<endl;
	cin>>x;
	
	cout<<"Enter an Operation"<<endl;
	cin>>a;
	
	cout<<"Enter Another Integer"<<endl;
	cin>>y;
	
	
	if(a == '+')
	{
		z = x+y;
		cout<<z<<endl;
	}
	
	if(a == '-')
	{
		z = x-y;
		cout<<z<<endl;
	}
	
	if(a == '*')
	{
		z = x*y;
		cout<<z<<endl;
	}
	
	if(a == '/')
	{
		z = x/y;
		cout<<z<<endl;
	}
	
	
	
		
}
