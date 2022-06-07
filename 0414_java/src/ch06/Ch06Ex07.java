package ch06;

/* 
 * throws를 override 할 때!!
 */

class Ch06Parent1 {
	public void overrideTest() throws IndexOutOfBoundsException {}
}

class Ch06Child4 extends Ch06Parent1 {
	public void overrideTest() throws IndexOutOfBoundsException {} 
	//throws override : 부모 메소드에서 선언한 Exception과 동일한 Exception 가능
}//Ch06Child2

class Ch06Child3 extends Ch06Parent1 {
//	public void overrideTest() throws Exception {} //error
	//throws override : 부모 메소드에서 선언한 Exception의 부모 타입은 불가능
}//Ch06Child2

class Ch06Child2 extends Ch06Parent1 {
	public void overrideTest() throws ArrayIndexOutOfBoundsException {}
	//throws override : 부모 메소드에서 선언한 Exception의 자식 타입은 가능
}//Ch06Child2

class Ch06Child1 extends Ch06Parent1 {
	public void overrideTest() {} //throws override : throws 생략 가능 
}//Ch06Child1


public class Ch06Ex07 {

	public static void main(String[] args) {
		

	}//main

}//class
