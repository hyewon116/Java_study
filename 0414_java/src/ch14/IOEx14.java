package ch14;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * DataInputStream / DataOutputStream 
 * - FilterStream (node stream 꼭 필요!)
 * - Data type의 형태로 data를 읽거나 쓰는 기능을 제공
 */


public class IOEx14 {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\ict01-13\\javaiotest\\io8.txt"; 
		FileInputStream fis = null; //Node Stream
		DataInputStream dis = null; //Filter Stream
		
		try {
			fis = new FileInputStream(path); 
			dis = new DataInputStream(fis);
			System.out.println(dis.readByte());
			System.out.println(dis.readShort());
			System.out.println(dis.readInt());
			System.out.println(dis.readLong());
			System.out.println(dis.readFloat());
			System.out.println(dis.readDouble());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readChar());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
			//메모장 출력과 다르게 정상 입력됨. 
			
		} catch(IOException e) {//FileNotFoundException 포함
			e.printStackTrace();
		} finally {
			try {
				dis.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}//finally
	}//main
}//class
