package ch03;

import java.util.Scanner;

public class Ch03Ex25 {
	/*
	 *  하이/로우 게임
	 *  0~9까지의 수 중에
	 *  첫번째 수를 보여주고
	 *  두 번째 수가 첫 번째 수보다 
	 *  높은지 낮은지를 선택하는 게임   
	 */

	public static void main(String[] args) {
		
		//module 1 - 첫 번째 수를 발생시켜, 보여준다.
		int fNum = (int) (Math.random() * 10); //*10을 하면 : 0~9까지. *9+1을 하면 1~9까지. (무조건 +1을 하니까!!)
		System.out.println("Welcome High/Low Game");
		System.out.println("Firt Number : " + fNum);
		
		//module 2 - 두 번째 수를 발생시켜, 보관한다.
		int sNum = (int) (Math.random() * 10);
		
		//module 3 - 유저의 판단을 입력받는다. 
		Scanner scan = new Scanner(System.in);
		System.out.println("두 번째 수는 첫 번째 수보다 낮을까요? 높을까요?(0~9 중에서)");
		System.out.print("낮으면 1, 높으면 2, 당신의 선택은? : ");
		int uSelect = scan.nextInt(); 
		scan.close();
		System.out.println("Your Select : "+ uSelect);
		
		//module 4 - 결과를 보여준다.
		System.out.println("Second Number : "+ sNum);
		if(fNum == sNum) {
			System.out.println("무승부");
		} else if(uSelect == 1) {
			if(fNum < sNum) {
				System.out.println("승리");
			} else {
				System.out.println("패배");
			}
		} else if(uSelect == 2) {
			if(fNum < sNum) {
				System.out.println("패배");
			} else {
				System.out.println("승리");
			}
		} else {
		System.out.println("입력 값이 올바르지 않습니다.");
		}
		
	}//main

}//class
