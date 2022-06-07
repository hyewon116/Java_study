package ch03;

public class Ch03Ex51 {

	public static void main(String[] args) {
		// 별찍기 3단계 트리 모양 만들기 -> for문으로 
		
				for(int line = 1; line <= 10; line++) {
					 for(int item2 = 10; item2 >= 1; item2--) {
						System.out.print(" ");
						if(line == item2) break;
					}//for
					for (int item = 1; item <= 10; item++) {
						System.out.print("☆");
						if(line == item) break;
					}//for
					System.out.println();
				}//for

	}

}
