package ch14;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/*
 * FileWriter
 * - NodeStream
 * - CharStream : data를 16bit로 출력
 * - 비 알파벳 문화권의 문자를 출력할 수 있다.
 */

public class IOEx08 {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\ict01-13\\javaiotest\\io7.txt";
		FileWriter fw = null;
		Scanner scan = new Scanner(System.in);
		String inStr = "";
		
		try {
			fw = new FileWriter(path);
			while(!inStr.equals("종료")) {//종료 조건은 <종료> 입력.
				System.out.print("종료 조건은 <종료> 입력, 문장 입력 : ");
				inStr = scan.nextLine();
				fw.write(inStr + "\n");
			}//while
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
				scan.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//finally
		
		
		
	}//main

}//class







