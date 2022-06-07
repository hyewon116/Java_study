package ch052;


// static class StaticClass { } //error // inner class가 아니면 static class 불가능

public class Ch052Ex17 {

	public static class StaticInner {
		
		public static String staticInStr = "hello"; //static 영역 
		public static void printStr() {
			System.out.println("staticInStr : " + staticInStr);
		}//static method
		public static int staticInIVar = 999;//static 영역
		public static void printInt() {//static 영역
			System.out.println("staticInStr : " + staticInIVar);
		}
	}//static class StaticInner
	
	public static void main(String[] args) {
		
		//static inner class는 접근(호출) 방법에 주의를 요함!! (아래 참고)
		Ch052Ex17.StaticInner.printInt();
		Ch052Ex17.StaticInner.staticInStr = "nice to meet you.";
		Ch052Ex17.StaticInner.printStr();
		
	}//main

}//class
