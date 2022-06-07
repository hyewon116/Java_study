package ch03;

public class Ch03Ex47 {

	public static void main(String[] args) {
		// Ch03Ex46을 for문으로 변경하라.
		for(int dan = 1; dan <= 10; dan++) {
		
			for(int gop = 1; gop <= 10; gop++) {
				System.out.printf("☆");
				if(dan == gop) break;
			}
			System.out.println();
		}
		
	}//main

}//class
