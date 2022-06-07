package ch02;

/*
 * char는 정수와 호환이 가능. (c언어에서는 정수형)
 * = ascii code와 호환. (0~127)
 */

public class Ch02Ex13 {

	public static void main(String[] args) {
		
		char chVar1; //문자 하나를 저장하는 공간을 만들고 + 이름은 chVar1  
		chVar1 = 'A';//65
		System.out.println(chVar1);
		
		char chVar2 = 36;
		System.out.println(chVar2);
		
		int iVar1; //32비트 정수 공간 + 이름은 iVar1
		iVar1 = 'H';//72//자동 타입 변경 //int라서 숫자가 나옴!
		System.out.println(iVar1);
		
		int iVar2 = 88;// 88 = X
		char chVar3;//16bit 공간
		//16bit에 32bit 저장 = 자바 거부 
		chVar3 = (char) iVar2;//강제적 명시적 타입 변경
		System.out.println(chVar3);
		
	}//main

}//class
