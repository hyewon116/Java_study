package ch052;

/*
 * abstract도 Inheritance & Polymorphism의 모든 개념 적용 가능
 */
abstract class AbstractA {
	abstract void abstractMethod();
	
}//abstract class abstractA

abstract class AbstractB extends AbstractA {
	//abstract도 상속이 된다
	
}//abstract class AbstractB

class AbstractChild1 extends AbstractB{
	String hello = "안녕하세요.";
	@Override 
	void abstractMethod() {
		System.out.println(hello);
	}
}
class AbstractChild2 extends AbstractB{
	String hello = "반갑습니다.";
	@Override
	void abstractMethod() {
		System.out.println(hello);
	}
}

public class Ch052Ex10 {//abstract도 Polymorphism 적용 가능
	
	static AbstractA [] arr = new AbstractA[2]; //Heterogeneous Collection
	
	public static void main(String[] args) {
		arr[0] = new AbstractChild1(); //arr[0] : 부모 타입의 변수 
		arr[1] = new AbstractChild2(); 
		printAbstract(arr[0]);
		printAbstract(arr[1]);
		
	}//main

	public static void printAbstract(AbstractA abs) {//Polymorphic Arguments 
		abs.abstractMethod();
		// =================
		//Object Data Type Casting & instanceof 가능
		if(abs instanceof AbstractChild1) {
			AbstractChild1 one = (AbstractChild1) abs;
		} else if(abs instanceof AbstractChild2) {
			AbstractChild2 two = (AbstractChild2) abs;
		}
		
	}//printAbstract
	
}//class





