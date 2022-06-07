package ch08;

import java.util.Random;
import java.util.TreeSet;

public class Lottotest {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		TreeSet<Integer> lotto2 = new TreeSet<Integer>();
		while(lotto2.size() < 6) {
			lotto2.add(rand.nextInt(45) + 1);
		}//while
		System.out.println(lotto2);
	}

}
