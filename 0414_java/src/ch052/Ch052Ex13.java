package ch052;

/*
 * implements : 구현한다
 *  - interface를 일반 class에 상속시키는 표현 
 *  - class A implements interface B
 *    -> class A는 interface B를 구현했다는 의미
 */

interface interTest6 {
	public abstract void print();
}

public class Ch052Ex13 implements interTest6 { //꼭 override를 해줘야 함 (ctrl + space)
	
	@Override
	public void print() {	
	}

	public static void main(String[] args) {
		
		
	}//main
		
}//class
