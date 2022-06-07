package ch14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * FileOutputStream
 * - NodeStream
 * - ByteStream : data를 8bit로 출력
 * - 알파벳 문화권의 언어가 아니면 출력 문자가 깨진다.
 * 
 * OutputStreamWriter
 * - Filter Stream : data 가공 및 변환
 * - data의 8bit 출력을 16bit 출력으로 변환 
 * - 문자열을 통째로 출력할 수 있다.
 */

public class IOEx06 {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\ict01-13\\javaiotest\\io5.txt";
		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
		
		try {
			fos = new FileOutputStream(path);
			osw = new OutputStreamWriter(fos);
			
			osw.write("my name is james.\n");
			osw.write("제 이름은 개인정보입니다.");
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				osw.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//finally
		
		
		
	}//main

}//class







