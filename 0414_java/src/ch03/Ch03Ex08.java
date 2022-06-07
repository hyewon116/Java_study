package ch03;

/*
 * 비트 연산
 * & : and (참 & 참 -> 참, 나머지는 거짓) 
 * | : or (거짓 | 거짓 -> 거짓, 나머지는 참)
 * ^ : xor (좌우값이 다르면 참, 같으면 거짓)
 * 42 :  0  1  0  1  0  1  0 
 * 60 :  0  1  1  1  1  0  0
 *      64 32  16 8  4  2  1 
 * & :   0  1  0  1  0  0  0  --> 40
 * | :   0  1  1  1  1  1  0  --> 62
 * ^ :   0	0  1  0  1  1  0  --> 22
 * 
 */

public class Ch03Ex08 {
		
	public static void main(String[] args) {
		
	System.out.println(42 & 60);
	System.out.println(42 | 60);
	System.out.println(42 ^ 60);

	}//main

}//class
