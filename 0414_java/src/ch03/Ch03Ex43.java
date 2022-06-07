package ch03;

//while과 for의 사용법 비교 
public class Ch03Ex43 {
	
	public static void main(String[] args) {
		//while과 for의 사용법 비교 
		int endPoint = 1;
		while(endPoint <= 10) {
			System.out.println("while 사용법 : endPoint : " + endPoint);
			endPoint++;
		}//while
		
		for(int loopCount = 1; loopCount <= 10; loopCount++) {
			System.out.println("for 사용법 : loopCount : " + loopCount);
		}//for
		
		//for TIP (이런 방식도 있다)
		int loopCount = 1;
		for(; loopCount <= 10; loopCount++) {
			System.out.println("for 사용법 : loopCount : " + loopCount);
		}//for
		
		//변수 2개를 하나의 while문에 : 가끔 있는 경우. 참고. (놀라지 말 것)
		int ep2 = 1, ep3 = 10;
		while(ep2 < 5 && ep3 > 5) {
			System.out.printf("ep2 : %d, ep3 : %d\n", ep2, ep3);
			ep2++;
			ep3--;
		}
		
		//변수 2개를 하나의 for문에 : 가끔 있는 경우. 참고. (놀라지 말 것)
		for(int lp2 = 1, lp3 = 10; lp2 < 5 && lp3 > 5; lp2++, lp3--) {
			System.out.printf("lp2 : %d, lp3 : %d\n", lp2, lp3);
		}
		
	}//main

}//class
