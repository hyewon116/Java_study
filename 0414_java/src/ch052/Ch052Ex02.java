package ch052;

/*
 * 2) final method : 변경 불가능한 메소드 : override 불가
 * 
 */
class ch052Parent1 {
	
	public final void finalMethod() {
		System.out.println("finalMethod");
	}
}
class ch052Child1 extends ch052Parent1 {
//	public void finalMethod() { // error : override 불가
//		System.out.println("finalMethod");
//	} 
}

public class Ch052Ex02 {
	
	public static void main(String[] args) {
		

	}//main

}//class
