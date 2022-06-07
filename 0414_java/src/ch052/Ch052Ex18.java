package ch052;

/* 
 * inner class : class 안에 class 있다
 */

public class Ch052Ex18 {
	
	//local inner class는 메소드를 수행하기 위해 임시 class가 필요할 때 사용한다.
	public void innerTest() {
		
//		public class LocalInner {} //error
//		protected class LocalInner {} //error 
//		private class LocalInner {} //error
		class LocalInner {//메소드 안의 class는 default만 가능
			public String inStr;
			public void printStr() {
				System.out.println("inStr : " + inStr);
			}//printStr
		}//class LocalInner
		
		LocalInner local = new LocalInner();
		local.inStr = "메소드에서 생성하고, 메소드가 종료되면 사라진다.";
		local.printStr();
		
	}//method innerTest()

	public static void main(String[] args) {

		Ch052Ex18 test = new Ch052Ex18();
		test.innerTest();
		
	}

}
