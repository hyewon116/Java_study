package ch14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
public class IOEx16 {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\ict01-13\\javaiotest\\io9.txt";
		FileInputStream fis = null;
		ObjectInputStream ois = null;
	
		try {
			fis = new FileInputStream(path);
			ois = new ObjectInputStream(fis);
			Object obj = ois.readObject();

			System.out.println(obj.toString()); //방법 1
			IOEx15Object testObj = (IOEx15Object) obj;
			System.out.println(testObj.toString()); //방법 2
			
		} catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
				fis.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		
	}//main
}//class
