package ch03;
/*
 * switch ~ case : 분기문 : branch statement
 *  - 단순 비교문
 *  - switch(비교하려는 값) {case 값 : 같으면 수행}
 *  - (비교하려는 값)에는 byte, short, int, long, char, string만 들어감.
 */
public class Ch03Ex28 {

	public static void main(String[] args) {
		
		//switch ~ case의 문제점과 해결.
		//** switch ~ case의 문제점: break가 없다. = 멈추지 않는다.
		//브레이크가 없으면 해당하는 라인부터 그냥 쭉 출력.
		switch(1) {
		case 0: System.out.println("switch의 값과 case의 값이 다르다."); 
		case 1: System.out.println("switch의 값과 case의 값이 같다."); 
		case 2: System.out.println("switch의 값과 case의 값이 다르다.");
		}//switch
		System.out.println("===================================");
		
		//** switch ~ case의 문제점의 해결 방법: break;를 달아준다. : 해당되는 부분만 실행
		System.out.println("break 이후 : 해당되는 부분만 실행.");
		switch(1) {
		case 0: System.out.println("switch의 값과 case의 값이 다르다."); break;
		case 1: System.out.println("switch의 값과 case의 값이 같다."); break;
		case 2: System.out.println("switch의 값과 case의 값이 다르다."); break;
		}//switch
			
	}//main

}//class
