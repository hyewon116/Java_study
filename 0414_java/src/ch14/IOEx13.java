package ch14;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * DataInputStream / DataOutputStream 
 * - FilterStream 
 * - Data type의 형태로 data를 읽거나 쓰는 기능을 제공
 */


public class IOEx13 {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\ict01-13\\javaiotest\\io8.txt"; 
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream(path);
			dos = new DataOutputStream(fos);
			dos.writeByte(127);
			dos.writeShort(30000);
			dos.writeInt(2100000000);
			dos.writeLong(900000000000L);
			dos.writeFloat(3.14F);
			dos.writeDouble(42.195);
			dos.writeBoolean(true);
			dos.writeChar('h'); dos.writeChar(105);
			dos.writeUTF("DataOutputStream Test...");
			//-> data를 그대로 넣어서 정상적인 출력x
			
		} catch(IOException e) {//FileNotFoundException 포함
			e.printStackTrace();
		} finally {
			try {
				dos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}//finally
		

	}//main

}//class
