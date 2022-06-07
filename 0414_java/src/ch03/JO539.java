package ch03;
//정수를 계속 입력받다가 
//100 이상의 수가 입력이 되면 마지막 입력된 수를 포함하여 
//합계와 평균을 출력하는 프로그램을 작성하시오.
//(평균은 반올림하여 소수 첫째자리까지 출력한다.)
import java.util.Scanner;

public class JO539 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int userInput = 0, sum = 0, loopCnt = 0;
		double avg = 0.0;
		//loopCnt = 몇번 들어왔는지 세는 용도
		//왜 모두 0으로 초기화를 해야 할까? 
		// -> 변수의 사용 법칙 : 초기화하지 않은 변수는 사용할 수 없다.
		
			while(true) {
				userInput = scan.nextInt();
				sum = sum + userInput; //합계 
				loopCnt++; //평균을 구하기 위해 입력 받은 횟수를 저장한다.
				if(userInput >= 100) break;

			}//while
		    
			System.out.println(sum); 
			avg = sum / (double) loopCnt; //sum이 정수값이므로 loopCnt에 실수형을 적용해야 (?)
			avg = avg * 10;
			avg = Math.round(avg);
			avg = avg / 10;
			System.out.println(avg); 
			scan.close();
	}//main

}//class
