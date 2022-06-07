package ch14;

import java.io.File;
import java.util.ArrayList;

/*
 * File을 이용하여, 폴더 목록 만들기.
 */

public class IOEx18 {
	
	static ArrayList<File> list = new ArrayList<File>(); //변수

	public static void main(String[] args) { //메인 메소드
		
		String path = "C:\\Users\\ict01-13\\eclipse-workspace\\0414_java\\src";
		File topFile = new File(path);
		
		makeFileList(topFile);
		
		System.out.println(list.size()); // src의 폴더 갯수 - 14
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).isDirectory()) {  //ch01이 디렉토리인가? -> ch01을 list에 담음. -> 갯수 셈 ~~~-> 계속 반복
				makeFileList(list.get(i));
			}//if
		}//for
		System.out.println(list.size()); //src의 모든 하위파일 갯수 - 312
		
		for (File tmp : list) {
			System.out.println(tmp.getName());
		}//forEach
	}//main
	
	public static void makeFileList(File file) { //makeFileList 메소드
		File [] fileArr = file.listFiles();
		for (File file2 : fileArr) {
			list.add(file2);
		}//forEach
	}//makeFileList
	
}//class
