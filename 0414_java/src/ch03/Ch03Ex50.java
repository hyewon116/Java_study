package ch03;

public class Ch03Ex50 {

	public static void main(String[] args) {
		// 별찍기 3단계 트리 모양 만들기
		int line = 1; 
		while(line <= 10) {
			
			int item2 = 10; 
			while(item2 >= 1) {
				System.out.print(" ");
				if(line == item2) break;
				item2--;
			}
			
			int item = 1; 
			while(item <= 10) {
				System.out.print("☆");
				if(line == item) break;
				item++;
			}//while
			
			System.out.println();
			line++;
		}//while
		
	}//main

}//class

//별찍기
//          ☆ -> 공백 9개?
//         ☆☆
//        ☆☆☆
//       ☆☆☆☆
//      ☆☆☆☆☆
//     ☆☆☆☆☆☆
//    ☆☆☆☆☆☆☆
//   ☆☆☆☆☆☆☆☆
//  ☆☆☆☆☆☆☆☆☆
// ☆☆☆☆☆☆☆☆☆☆
//
