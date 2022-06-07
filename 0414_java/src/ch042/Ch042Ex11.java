package ch042;
/*
 * constructor (생성자)
 *  - class로 instance를 만들(메모리 load 할) 때, 최초에 1번만 실행되는 특수한 메소드.
 *  - new를 통해 메모리에 올라갈 때 호출된다. 예) new Ch042Dummy5();
 *  - new Ch042Dummy5();의 ()가 생성자 호출.
 *  - 특수한 메소드인 이유?
 *     1) JRE가 객체 생성될 때, 최초의 1번만 호출. 
 *     2) return type 없음.
 *  - 메소드의 일종이기 때문에 method overload가 가능함.
 *  - 사용하는 목적 : instance를 만들 때, 멤버 변수 값 대입 또는 instance에 데이터 전달.
 *  - 규칙 : 생성자의 이름은 class name과 동일해야 한다.
 */
/* - class로 instance를 만들(메모리 load 할) 때, 최초에 1번만 실행되는 특수한 메소드.
 *  - new를 통해 메모리에 올라갈 때 호출된다. 예) new Ch042Dummy5();
 *  - new Ch042Dummy5();의 ()가 생성자 호출.
 *  - 특수한 메소드 ?
 *     -> 1. JRE가 객체 생성될 때, 최초의 1번만 호출.
 *     -> 2. return type 없음.
 *  - 메소드의 일종이기 때문에 method overload가 가능함.
 *  - 사용 목적 : instance를 만들 때, 멤버 변수 값 대입 또는 instance에 데이터 전달.
 *  - 규칙 : 생성자의 이름은 class name과 동일해야 한다.
 */
/*
 * 프로그래머가 생성자를 하나도 안 만들었다면?
 *  -> 아무 값도 없는 생성자가 있는 것으로 간주한다.
 *  -> default constructor라고 한다.
 *  -> public className(){} : 이런 형태가 있는 것으로 간주한다. (안 만들어도 됨)
 *  프로그래머가 어떠한 형태라도 생성자를 하나라도 만들었다면? (내용이 있는 생성자)
 *  -> default constructor 제공 안 됨.
 *  -> public className(){} : 반드시 만들어야 함.
 */
/*
 * class가 instance가 되는 과정 
 * 1. 변수 만들기 : Ch042Dummy5 dummy
 * 2. 메모리 만들기 : new Ch042Dummy5
 * 3. 생성자 실행 : Ch042Dummy5("메모리 올라갈 때 data 전달하려고 사용합니다.")
 * 4. = : new Ch042Dummy5의 메모리 위치 값을 변수에 저장
 */

class Ch042Dummy5 {
	String memStr = "최초의 문자열";
	public Ch042Dummy5() {}  //아래 생성자가 생겼으므로 이것도 있어야 함. (원래는 없어도 됨)
	public Ch042Dummy5(String str) {
		memStr = str;
	}
	void print() {
		System.out.println(memStr);
	}
	
}//class

public class Ch042Ex11 {

	public static void main(String[] args) {
		
		Ch042Dummy5 dummy = new Ch042Dummy5(); // () : 생성자 
		dummy.print();
		Ch042Dummy5 dummy2 = new Ch042Dummy5("메모리 올라갈 때 data 전달하려고 사용합니다.");
		dummy2.print();

	}//main

}//class
