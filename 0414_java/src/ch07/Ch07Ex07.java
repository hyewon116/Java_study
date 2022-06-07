package ch07;

/*
 * Object를 상속받아 나만의 toString()과 equals()을 만들어 보자. 
 * - 모든 class의 최상위 class : Object
 * - toString(), equals() = object의 기본 메소드
 */

class Ch07Myclass {
	String compareStand; //비교 기준
	Ch07Myclass() {}
	Ch07Myclass(String str) {
		this.compareStand = str;
	}
	@Override
	public boolean equals(Object obj) { 
		//equals를 조작하여, 나만의 비교 메소드를 만들 수 있다.
		Ch07Myclass imsi = (Ch07Myclass) obj;
		
		return (this.compareStand == imsi.compareStand);
	}
	
	@Override
	public String toString() {
		//toString() 메소드를 오버라이드 하여, 나만의 메시지 출력문을 만들 수 있다.
		return "객체에 대한 안내문입니다. \n\'" + compareStand + "\'가 저장된 데이터입니다.\n감사합니다.";
	}
}//class Ch07Myclass 

public class Ch07Ex07 {

	public static void main(String[] args) {
		Ch07Myclass test1 = new Ch07Myclass("hello");
		Ch07Myclass test2 = new Ch07Myclass("hello");
		Ch07Myclass test3 = new Ch07Myclass("hello?");
		
		System.out.println(test1.equals(test2));
		System.out.println(test1.equals(test3));
		System.out.println(test1.toString());
	}//main
}//class









