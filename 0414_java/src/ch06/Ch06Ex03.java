package ch06;

/*
 * exception handling 방법
 * - 1. 예외가 발생할 수 있는 코드를 try {}의 안쪽에 배치
 * - 2. 발생하는 예외에 맞추어 대응할 수 있는 catch문을 작성
 * try 
 * - 예외에 대한 포위망 역할
 * - 반드시 catch와 함께 사용
 * catch 
 * - 예외에 따른 대응 시나리오를 만드는 역할
 * - 하나의 try에 여러 개의 catch가 올 수 있다
 * - catch의 () 안에는 어떤 종류의 예외를 잡을 것인가를 정의
 * - catch의 {} 안에는 예외를 잡은 경우, 어떤 처리를 할 것인지의 코드를 선언 
 */

public class Ch06Ex03 {

	public static void main(String[] args) {
		
	try {	
	     //exception이 발생할 수 있는 코드 	
	//	 System.out.println(7/0);
		 String str = null;
	//	 if(str.length() > 0) {}
    //	 if(1 > 0 || str.length() > 0) {} //short circuit logic (앞에 것만 검사함)
		 String str2 = "hi";
	//	 System.out.println(str2.charAt(5));
		 
		 int [] iArr = new int[2];
		 System.out.println(iArr[5]);
		 
	} catch (ArithmeticException e) {
		System.out.println("수학적인 문제");
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("배열의 칸수를 세어 보세요.");
	} catch (StringIndexOutOfBoundsException e) {
		System.out.println("문자열의 길이를 확인하세요.");
	} catch (NullPointerException e) {
		System.out.println("instance가 연결되지 않은 변수");
	}
	
	}//main
}//class
