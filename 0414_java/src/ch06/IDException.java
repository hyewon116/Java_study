package ch06;

/*
 * User Defined Exception 
 * - Exception을 만드는 가장 쉽고 빠른 방법은 Exception을 상속받는 것 
 * - 나만의 Exception을 만들자 
 * - throw new Exception을 통해 프로그램을 분기할 수 있다.
 */

public class IDException extends Exception {
	
	public IDException () {
		super("ID를 확인하세요.");
	}
}
