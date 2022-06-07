package ch03;
/*
 *  증감연산자 : ++, -- 
 *   - 자기 자신의 값을 하나 올리거나(++) 내리는(--) 역할
 */
public class Ch03Ex04 {

	public static void main(String[] args) {
		
		int iVar1 = 8;
		iVar1++;
		System.out.println("iVar++ 1회 결과 : " + iVar1);
		
		int iVar2 = 8;
		iVar2--;//자신의 값을 하나 내림
		System.out.println("iVar-- 1회 결과 : " + iVar2);
		
		//증감 연산자의 전위(앞에 위치) : 값을 올리고 나머지를 수행
		int iVar3 = 8;
		int result1 = ++iVar3 * 3;//연산자가 3개
		System.out.println("++8 * 3 : " + result1);
		//8을 ++해서 * 3 = 27
		//증감이 전위 연산일 때는 같은 라인의 모든 연산자 중 가장 먼저 수행.
		//iVar3가 9가 된 후에 *, = 수행
		
		//증감 연산자의 후위(뒤에 위치) : 나머지를 수행하고 값을 올린다.
		int iVar4 = 8;
		int result2 = iVar4++ * 3;
		System.out.println("8++ * 3 : " + result2);
		System.out.println("iVar4 : " + iVar4);
		//8*3 = 24 하고 나서 8++ 한다.
		//증감이 후위 연산일 때는 같은 라인의 모든 연산자 중 가장 마지막에 수행.
		//iVar가 8일 때 *, = 수행 -> 그리고 나서 iVar4가 9가 됨.

	}//main

}//class
