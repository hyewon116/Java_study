package ch07;

/* 중요 예제!!!!
 * 
 * Generic
 * 다이아몬드 지시자 : <>
 * 와일드 카드 : <E>, <K, V> 
 *  - E : Element : 클래스 내부에서 사용되는 요소
 *  - K : Key 
 *  - V : Value 
 *  - T : Type : 외부에서 입력하는 클래스의 타입 -> 클래스 내부에서 사용되는 타입
 *  - N : Number 
 *  - ? : 모든 클래스 - Object 
 *   
 *  자료형 매개 변수 T
 *   - 자료형 매개 변수 : 여러 참조 자료형으로 대체될 수 있는 부분을 하나의 문자로 표현한 것.
 *   - T : data type을 의미. 
 */

class Ch07MyGObj {
	String message;
	Ch07MyGObj(String msg) {
		this.message = msg;
	}
	@Override
	public String toString() {
		return this.message;
	}
}//class

class Ch07Ex11Test<T> { //new Ch07Ex11Test<>();
	private T name;
	private String str;
	public T getName() {
		return name;
	}
	public void setName(T name) {
		this.name = name;
	}
	
}//class

public class Ch07Ex11 {

	public static void main(String[] args) {
		Ch07Ex11Test<Integer> test1 = new Ch07Ex11Test<Integer>();
		test1.setName(777);
		System.out.println(test1.getName().toString());
		
		Ch07Ex11Test<String> test2 = new Ch07Ex11Test<String>();
		test2.setName("hello");
		System.out.println(test2.getName().toString());
		
		Ch07Ex11Test<Ch07MyGObj> test3 = new Ch07Ex11Test<Ch07MyGObj>();
		test3.setName(new Ch07MyGObj("victory!!!"));
		System.out.println(test3.getName());
		
	}//main
}//class
