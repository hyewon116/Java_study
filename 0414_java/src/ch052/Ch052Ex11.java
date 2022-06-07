package ch052;

/*
 * interface : 특별한 class : class의 한 종류
 * - abstract method로만 이루어진 특별한 class
 * - class 대신 interface 선언을 사용한다.
 * - 예) public interface Saram { }
 * - 변수는 final static 변수만 사용한다.
 * - 정상적인 일반 메소드는 사용 못한다.
 * - 메소드는 오직 abstract method만 사용 가능하다.
 * - new를 통한 instance 생성이 불가능하다. 
 * - interface를 상속받는 class에게 abstract method의 구현을 강제한다. 
 */

/*
 * interface의 탄생 배경
 * - abstract 메소드를 상속시켜서
 *   상속 받는 클래스에게 메소드 구현을 강제하고 싶은데 
 *   자바는 단일 상속만 가능
 * - 기능적으로는 abstract class와 같고
 * - 이미 상속을 받는 클래스에게 interface를 상속시켜서
 *   상속 받는 클래스에게 메소드 구현을 강제하기 위해 만들어졌다.
 */

 interface InterTest1 { 
	 public int iVar1 = 777; //final static(변수가 굵은 이탤릭체) //기재 안 해도 자동으로 설정됨
	 public final static int iVar2 = 888; //final static
	 
//	 public void nomalMethod() {} //error //정상 메소드 사용 불가 (구현부 있어서 에러!! 원래 추상 메소드는 구현부가 없음)
	 public abstract void abstractMethod1();//abstract method1
	 public void abstractMethod2(); //자동으로 abstract method1 //왜 -> (구현부 없으므로)
}

public class Ch052Ex11 {

	public static void main(String[] args) {
		

	}

}
