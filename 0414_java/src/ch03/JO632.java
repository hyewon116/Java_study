package ch03;

/*
 * 3개의 정수를 입력받아 
 * 조건연산자를 이용하여 
 * 입력받은 수들 중 최소값을 출력하는 프로그램을 작성하시오.
 */
import java.util.Scanner;

public class JO632 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int iVar1 = scan.nextInt();
		int iVar2 = scan.nextInt();
		int iVar3 = scan.nextInt();
		
		int min = 0;
		
		scan.close();
		
		if (iVar1 > iVar2) {
			min = iVar2;
		} else {
			min = iVar1;
		}
		//min = iVar1 > iVar2 ? iVar2 : iVar1;
		
		if (min > iVar3) {
			min = iVar3;
		} 
		//min = min > iVar3 ? iVar3 : min;
		
		System.out.println(min);
		
		
	}//main

}//class
