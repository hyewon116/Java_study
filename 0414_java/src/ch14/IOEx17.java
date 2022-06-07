package ch14;

import java.io.File;

/*
 * File : 파일 하나를 지정 또는 폴더 하나를 지정하는 객체.
 * ★ 중요 예제!! 이건 기억하기
 */
public class IOEx17 {

	public static void main(String[] args) {

		String pathFile = "C:\\Users\\ict01-13\\javaiotest\\io9.txt";
		String pathFolder = "C:\\Users\\ict01-13\\javaiotest";
		File file = new File(pathFolder);
		
		System.out.println("isFile : " + file.isFile()); //파일인가?를 질문 //false
		System.out.println("isDirectory : " + file.isDirectory()); //디렉토리인가?를 질문 //true
		System.out.println(); //파일이나 폴더의 권한은 3개 = rwx : read, write, excute(실행) 
		System.out.println("canRead : " + file.canRead());
		System.out.println("canWrite : " + file.canWrite());
		System.out.println("canExecute : " + file.canExecute());
		System.out.println();
		System.out.println("getPath : " + file.getPath());
		System.out.println("getAbsolutePath : " + file.getAbsolutePath()); // 절대 경로 
		System.out.println();
		System.out.println("getName : " + file.getName()); //폴더 이름 
		System.out.println("getParent : " + file.getParent()); //부모의 이름을 문자열로 알려준다. 
		System.out.println("getParentFile " + file.getParentFile()); //부모 객체를 File 객체로 만들어준다.
		System.out.println();
		String [] fileList = file.list();
		for (String string : fileList) { //fileList의 문자열을 하나씩 끄집어냄. //forEach 함수
			System.out.println(string);
		}//forEach
		System.out.println("=================");
		File file2 = new File(pathFile);
		file2.delete();//io9.txt 삭제
		System.out.println("=================");
		File [] fileArr = file.listFiles();
		for (File file3 : fileArr) { //fileList의 파일을 하나씩 끄집어냄. //forEach 함수
			System.out.println(file3.getName());
		}//forEach
	}//main
}//class
