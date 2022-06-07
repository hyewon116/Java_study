package ch03;

public class Ch03Ex48 {

	public static void main(String[] args) {
		
		int line = 1; 
		while (line <= 10) {
			System.out.printf("%d 라인 : ", line);
			
			int item = 10;
			while(item >= 1) {
				System.out.print("☆");
				if(line == item) break;
				item--;
			}
			System.out.println();//줄바꿈 
			line++;
		}

	}//main

}//class
//☆☆☆☆☆☆☆☆☆☆
//☆☆☆☆☆☆☆☆☆
//☆☆☆☆☆☆☆☆
//☆☆☆☆☆☆☆
//☆☆☆☆☆☆
//☆☆☆☆☆
//☆☆☆☆
//☆☆☆
//☆☆
//☆
//
