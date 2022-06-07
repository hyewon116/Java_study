package ch03;

public class Ch03Ex42 {

	public static void main(String[] args) {
		//for 구구단
		for(int dan = 2; dan <= 9; dan++) {
			System.out.printf("===== %d단 =====\n", dan);
				for(int gop = 1; gop <= 9; gop++) {
					System.out.printf("%d * %d = %d\t", dan, gop, dan*gop); 
					if(gop % 3 == 0) System.out.println(); //3의 배수에선 다 띄어라!!
				}//for
		}//for
			
	}//main

}//class
