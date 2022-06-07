package ch14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * FileOutputStream
 * - NodeStream
 * - ByteStream : data를 8bit로 출력
 * - 알파벳 문화권의 언어가 아니면 출력 문자가 깨진다.
 */

public class IOEx04 {
		
	public static void main(String[] args) {
		
		String path = "C:\\Users\\ict01-13\\javaiotest\\io3.txt";
		FileOutputStream fos = null;
		
		try {
			
			fos = new FileOutputStream(path);
			fos.write(104); //io3.txt 생성
			fos.write(105);
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//finally
		

	}//main

}//class
