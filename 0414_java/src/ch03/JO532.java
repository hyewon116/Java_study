package ch03;

//두 개의 실수를 입력받아 
//모두 4.0 이상이면 "A", 
//모두 3.0 이상이면 "B", 
//아니면 "C" 라고 출력하는 프로그램을 작성하시오.
import java.util.Scanner;

public class JO532 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double dVar1 = scan.nextDouble();
		double dVar2 = scan.nextDouble();
		scan.close();
		
		if (dVar1 >= 4.0 && dVar2 >= 4.0) {
			System.out.println("A");
		} else if (dVar1 >= 3.0 && dVar2 >= 3.0) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}

	}//main

}//class
