package ch11;
// 예외처리 : Exception, (try~catch문)
//    목적 : 비정상적인 종료를 정상적인 종료로 유도 
//    try {
//       예외가 발생할 수 있는 문장들;
//       예외가 발생할 수 있는 문장들;
//    } catch (예외 발생 객체 e) {
//         예외 발생 시 처리하는 문장들;
//    }
public class Ex01 {

	 public static void main(String[] args) {
		 
		 try { //해당 부분만 잡아와도 되지만 보통 메소드 전체를 데려옴.
			 int [] var = {10,20,30}; 
			 for (int i = 0; i <= var.length; i++) { //강제로 오류 만듬. '<='
				 System.out.println("1");
				 System.out.println("2");
				 System.out.println("var[" + i + "] = " + var[i]);
				 System.out.println("3");
				 System.out.println("4");
			 }//for			
		} catch (ArrayIndexOutOfBoundsException e) { //콘솔 오류에서 나오는 변수명 사용
			System.out.println("예외 발생");
		} //강제 종료 아닌 정상 종료가 됨
	
	}//main
}//class
