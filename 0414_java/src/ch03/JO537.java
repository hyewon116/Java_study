
package ch03;
//100 이하의 양의 정수만 입력된다.
//while 문을 이용하여 1부터 입력받은 정수까지의 합을 구하여 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class JO537 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int userInput = scan.nextInt();
		scan.close();
		if(userInput >= 1 && userInput <= 100) {
			int sum = 0;
			int loopCnt = 1;
			while (loopCnt <= userInput) {
				sum = sum + loopCnt;
				loopCnt++;
			}
			System.out.println(sum);
		} 
	}//main

}//class
