package ch03;

//삼항 연산자
//? 와 : 으로 구성
// '항 ? 항 : 항' 구성 -> 3항. so, 삼항 연산자
// ? 앞에는 질문, ? 와 : 사이에는 참인 경우의 값, : 뒤에는 거짓인 경우의 값이 옴
// 1 > 10 ? true : false -> false
// 10 < 100 ? true : false -> true
// ? 앞에 오는 질문은 반드시 참, 거짓을 판별하는 문장이 와야 한다.
public class Ch03Ex06 {
	
	public static void main(String[] args) {
		System.out.println(1 > 10 ? true : false);//false
		System.out.println(10 < 100 ? true : false);//true
		
		int iVar1 = 5;
		System.out.println(iVar1 >= 5 ? "올림" : "내림");//반올림의 원리.
		iVar1 = 4;
		System.out.println(iVar1 >= 5 ? "올림" : "내림");//반올림의 원리.
		
		
		// a ? b : c
		// a에는 참 거짓을 판별하는 문장이 온다.
		// a가 참이면 b를 수행
		// a가 거짓이면 c를 수행

	}//main

}//class
