package ch042;
/*
 * method의 정의
 *  - class는 현실 세계를 모델링한 설계도. 현실 세계의 대상을 표현한 주제가 있다.
 *  - 예) 음료수 자판기 : 음료수, 투입 행위, 배출 행위 요소들로 표현 가능.
 *  - class의 member라는 개념 : class를 표현하는 것. (음료수, 투입 행위, 배출 행위)
 *  - 투입 행위, 배출 행위와 같이 동작을 감당하는 것이 method.
 * method의 구성
 *  - return type
 *     : 다른 사람에게 이 메소드를 사용하면, 돌려주는 값의 데이터 형태를 알려준다. 
 *     : 자판기의 제품 전시 공간.
 *     : int, double, String 등 이 메소드를 사용하면, 얻을 수 있는 데이터를 알려준다.
 *     : return : 돌려주는 행위.
 *     : * void : return type 없음 = 돌려주는 값 없다. = return 없음(사용 안 함)
 *  - name 
 *     : 메소드의 동작이 잘 나타나도록 만든다. 
 *     : 첫문자 소문자, 이어지는 단어의 첫문자 대문자, 숫자 가능하지만 맨 앞 불가. 특수문자 비권장.
 *  - arguments
 *     : 메소드를 수행하기 위해 필요한 data를 외부에서 입력 받는 공간. 
 * method의 장점 (자바의 장점) 
 * - 코드의 재사용성 : 한 번 만들어놓은 메소드는 재사용 가능.
 *    --> 코드의 모듈화, 코드의 중복 회피, 개발 기간 단축, 유지보수를 쉽고 빠르게.
 */
class Ch042Dummy3 {
	//return type이 있는 method
	String returnTest() {//return type이 String 
		return "문자열 리턴의 예제입니다.";
	}//String으로 return하기로 했으니 결과값도 String이어야!!
	
	//arguments가 있는 method 1
	void argumentsTest(int iVar1) {
		System.out.println("입력 값 : " + iVar1);
	}
	
	//arguments가 있는 method 2
	void printPlus(int iVar1, int iVar2) {
		System.out.printf("%d + %d = %d", iVar1, iVar2, iVar1 + iVar2);
	}//printPlus
	
	//arguments가 있는 method 3
	void printStrArr(String [] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}//for
	}//printStrArr
	
	//return type, arguments가 있는 method
	String strConcat(String s1, String s2) {
		return s1 + s2;
	}//
	
}//class

public class Ch042Ex08 {

	public static void main(String[] args) {
		
		Ch042Dummy3 dummy3 = new Ch042Dummy3();
		String returnedData = dummy3.returnTest();
		//dummy3.returnTest()를 호출 + 실행해서 문자열을 리턴 받았다.
		//System.out.println(returnedData);
		
		System.out.println(dummy3.returnTest());
		//class 안에서 sysout을 해놓지 않아서 여기서 해야 함
		
		dummy3.argumentsTest(777);
		dummy3.printPlus(9876,8765);
		
		String [] strArr = {"nice", "to meet", "you", "to"};
		dummy3.printStrArr(strArr);
		
		String concatRes = dummy3.strConcat("thank you. ", "and you?");
		//2개의 문자열을 arguments로 받아서 1개의 문자열을 돌려주었다.
		System.out.println(concatRes);
		
	}//main

}//class
