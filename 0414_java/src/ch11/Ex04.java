package ch11;
// finally : 예외처리와 상관없이 반드시 실행해야 되는 문장을 처리할 때 사용 
//           (DB, I/O, 네트워크에서 주로 사용)
// try {
//      예외 발생 가능한 문장들;
// } catch (예외객체 e) {
//      예외 발생시 처리할 문장들; 
// } catch (예외객체 e) {
//      예외 발생시 처리할 문장들; 
// } finally {
//      예외처리와 상관없이 무조건 실행해야 하는 문장들;
// } 

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		int k = 100;
		Scanner sc = new Scanner(System.in);
		try {
			int var = 50;
			System.out.print("정수 입력 : ");
			int su = sc.nextInt(); 
			System.out.println("정답 : " + (var/su));
			k = k + 10; 
			return; // 다음 것을 수행하지 않고 메소드로 돌아감. but!!! finally는 하고 돌아감!! 
		} catch (ArithmeticException e) {
			System.out.println("0으로는 나눌 수가 없습니다.");
			k = k + 100; 
			return;
		} catch (Exception e) { 
			System.out.println("정수를 입력해주세요."); 
			k = k + 1000;
			return;
		} finally { //return이 있어도 여기는 꼭 실행
			System.out.println("반드시 실행해야 될 문장");
		}
//		System.out.println("k = " + k);
//		System.out.println("수고하셨습니다.");
	}
	
}
