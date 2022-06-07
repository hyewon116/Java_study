package ch14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * BufferedReader
 *  - FilterStream
 *  - 한 줄씩 읽는 기능
 * ★★★ PrintWriter : 중요!!
 *  - NodeStream + FilterStream
 *  - println 기능 보유
 */
public class IOEx11 {

	public static void main(String[] args) {
		
		String inPath = "C:\\Users\\ict01-13\\javaiotest\\sweden.txt";
		String outPath = "C:\\Users\\ict01-13\\javaiotest\\swedencopy3.txt";
		FileReader fr = null;   BufferedReader br = null;
		PrintWriter pw = null;
	
		try {
			fr = new FileReader(inPath);
			br = new BufferedReader(fr);
			pw = new PrintWriter(outPath);
			
			String str = br.readLine(); //한 줄씩 읽어오기.
			
			while(str != null) { //null : EOF 
				System.out.println(str);
				pw.println(str);
				str = br.readLine();
			}//while
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();	fr.close();	pw.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}//finally
		
	}//main

}//class
