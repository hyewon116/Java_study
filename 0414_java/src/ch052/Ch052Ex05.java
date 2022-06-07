package ch052;

/*
 * static의 생성 시점은??
 *  -> class load 시점(JRE가 ~.class 파일을 읽는 시점)에 static이 메모리에 생성
 * static의 생성 위치는??
 *  -> static area (stack) : 반면에 객체는 heap area에 생성
 *    -> 따라서 static과 객체의 위치는 완전 다르다.  
 *      -> static은 객체 변수 이름보다 class 이름으로 접근한다.
 *        -> 예) className.변수명, className.메소드명
 *        
 * static의 생성 방법은?? 
 *  -> static의 생성 방법은 new가 아니다.  
 *    -> JRE가 ~.class 파일을 읽는 시점에 최초 1번 static area에 생성
 *  	-> static 선언된 변수나 메소드는 영원히 1개만 존재한다.
 *		  -> static 선언된 변수나 메소드가 선언된 class를 아무리 new해도,
 *          -> static 선언된 변수나 메소드는 영원히 1개만 존재  
 *            -> 공유 데이터가 된다.
 *  
 *  ** stack overflow = stack 꽉 참 
 */

class ch052StaticTest {
	public int intVar;
	public static int staticIntVar; 
	public ch052StaticTest() {
		intVar++; 
		staticIntVar++;
	}//생성자
}//class

public class Ch052Ex05 {
		
	public static void main(String[] args) {
		
		ch052StaticTest test1 = new ch052StaticTest();
		System.out.println("test1 : intVar : " + test1.intVar);
		System.out.println("test1 : staticIntVar : " + test1.staticIntVar);
		System.out.println();
		
		ch052StaticTest test2 = new ch052StaticTest();
		System.out.println("test2 : intVar : " + test2.intVar);
		System.out.println("test2 : staticIntVar : " + test2.staticIntVar);
		System.out.println();
		
		//static variable : 최초에 1번만 만들어지고 공유되는 데이터가 된다. 
		test2.staticIntVar = 2100000;
		System.out.println("test1 : staticIntVar : " + test1.staticIntVar);
		
		
	}//main

}//class
