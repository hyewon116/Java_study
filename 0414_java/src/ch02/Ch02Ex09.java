package ch02;

//정수 primitive data type casting(변경)

public class Ch02Ex09 {

	public static void main(String[] args) {
		
		byte byteVar; //변수 선언//메모리에 8bit 정수 공간 만들어라 + 이름은 byteVar
		byteVar = 127; //변수 초기화//우항의 값을 좌항에 담아라//127을 byteVar에 넣는다 
		
		int intVar; //메모리에 32bit 정수 공간 만들어라 + 이름은 intVar
		intVar = byteVar; //작은 그릇의 정수를 큰 그릇으로 옮겨라 -> ok 
		// -> ok : 문제없이 되니까, 자동으로 data type을 변경함. 
		//auto casting, 묵시적 casting(컴에게 바꿔달라고 말 안해도 변경해준다)
		
		long longVar;//메모리에 64bit 정수 공간 만들어라 + 이름은 longVar
		longVar = 2200000000L;
		
		short shortVar;//메모리에 16bit 정수 공간 만들어라 + 이름은 shortVar
		// shortVar = longVar; //큰 그릇의 정수를 작은 그릇으로 옮겨라 -> 자바 거부 
		// -> 자바 거부 : 강제로 변경, 코딩에 변경을 강제 명령함(명시함).
		shortVar = (short) longVar;// short로 바꿔!! //바꾸려는 data type을 적어주기!  
		//강제 casting, 명시적 casting 
		//-> 어떻게 short에 22억이 담기지?? -> 안 담김. 데이터 손실 일어남. -> 22016 (담기고 넘친 데이터는 버려짐)
		System.out.println(shortVar);
		
		byte bVar1 = 1, bVar2 = 2, bVar3;
		//bVar3 = bVar1 + bVar2; //정수형 변수의 연산은 int로 처리됨.
		bVar3 = (byte) (bVar1 + bVar2);//강제적, 명시적 casting
		
		
		
	}//main

}//class
