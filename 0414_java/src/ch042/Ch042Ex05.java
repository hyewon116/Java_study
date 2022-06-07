package ch042;

/*
 * 지역 변수 : local variable
 *  - 특정한 지역에서만 의미를 갖는 변수
 *  - 주로 메소드 내부에 선언되는 변수를 의미함
 *  - () 내부에서 선언된 변수
 *  - 클래스 중괄호({})가 아닌 다른 중괄호({})들에서 선언된 변수
 *  ** 에러가 안 나더라도 같은 이름 변수 사용xx
 */
public class Ch042Ex05 {

	public static void main(String[] args) {
		
		String localStr1 = "지역 변수"; 
		//아래 중괄호 안, 바깥에도 계속 영향 미침. so, 같은 이름 사용x (main문 안까지 영향)
		{
			//String localStr1 = "지역 변수"; //error//같은 이름은 피해라
			String localStr2 = "지역 변수 이름은 같지 않도록 노력하세요";
		}
		
		String localStr2 = "18 line의 지역 변수는 19 line에서 효력 소멸"; 
		// 위 localStr2는 괄호 안까지만 영향을 미침
		// 18 line의 지역 변수는 19 line에서 효력 소멸
		
		for(int idx = 0; idx <= 1; idx++) {
			System.out.println("idx도 지역 변수");
			//int idx = 5; ==> error // 같은 지역 변수 이름이 두 번 사용된 예 
			//아직 괄호 안에 있으므로 또 쓰면 x
		}//for
			
		for(int idx = 0; idx <= 1; idx++) { //idx를 또 사용했지만 에러x // 25 line의 idx는 28 line 에서 효력 소멸
			System.out.println("25 line의 idx는 28 line 에서 효력 소멸");
		}//for
		
		//** 에러가 안 나더라도 같은 이름 변수 사용xx
	}//main

}//class
