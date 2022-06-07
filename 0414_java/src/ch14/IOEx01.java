package ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * package java.io.*; -> IO
 * Input / Output + Stream : data가 물처럼 흘러간다.
 *  - Input / Output은 상대적인 개념 ★★
 *  - Stream : data의 흐름을 의미.
 *  - Input Stream : 현재 코드로 data가 들어온다.
 *  - Output Stream : 현재 코드에서 data가 나간다.
 *  
 *  Byte Stream 
 *  - data의 입출력 단위가 8bit.  
 *  - 이름이 ~InputStream, ~OutputStream 이 모두 여기에 해당 
 *  Char Stream 
 *  - data의 입출력 단위가 16bit.
 *  - 이름이 ~Reader, ~Writer
 *  
 *  Node Stream 
 *  - data source와 data destination를 연결하는 개념
 *  - FileInputStream, FileOutputStream, FileReader, FileWriter
 *  Filter Stream 
 *  - data의 가공이나, 특수 기능 제공을 목적으로 하는 Stream의 개념.
 *  - InputStreamReader(8bit -> 16bit로 변환), OutputStreamWriter(8bit -> 16bit로 변환)
 *  - Node Stream 없이 독립적으로 존재할 수 없다.
 *  
 *  주의!!! 반드시 close 해야 한다.
 *  - close는 입출력 객체를 메모리에서 삭제 요청하는 행위.
 *  - close를 하지 않으면, 메모리에 사용하지 않는 입출력 객체가 누적된다.
 */

public class IOEx01 {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\ict01-13\\javaiotest\\io1.txt";
		FileInputStream fis = null; //try~catch문 때문에(지역변수 때문에) 만든 선언/초기화 문장. 
 		try { 
			fis = new FileInputStream(path); 
			//파일을 못 찾을 수 있으므로 try~catch 해주라는 경고문 뜸.
			//+ fis가 지역변수가 되어 버리므로 위에 따로 초기화 해줘야 함.
		
			int fisRead = fis.read();
			System.out.println("fisRead : " + fisRead); // 104 (ascii code 출력. 한 글자만 출력.) -> while문 필요
			System.out.println("(char) fisRead : " + (char) fisRead); // char로 casting = h
			
//			fisRead = fis.read();
//			System.out.println("fisRead : " + fisRead); //반복하면 다음 글자 출력
//			System.out.println("(char) fisRead : " + (char) fisRead);
			
			while(fisRead != -1) { //-1 : EOF (End Of File : 참고->EOFException도 있다.)
				System.out.print((char) fisRead);
				fisRead = fis.read();
			}
		} catch (FileNotFoundException e) { //FileNotFoundException = IOException의 자식. 이건 생략해도 됨.
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally { //fis.close()도 exception 유발. 
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//finally
		

	}//main
}//class
