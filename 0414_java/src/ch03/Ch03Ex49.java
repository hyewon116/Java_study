package ch03;

public class Ch03Ex49 {

	public static void main(String[] args) {
		// Ch03Ex48을 for문으로 만들어라.
		
		for(int line = 1; line <= 10; line++) {
			System.out.printf("%d 라인 : ", line);
			
			for (int item = 10; item >= 1; item--) {
				System.out.print("☆");
				if(line == item) break;
		}
		 System.out.println();
	}

	}//main

}//class
