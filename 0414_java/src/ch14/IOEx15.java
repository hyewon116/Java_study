package ch14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/*
 * ObjectInputStream / ObjectOutputStream
 * - Object도 input/Output 가능
 * - class type으로 만들어진 객체를 Input / Output
 * - FilterStream
 * 
 * - 주의!! ** implements Serializable!! 중요!!
 */
class IOEx15Object implements Serializable{

	private String message = "this is test object.";
	@Override
	public String toString() {
		return message;
	}
}//class

public class IOEx15 {

	public static void main(String[] args) {
		
		IOEx15Object obj = new IOEx15Object(); 
		String path = "C:\\Users\\ict01-13\\javaiotest\\io9.txt";
		FileOutputStream fos = null;
		ObjectOutputStream oos = null; 
			
		 try {
			 fos = new FileOutputStream(path);
			 oos =  new ObjectOutputStream(fos);
			 oos.writeObject(obj);
		 } catch(IOException e) {//FileNotFountException, IOException
			 e.printStackTrace();
		 } finally {
			 try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}//try
		 }//finally

	}//main
}//class
