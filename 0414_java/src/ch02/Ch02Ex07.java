package ch02;

/*
 * 실수 타입의 변수
 *  - 소수점 9를 표현 못해서, 소수점 숫자 오류 가능성 있음.
 *  - float (32bit)
 *  - 값을 대입할 때, 영문자 F 또는 f를 붙인다.
 *  - float는 소수점 5번째까지 신뢰.
 *  - double (64bit)
 *  - double이 기본형. (아무 생각없이 코딩하면 다 double이 된다.)
 *  - double는 소수점 15번째까지 신뢰.
 */
public class Ch02Ex07 {

	public static void main(String[] args) {

		float floatVar1 = 0.9F, floatVar2 = 0.5F;
		System.out.println(floatVar1);

		double doubleVar1 = floatVar1;
		System.out.println(doubleVar1);

		double doubleVar2 = floatVar1 + floatVar2;
		System.out.println(doubleVar2);

	}//main

}//class
