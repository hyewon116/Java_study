package ch03;

public class Ch03Ex35 {

	public static void main(String[] args) {
		//break를 사용하여 while문을 종료시키자.
		
		int loopCount = 0;
		while(true) {//0 1 2
			System.out.println("반복문"+loopCount);
			if(loopCount == 2) 
				break;
			loopCount++;
		}
		

	}//main

}//class
