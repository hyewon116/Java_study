package ch041;

public class Ch041Ex16 {

	public static void main(String[] args) {
		
		String [] strArr1 = {"nice ", "to meet ", "you.", " too."};
		for (int i = 0; i < strArr1.length; i++) {
			System.out.print(strArr1[i]);
		}//for
		System.out.println();
		
		for(String s : strArr1) {//순차 접근x, 그냥 전체 출력
			System.out.print(s);
		}//forEach
	}//main

}//class
