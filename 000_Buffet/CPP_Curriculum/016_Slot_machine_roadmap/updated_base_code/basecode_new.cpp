// base code file
#include "./hfiles/poole.h"



main(){
	srand(time(NULL));

	int one;
	int two;
	int three;
	char play;
	int wager;
	int left;
	int spend;


	gotoxy(1,3);
	cout<<"How much money do you have to spend? ($1-1,000)";
	cin>>spend;
	gotoxy(1, 3);
	cout<<"                                                  ";
	left = spend;

	framedbox(26,7,7,35,'*');
	framedbox(28,8,5,9,'*');
	framedbox(39,8,5,9,'*');
	framedbox(50,8,5,9,'*');
	framedbox(39,3,3,22,'*');
	gotoxy(32, 7);
	

	gotoxy(1, 3);
	
	
	while (true){
		
		
		gotoxy(1,3);
		cout<<"Would you like to spin?";
		cin>>play;
		gotoxy(1,3);
		cout<<"                                    ";
		gotoxy(1, 3);
		if (play == 'q'){
			break;
		}
		else{
		cout<<"What is your wager?";
			while (true){
			cin>>wager;
			if ((wager > -1) && (wager < left)){
				break;
			}
			else{
				
			}
			}
		gotoxy(1, 3);
		cout<<"                    ";
		gotoxy(1, 3);
		cout<<"Hit any key to spin";
		gotoxy(1, 3);
		cout<<"                    ";
		gotoxy(1, 3);
	
		one = random(10) - 1;
		two = random(10) - 1;
		three = random(10) - 1;
		
		gotoxy(32, 10);
		cout<<one;
		gotoxy(43, 10);
		cout<<two;
		gotoxy(54, 10);
		cout<<three;
		
		if ((one == two) && (two == three)){
			gotoxy(1, 3);
			cout<<"JACKPOT! 3x your wager!";
			sleep (2);
			gotoxy(1,3);
			cout<<"                        ";
			gotoxy(1, 3);
		}
		else if ((one == two) || (two == three) || (three == one)){
			gotoxy(1, 3);
			cout<<"Winner! 2x your wager!";
			sleep(2);
			gotoxy(1, 3);
			cout<<"                       ";
			gotoxy(1, 3);
		}
		else{
			gotoxy(1, 3);
			cout<<"Better luck next time!";
			sleep(2);
			gotoxy(1, 3);
			cout<<"                        ";
			gotoxy(1, 3);
		}
		}
	}

	
	
	
	
}
