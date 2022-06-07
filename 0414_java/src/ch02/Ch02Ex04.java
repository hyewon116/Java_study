package ch02;

/*
 * 자바에서 사용하는 변수의 종류 : primitive data type : 자바의 기본 데이터 종류 8가지.
 *  - 정수 type(형태) : byte, short, int, long.
 *  - 실수 타입 : float, double.
 *  - 논리 타입 : boolean.
 *  - 문자 타입 : char.
 *  - 꼭 기억할 타입 : int, long, double, boolean.
 */
public class Ch02Ex04 {

	public static void main(String[] args) {

		byte byteVar = 127;//메모리에 정수 8bit 공간 확보.
		short shortVar = 30000;
		int intVar = 2100000000;
		long longVar = 2200000000L;//L을 넣어야 long value.

		float floatVar = 0.123456789F;//F를 넣어야 float value.
		System.out.println(floatVar);
		double doubleVar = 0.1234567890123456789D;//D를 넣지 않아도 됨.
		System.out.println(doubleVar);

		boolean boolVar = false;
		System.out.println(boolVar);
		System.out.println(longVar > intVar);//true

		char charVar = 'A';
		System.out.println(charVar);
	}//main

}//class
