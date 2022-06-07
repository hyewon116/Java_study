package ch03;

import java.util.Scanner;
//import : 가져와라 : 왜? 내가 필요하니까.
//java.util.Scanner : Scanner class file 위치
//java 폴더 밑에 util 폴더 안에 Scanner파일

public class Ch03Ex13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//Scanner : 손쉽게 키보드 입력을 받아 준다.
		//System.in : 입력 버퍼 : 키보드에서 입력된 값들이 대기하는 곳
		//scan.nextInt() : 정수 가져오기
		//scan.nextDouble() : 실수 가져오기
		//scan.next : 단어 가져오기
		//scan.nextLine() : 문장 가져오기 : 엔터 값을 가져온다 : 버려진 엔터값도 가져온다
		
		System.out.print("정수(0~21억) 입력 : ");
		int iVar = scan.nextInt(); 
		System.out.println("your input : " + iVar);
		
		scan.nextLine();
		System.out.println("당신은 누구입니까?");
		String sentens = scan.nextLine();
		System.out.println("sentens : ["+sentens+"]");
		
		scan.close(); //close는 반드시

	}//main

}//class
