package ch03;

import java.util.Random;
import java.util.Scanner;

//한 개의 정수를 입력받아
//양수인지 음수인지 
//출력하는 작업을 반복하다가 0이 입력되면 종료하는 프로그램을 작성하시오.

public class JO538 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int userInput = 0;
		
		while(true) {
			userInput = scan.nextInt();
			if(userInput == 0) break;
			else if(userInput > 0) System.out.println("positive integer");
			else if(userInput < 0) System.out.println("negative number");
		}//while
		scan.close();
	}//main
}//class
