package ch03;

//논리 연산자 -> true, false
// & : and : 그리고, 좌우가 모두 true일떄만 true.
// | : or : 또는,  좌우 중 하나라도 true이면 true. 

public class Ch03Ex03 {

	public static void main(String[] args) {
		System.out.println(true & true); //true
		System.out.println(true & false); //false
		System.out.println(false & true); //false
		System.out.println(false & false); //false
		
		System.out.println(true | true); //true
		System.out.println(true | false); //true
		System.out.println(false | true); //true
		System.out.println(false | false); //false
		
		// - 논리 연산의 SHORT CIRCUIT LOGIC
		//: & : & 앞(좌측)의 값이 이미 거짓이면 뒤(우측)의 값과 상관없이 이미 거짓
	     //   -> 뒤를 검사할 필요가 없다 -> &&  
		
		System.out.println(1 > 10 & 10 < 100); //false
		// & 하나 : 좌측 검사 실패 + 우측 검사 -> 결과 false
		System.out.println(1 > 10 && 10 < 100); //false
		// && 두개 : 좌측 검사 실패 -> 결과 false -> 이게 더 검사가 짧음
		
		//논리 연산의 short circuit logic 2.
		// | : | 앞(좌측)의 값이 이미 참이면, | 뒤(우측)의 값과 상관없이 이미 참.
		//   -> | 뒤(우측)의 값을 검사할 필요가 없다 -> ||
		System.out.println(10 < 100 | 1 > 10);
		// | : 10 < 100 검사 + 1 > 10 검사 -> 결과 true 
		System.out.println(10 < 100 || 1 > 10);
		// || : 10 < 100 검사 -> 결과 true // short circuit logic
		
		//자바에서는 &, |를 안 쓴다. short circuit logit(&&, ||)을 주로 쓴다.
 	}//main

}//class
