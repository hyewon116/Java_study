package ch14;

import java.io.File;

public class IOEx12 {

	public static void main(String[] args) {

		//File이 폴더로 지정되는 경우의 예.
		File folder = new File("C:\\Users\\ict01-00\\javaiotest");
		String [] strArr = folder.list();
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}//for

	}//main

}//class