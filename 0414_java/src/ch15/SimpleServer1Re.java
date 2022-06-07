package ch15;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * Server : 서비스를 제공하는 객체. ex) 네이버 웹툰
 * Client : 서비스를 요청하는 객체. 
 * 
 * Serversocket : 연결 요청을 받는 역할만 하는 객체 (=기다리는 역할. 문지기) 
 * socket : -실제 데이터 통신 
 *          -연결 확립 : 서버와 클라이언트가 서로의 IP address, port를 알고 있다.
 */

public class SimpleServer1Re {

	public static void main(String[] args) throws IOException {
		
		//Serversocket: 연결 요청을 받는 역할만 하는 객체 (=기다리는 역할. 문지기)
		ServerSocket ss = new ServerSocket(9876);
		//Socket : 실제 데이터 통신 //연결 확립 : 서버와 클라이언트가 서로의 IP address, port를 알고 있다.

		while(true) { //while은 왜 쓰는 걸까..?
			Socket s = ss.accept();
			OutputStream os = s.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			
			dos.writeUTF("second server test...");
			
			dos.close();
			os.close();
			s.close(); //socket은 일회성이라 살려둘 필요 x 
		}//while
	}//main
}//class
