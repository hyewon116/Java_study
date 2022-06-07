package ch03;

import java.util.Scanner;

/*
 * 3자리 숫자 맞추기 게임
 * - 컴은 임의의 0에서 999 3자리 이하 숫자를 발생시킨다
 * - 유저는 예상되는 숫자를 입력한다.
 * - 컴은 유저가 입력한 숫자가 큰지, 작은지, 맞는지를 판단하여 알려준다. 
 * - 유저는 숫자를 맞출 때까지, 입력을 반복한다. //입력은 반복문 안에 있어야 한다.
 * */
public class Ch03Ex45 {

	public static void main(String[] args) {
		
		int comSelect = (int) (Math.random() * 1000);
		Scanner scan = new Scanner(System.in);
		int userInput = 0; //메모리에 32bit 저장 공간을 만들어라. 
		                   //왜 while문 안이 아닌 여기 하는 게 좋을까? 변수 선언을 한 번 하기 위해?
		int count = 0;
		
		while(true) {
			System.out.print("\n 0에서 999까지의 수를 맞춰보세요. 입력 : ");
			userInput = scan.nextInt();
			count++;
			if(comSelect == userInput) {
				System.out.println("정답입니다!!:)");
				System.out.println(count + "회만에 맞추셨습니다!");
				System.out.println("게임을 종료합니다.");
				scan.close();
				System.exit(0);
			} else if(comSelect > userInput) {
				System.out.println("정답보다 작은 수를 입력하셨습니다.");
			} else if(comSelect < userInput) {
				System.out.println("정답보다 큰 수를 입력하셨습니다.");
			} else {
				System.out.println("입력 값이 올바르지 않습니다.");
			}
			// 질문 : random은 실행때마다 새로운 수를 내놓지 않나? 왜 이 게임에선 수가 고정되어 있지?
		}
	}//main

}//class
