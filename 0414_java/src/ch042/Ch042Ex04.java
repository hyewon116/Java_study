package ch042;

/*
 * 멤버 변수 : class를 구성하는 변수 : class의 특성 : 예)사람(class)의 이름(멤버 변수)처럼.
 * 지역 변수 : 메소드의 작업에 필요한 변수 : (), {} 내부에 존재하는 변수
 *         : 메소드가 실행될 때만 만들어졌다가, 메소드가 종료되면 사라진다. 
 *         : 지역 변수는 선언된 (), {} 밖에서는 접근이 안 된다.
 * - 멤버 변수와 지역 변수는 같은 이름을 사용할 수 있으나, 일반적으로 같은 변수명은 피함.
 * - 멤버 변수와 지역 변수의 이름이 같을 때, 지역 변수를 먼저 적용.
 */
class LocalVarTest {
	int memberInt = 999; // 멤버 변수 = 파란색
	
	void print() {
		int localInt = 333; // 지역 변수 = 갈색 //print() 실행 시에만 생성되는 지역 변수.
		System.out.println("localInt : " + localInt);
		int memberInt = 555; // 위에도 memberInt가 있지만, 지역 변수 우선 
		System.out.println("local memberInt : " + memberInt);
		System.out.println(this.memberInt); // this = 현재 class를 지칭. 나 자신. 
		                                    // this를 사용하면 멤버 변수를 print() 내부에서도 사용 가능.
	}//
}//class
public class Ch042Ex04 {

	public static void main(String[] args) { 

		{
			int iVar1 = 777;//지역 변수 : 자신을 선언한 {} 밖에서는 접근 불가. 
			System.out.println(iVar1);
		}
		//System.out.println(iVar1);
		LocalVarTest test = new LocalVarTest();
		test.print(); // 출력 : 333,555 why? 지역 변수 우선이라서.
		
	}//main

}//class





