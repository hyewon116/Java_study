package ch03;

import java.util.Scanner;

public class Ch03Ex32 {

	public static void main(String[] args) {
		//Ch03Ex31의 정수 계산기의 switch문을 if문을 사용하여 만들어보자.
		// 계산기의 작동 순서 : 정수 입력, 기호 입력, 정수 입력, 결과 변수.
		// 1. 입력

		int fNum, sNum, res = 0;
		String giho;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		fNum = scan.nextInt();
		
		System.out.print("+ - * / 중의 하나를 입력 : ");
		giho = scan.next();
		
		System.out.print("정수 입력 : ");
		sNum = scan.nextInt();
		
		scan.close();
		
		//test module 1 
		//System.out.printf("%d %s %d\n", fNum, giho, sNum);
		
		
		// 2. 계산 - if문을 사용해서
		
		// ** giho = "+" ===> 틀린 문법. why? 주소(번지)값이 다르기 때문. (new String 예제 참고!!)
		//     - == .equals 사용해야 함. 
		
		if(giho.equals("+")) { 
			res = fNum + sNum;
			//System.out.println(fNum + sNum); //== > 이렇게 써도 됨.
		} else if(giho.equals("-")) { 
			res = fNum - sNum;			
		} else if(giho.equals("*")) {
			res = fNum * sNum;	
		} else if(giho.equals("/")) {
			res = fNum / sNum;
		} else {
			System.out.println("입력된 값이 올바르지 않습니다.");
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		}
		
		System.out.printf("%d %s %d = %d", fNum, giho, sNum, res);
		
		
	}//main

}//class
