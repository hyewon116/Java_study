package ch041;

import java.util.Arrays;

public class Ch041Ex14 {
	
	public static void main(String[] args) {//9 * 9단
		
		
		int [][] strArr = new int [10][10]; //index 0 ~ 8 // 1 ~ 9로 쓰기 위해 10 사용
		for (int i = 1; i < strArr.length; i++) {
			for (int k = 1; k < strArr.length; k++) {
				strArr[i][k] = i*k;
			}//for
		}//for
		
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(Arrays.toString(strArr[1]));
		}//for
			
	}//main

}//class
