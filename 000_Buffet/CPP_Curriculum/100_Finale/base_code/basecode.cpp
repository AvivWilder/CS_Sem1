// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));

	//For the big frame
	for(int y = 0; y < 18; y++){
		for(int x = 0; x < 80; x++){
			gotoxy(1 + x, 1 + y);
			cout<<("+");
			
			
			
		}
	}
	
	for(int b = 0; b < 16; b++){
		for(int a = 0; a < 78; a++){
			gotoxy(2 + a, 2 + b);
			cout<<(" ");
			
		}
	}
	
	//For the christmas tree;
	
	gotoxy(62, 17);
	cout<<"||";
	gotoxy(62, 16);
	cout<<"||";
	
	int r = 0;
	int z = 0;
	int q = 0;
	int i = 0;
	
	for(int r = 0; r < 13; r ++){
		for(int z = 0; z < 17 - q; z++){
			gotoxy(54 + z + i, 15 - r);
			cout<<("*");
			z++;
			
		}
		gotoxy(54 + i, 15 - r);
		q = q + 2;
		z = 0;
		i++;
	
		
		
	}
	
	//For the windows
	
	for(int yy = 0; yy < 7; yy++){
		for(int xx = 0; xx < 15; xx++){
			gotoxy(8 + xx, 3 + yy);
			cout<<"+";
			
		}
	}
	
	for(int yy = 0; yy < 7; yy++){
		for(int xx = 0; xx < 15; xx++){
			gotoxy(30 + xx, 3 + yy);
			cout<<"+";
			
		}
	}
	
	for (int yyy = 0; yyy < 5; yyy++){
		for(int xxx = 0; xxx < 13; xxx++){
			gotoxy(9 + xxx, 4 + yyy);
			cout<<" ";
		}
	}
	
	for (int yyy = 0; yyy < 5; yyy++){
		for(int xxx = 0; xxx < 13; xxx++){
			gotoxy(31 + xxx, 4 + yyy);
			cout<<" ";
		}
	}
	
	
	
	for(int l = 0; l < 5; l++){
		gotoxy(15, l + 4);
		cout<<"+";
		
	}
	
	
	
	for(int l = 0; l < 5; l++){
	gotoxy(37, l + 4);
	cout<<"+";
		
	}
	
	for(int l = 0; l < 15; l++){
	gotoxy(8 + l, 6);
	cout<<"+";
		
	}
	
	for(int l = 0; l < 15; l++){
	gotoxy(30 + l, 6);
	cout<<"+";
		
	}
	
	int u;
	int o;
	int h;
	int g;
	//For the snowflakes outside;
	
	while (true){
	o = random(4);
	if (o == 4){
		u = random(6) + 8;
		h = random(6) + 15;
		g = random(6) + 30;
	}
	else if (o == 3){
		u = random(6) + 15;
		h = random(6) + 30;
		g = random(6) + 37;
	}

	else if (o == 2){
		u = random(6) + 30;
		h = random(6) + 37;
		g = random(6) + 8;
	}
	else if (o == 1){
		u = random(6) + 37;
		h = random(6) + 8;
		g = random(6) + 15;
	}
	
	
	for(int snow = 0; snow < 5; snow++){
	
		
		gotoxy(u, 4 + snow);
		cout<<"*";
		gotoxy(h, 4 + snow);
		cout<<"*";
		gotoxy(g, 4 + snow);
		cout<<"*";
		gotoxy(u, 6);
		cout<<"+";
		cout<<endl;
		gotoxy(h, 6);
		cout<<"+";
		cout<<endl;
		gotoxy(g, 6);
		cout<<"+";
		cout<<endl;
		sleep(1);
		gotoxy(u, 4 + snow);
		cout<<" ";
		gotoxy(h, 4 + snow);
		cout<<" ";
		gotoxy(g, 4 + snow);
		cout<<" ";
		gotoxy(u, 6);
		cout<<"+";
		gotoxy(h, 6);
		cout<<"+";
		gotoxy(g, 6);
		cout<<"+";
		
		
	
		
	}
	sleep(1);
	
	}
	
	
	
	

}
