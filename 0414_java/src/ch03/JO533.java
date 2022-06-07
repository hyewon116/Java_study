package ch03;
/*
 * 남자는 'M' 여자는 'F'로 나타내기로 하고 18세 이상을 성인이라고 하자.
 * 성별('M', 'F')과 나이를 입력받아 
 * "MAN"(성인남자), "WOMAN"(성인여자), 
 * "BOY"(미성년남자), "GIRL"(미성년여자)을 구분하여 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class JO533 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String gen = scan.next();
		int age = scan.nextInt();
		
		if (gen.equalsIgnoreCase("F")) { //소문자도 인식하게 하려면 equalsIgnoreCase (소/대문자 무시) 사용!!
			if (age >= 18) { //성인
				System.out.println("WOMAN");
			} else {
				System.out.println("GIRL");
			}
		} else {
			if (age >= 18) {
				System.out.println("MAN");
			} else {
				System.out.println("BOY");
			}
		}

	}//main

}//class
