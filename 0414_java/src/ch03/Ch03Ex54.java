package ch03;

/*
 * do ~ while
 * - while문은 false이면 수행 안함.
 * - do ~ while문은 false여도 최초 1회 수행.
 */

public class Ch03Ex54 {

	public static void main(String[] args) {
		
		/*while(false) {
			System.out.println("실행 불가 코드");
		}*/
		
		do {
			System.out.println("최초 1회 실행 후, while의 (조건 비교) 실행");
		} while (false);

	}//main

}//class
