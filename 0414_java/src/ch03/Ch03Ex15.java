package ch03;

import java.util.Scanner;

public class Ch03Ex15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 1= 가위 2= 바위 3=보
		System.out.print("정수 1/2/3 입력 : ");
		int yourChoice = scan.nextInt();
		System.out.println("Your Choice : "+yourChoice);
		
		int comChoice = (int) (Math.random()*3+1);
		System.out.println("ComputerChoice : "+comChoice);
		
		if ( (yourChoice == 1 && comChoice == 2) 
				|| (yourChoice == 2 && comChoice == 3)
				|| (yourChoice == 3 && comChoice == 1)	) {
		  	System.out.println("패배");
		}//if
		
		if ( (yourChoice == 1 && comChoice == 3) 
				|| (yourChoice == 2 && comChoice == 1)
				|| (yourChoice == 3 && comChoice == 2)	) {
		  	System.out.println("승리");
		}//if
		if (yourChoice == comChoice) {
		  	System.out.println("비김");
		}//if
	
		scan.close();

	}

}
