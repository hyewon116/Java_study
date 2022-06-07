package ch14;

import java.io.FileReader;
import java.io.IOException;

/*
 * FileReader
 * - NodeStream 
 * - CharStream : 16bit data 입력
 */
public class IOEx03 {

	public static void main(String[] args) {

		String path = "C:\\Users\\ict01-13\\javaiotest\\io2.txt";
		FileReader fr = null; //나중에 new할 것이라는 의미
		try {
			fr = new FileReader(path);
			int frRead = fr.read();
			
			while (frRead != -1) { //-1 : EOF (End Of File)
				System.out.print((char) frRead);
				frRead = fr.read();
			}//while
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}//main

}//class
