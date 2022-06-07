package ch052;

/*
 * abstract method, abstract class 
 *  - abstract : 미완성
 * abstract method : 미완성 메소드
 *  - 구현부의 중괄호{}가 없다.
 *  - 메소드를 ;으로 종결함.
 *  abstract class : 미완성 클래스
 *  - 미완성 메소드가 있는 class
 *  - new를 통한 객체 생성 불가
 *  abstract를 사용하는 이유
 *  - abstract method를 상속받는 사람에게 
 *    -> 그 메소드를 구체적으로 만들라고 강요하는 목적.
 *      -> 반드시 오버라이드 해야 하는 메소드를 까먹고 구현 안할까봐...
 */

public abstract class Ch052Ex08 {
	
	public abstract void abstractMethod();
	

}//class

class Ch052Ex08Test extends Ch052Ex08 {
	public void abstractMethod() {}
	
}