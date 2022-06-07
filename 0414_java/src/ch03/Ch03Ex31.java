package ch03;

import java.util.Scanner;

public class Ch03Ex31 {

	public static void main(String[] args) {
		//계산기를 만들어보자
		//module 1. 정수, 연산 기호(+ - * /), 정수의 순서로 값을 입력 받는다.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int fNum = scan.nextInt();
		
		System.out.print("+ - * / 중의 하나를 입력하세요. : ");
		String giho = scan.next();
		
		if( ! (giho.equals("+") || giho.equals("-") 
				|| giho.equals("*") || giho.equals("/") ) ) {   
			System.out.println("입력 값이 올바르지 않습니다.");
			System.out.println("프로그램을 종료합니다.");
			scan.close();
			System.exit(0); // 프로그램 종료 표현
		}
			
		System.out.print("정수 입력 : ");
		int sNum = scan.nextInt();
		
		//module 1 test
		// System.out.printf("%d %s %d\n", fNum, giho, sNum);
		
		
		//module 2. 기호(+ - * /)에 따라 연산을 수행하여 그 결과값을 출력한다. 
		
		int res = 0; 
		
		switch(giho) {
		case "+" : res = fNum + sNum; break;
		case "-" : res = fNum - sNum; break;
		case "*" : res = fNum * sNum; break;
		case "/" : res = fNum / sNum; break;
		}
		
		System.out.printf("%d %s %d = %d", fNum, giho, sNum, res);
		
	}//main

}//class
