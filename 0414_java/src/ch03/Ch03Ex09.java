package ch03;

/*
 * shift 연산자 (비트 연산) 
 * - 사용 이유 : 작은 메모리 활용. (ex. 반도체 / 일반적으론 안 씀)
 *          부호 64 32 16  8  4  2  1
 * 4      :  0  0  0  0   0  1  0  0
 * 4 >> 2 :  0  0  0  0   0  0  0  1 : right shift : 새로운 자리는 0으로 채움
 * 4 << 2 :  0  0  0  1   0  0  0  0 : left shift : 새로운 자리는 0으로 채움
 * -4 >> 2 : 1  0  0  0   0  0  0  1 : 
 * >>> : unsigned right shift : 새로운 자리는 부호로 채움
 */

public class Ch03Ex09 {

	public static void main(String[] args) {
		System.out.println(4>>2);
		System.out.println(4<<2);
		System.out.println(-4>>2);
		

	}//main

}//class
