package ch03;

import java.util.Scanner;

public class Ch03Ex44 {

	public static void main(String[] args) {
		//메뉴 만들기 : 0=종료, 1=입력, 2=출력
		
		Scanner scan = new Scanner(System.in);
		int userInput = 0;
		
		while(true) {
			System.out.println("\n0=종료, 1=입력, 2=출력");
			System.out.print("메뉴 선택 : ");
			userInput = scan.nextInt();
			System.out.print("선택된 메뉴 : " + userInput);
			
			if(userInput == 0) {
				System.out.println("===== 프로그램 종료 =====");
				scan.close();
				System.exit(0); //break; 로 대체 가능
			} else if (userInput == 1) {
				System.out.println("입력");
			} else if (userInput == 2) {
				System.out.println("출력");
			} else {
				System.out.println("입력 값이 올바르지 않습니다.");
				System.out.println("다시 입력하세요.");
			}
		}//while

	}//main

}//class
