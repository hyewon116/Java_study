package ch06;

public class Ch06Ex02 {

	public static void main(String[] args) {
		
		String str = null; //변수에 아무 값도 담지 않았다. 
		System.out.println(str.length()); //NullPointerException : 가장 잦은 예외
		
		int[] iArr = new int[3];
		System.out.println(iArr[2]);
		System.out.println(iArr[3]); // ArrayIndexOutOfBoundsException
		
		String str2 = new String("hi");
		System.out.println(str2.charAt(2));
		//StringIndexOutOfBoundsException
		
		System.out.println(7/0);
		//ArithmeticException : 수학 오류
		
		

	}//main

}//class
