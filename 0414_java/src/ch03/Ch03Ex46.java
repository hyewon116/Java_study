package ch03;

public class Ch03Ex46 {
	
	//별찍기
	public static void main(String[] args) {
		
		int dan = 1;
		while(dan <= 10) {
			//System.out.print(dan + "단 : ");
			
			int gop = 1;
			while(gop <= 10) {
				//System.out.printf("%d * %d = %d\t", dan, gop, dan*gop);
				System.out.printf("☆");
				if(dan == gop) break;
				gop++;
			}
			System.out.println();
			dan++;
		}//while

	}//main

}//class

//별찍기
//☆
//☆☆
//☆☆☆
//☆☆☆☆
//☆☆☆☆☆
//☆☆☆☆☆☆
//☆☆☆☆☆☆☆
//☆☆☆☆☆☆☆☆
//☆☆☆☆☆☆☆☆☆
//☆☆☆☆☆☆☆☆☆☆