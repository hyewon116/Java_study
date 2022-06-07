package ch11;

import java.util.InputMismatchException;
import java.util.Scanner;

// 다중 catch문 : try문의 예외 발생이 여러 종류의 예외가 발생할 경우
// 주의사항 ! : catch문에 Exception 사용할 때는 반드시 맨 아래쪽 catch문에서 사용해야 된다.

public class Ex03 {
	public static void main(String[] args) {
		int k = 100;
		Scanner sc = new Scanner(System.in);
		try {
			int var = 50;
			System.out.print("정수 입력 : ");
			int su = sc.nextInt(); 
			//키보드로 입력받은 정보가 숫자로 변환(nextInt)되서 sc에 저장되고, su라는 변수에도 저장.
			System.out.println("정답 : " + (var/su));
			k = k + 10; // k는 main문 안에 있으므로 계속 사용 o 
//		} catch (InputMismatchException e) { //*변수 e는 이 중괄호 안에서만 유효
//			System.out.println("정수를 입력해 주세요.");
//		//	su = su + 10; // su변수는 여기서 못씀. 위 블록 끝난 후 없어짐. 
//			k = k + 100;
//		} catch (ArithmeticException e) { //*여기서도 변수 e 사용 가능
//			System.out.println("0으로는 나눌 수가 없습니다.");
//			k = k + 1000;
		} catch (Exception e) { //Exception은 꼭 catch문의 맨 아래에!!!
			System.out.println("정상적인 입력을 해주세요 : " + e); // e 출력 = 무슨 오류인지 확인
			k = k + 1000;
		}
		
		System.out.println("k = " + k);
		System.out.println("수고하셨습니다.");
		
	}//main
}//class
