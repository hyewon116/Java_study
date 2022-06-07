package ch03;

//! : 논리 부정, NOT의 의미
public class Ch03Ex07 {
		
	public static void main(String[] args) {
		// ! : 논리 부정, NOT의 의미
		System.out.println(!true); //false
		System.out.println(!!true); //true
		
		// + - : 부호 연산자
		System.out.println(1);
		System.out.println(-1);
		System.out.println(-(-1));//양수
		
		// ~ : 1의 보수 
		// 1의 보수 : -128 ~ 127 -> 0의 대칭점은?? -1
		// -3 -2 -1  기준  0  1  2  (반을 접어라. like 데칼코마니?)
		System.out.println(~0); // -1
		System.out.println(~1); // -2
		System.out.println(~2); // -3
		
		//2의 보수 : 1의 보수 + 1 : ~0 + 1
		// -3 -2 -1  0기준  1 2 3
		System.out.println(~0+1); // 0
		System.out.println(~1+1); // -1
		System.out.println(~2+1); // -2
		
		//실무에서 보수를 쓸 일은 없다.

	}//main

}//class
