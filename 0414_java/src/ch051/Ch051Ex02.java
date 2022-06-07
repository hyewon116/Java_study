package ch051;

/*
 * Polymorphism :다형성 : 다양한 형태를 갖는 성질
 * - 상속 받은 개체(child)의 내부에는 부모객체(parent)가 있다. O
 * - 부모 타입의 변수는 자식 타입의 객체가 있는 메모리 주소를 가질 수 있다. O
 * - 그리스어 poly (많은) + morphos (형태)
 * - 상속 관계 (is a relationshiop)에서만 성립.
 */
/* 
 * Polymorphism 사용 이유와 장점
 * - Heterogeneous Collection : 이종 배열 : 상속 개념에서 다른 데이터 타입도 다 들어가는 배열 
 * - Polymorphic Arguments
 */

public class Ch051Ex02 {
	
	public static void main(String[] args) {
	
		People p1 = new People();
		Teacher t1 = new Teacher();
		Student s1 = new Student();
		//=======================
		People p2 = new Teacher();//부모 타입의 변수는 자식 타입의 객체 주소를 가질 수 있다.
		p2.familyName = "홍";
		p2.name = "길동";
		p2.address = "신수동";
		p2.tel = "010";
		//p2.subject = "java"; 
		//p2.payAcount = "KB";
		Teacher t4 = (Teacher) p2; //Object Casting//객체 타입 변경
		Student sss = (Student) p2;
		t4.subject = "java";
		t4.payAccount = "KB";
		
		//People 타입의 변수 p2는 Teacher의 고유 영역에 뭐가 있는지 모른다.		
		People p3 = new Student();
		//=======================
	//	Teacher t2 = new People(); //error ★ //자식 타입 변수로 부모 타입 변수를 정의할 수 없다.
	//	Student s2 = new People(); //error ★
	//	Teacher t3 = new Student();//error ★
	//	Student s3 = new Teacher(); //error ★
		

  }//main
}//class
