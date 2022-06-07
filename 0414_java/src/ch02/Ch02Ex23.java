package ch02;

/*
 * printf : print + format 
 * 서식 출력 -> 기본이 문자열 출력
 * 서식 문자 ->  
 */

public class Ch02Ex23 {

	public static void main(String[] args) {
		
		System.out.printf("그냥 문자열 출력 가능\n"); 
		//역슬러시+n -> 줄바꿈 // \t -> 탭만큼 공간 띄우기(공백 넣기)
		System.out.printf("%s\n", "그냥 문자열 출력 가능");
		//%s = 문자열 출력
		System.out.printf("%d\n", 123); 
		//%d = 정수 출력 
		System.out.printf("%f\n", 3.14);
		//%f = 실수 출력, 소수점 6자리 출력이 기본
		System.out.printf("%.20f\n", 3.14);
		//%와 f 사이에 .2는 소수점 2자리 출력. .20은 20자리 출력 -> 자유롭게 조정 가능
		System.out.printf("%c\n", 'A');
		//%c = 문자 출력
		
		System.out.printf("%d + %d = %d", 1, 2, 3);
		
		System.out.printf("이름 %s, 나이 %d, 키 %.1fcm, 몸무게 %.1fkg, 혈액형 %c", "홍길동", 25, 180.0, 80.0, 'A');
		
	}//main

}//class
