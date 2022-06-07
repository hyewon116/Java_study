package ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
/* 한글 텍스트 불러오는 예제!!!
/*
 * FileInputStream 
 * - Node Stream
 * - 파일을 연결해서 읽어오는 Stream.
 * - 8bit 입력
 * - 비영어권 문자가 깨지는 단점.
 * 
 * InputStreamReader 
 * - Filter Stream
 * - 기능 : data 변환
 * - 8bit 입력을 16bit로 전환. 
 * 
 * FileInputStream을 InputStreamReader로 filtering하면 비영어권 문자를 읽을 수 있다.
 * 
 * 주의!! : close는 생성의 역순 : 나중에 생성한 Stream을 먼저 close한다!!
 * 
 */
public class IOEx02 {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\ict01-13\\javaiotest\\io2.txt";
		FileInputStream fis = null;
		InputStreamReader isr = null;
		
		try {
			fis = new FileInputStream(path);
			isr = new InputStreamReader(fis); //Filter Stream은 꼭 Node Stream이 있어야 함!!
			
			int isrRead = isr.read();
			while(isrRead != -1) {// -1 : EOF(End Of File)
				System.out.print((char) isrRead);
				isrRead = isr.read();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				isr.close();//나중에 생성한 Stream을 먼저 close한다.
				fis.close(); 
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}//finally
		
		
		
	}//main

}//class
