package ch051;
/*
 * Polymorphic Arguments : 다형성 응용
 *   - Arguments의 자리에 부모 타입의 변수를 사용하면, 자식 타입의 객체 모두를 가져올 수 있다.
 */

class Ch051Print {
	
//	void print(Teacher t) {
//		t.print();
//	}
//	void print(Student s) {
//		s.print();
//	}
	void print(People p) {
		//부모 타입의 변수 p는 자식 타입의 객체를 가져올 수 있다.
		p.print();
	}
}

public class Ch051Ex11 {

	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.name = "길동";
		
		Student s = new Student();
		s.name = "감찬";
	
		Ch051Print p = new Ch051Print();
		p.print(t); // class에서 변수 People 선언, -> 자식 타입 객체(Teacher) 가져옴.  
		p.print(s); // class에서 변수 People 선언, -> 자식 타입 객체(Student) 가져옴.

	}//main

}//class
