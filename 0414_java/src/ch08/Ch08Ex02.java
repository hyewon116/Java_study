package ch08;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

//Rand : 랜덤 : 임의의 무작위 값 발생.

public class Ch08Ex02 {

	public static void main(String[] args) {
		
		//Math.random()은 항상 double 발생.
		System.out.println("Math.random() : " + Math.random());
		
		//Random은 double, int, boolean을 선택 가능.
		Random rand = new Random();
		System.out.println("rand.nextBoolean() : " + rand.nextBoolean());
		System.out.println("rand.nextDouble() : " + rand.nextDouble());
		System.out.println("rand.nextInt() : " + rand.nextInt()); // -마이너스 값도 나옴
		
		//Math.random()의 로또 발생
		System.out.println((int)(Math.random()*45 + 1));
		System.out.println("Random lotto : " + (rand.nextInt(45) + 1)); //문자열까지 + 해버리므로 괄호로 따로 묶어주기.
		
		HashSet<Integer> lotto = new HashSet<Integer>();
		while(lotto.size() < 6) {
			lotto.add(rand.nextInt(45) + 1);
		}//while
		System.out.println(lotto); //중복 없음!! set은 중복 불가!!
		
		TreeSet<Integer> lotto2 = new TreeSet<Integer>();
		while(lotto2.size() < 6) {
			lotto2.add(rand.nextInt(45) + 1);
		}//while
		System.out.println(lotto2); //TreeSet은 중복x, 정렬까지. 
		
	}//main
}//class
