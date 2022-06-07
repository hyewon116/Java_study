package ch15;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 인터넷의 기본 개념 : IP Address, IP Port 
 *  IP Address : 네트워크 상에서 컴이 갖는 주소.
 *  IP Port : 컴퓨터 내의 하나의 프로그램이 갖는 외부 통신 번호. 
 *           : 수신인 = 받는 사람의 개념. 
 *           ex) chrome의 통신 번호와 edge의 통신 번호는 다르다.
 * Loop Back Address 
 *   내 컴을 표현하는 주소의 또 다른 방법.
 *   127.0.0.1 
 *   localhost
 *   
 * Socket : 데이터 통신의 통로 역할.
 *   데이터를 보내는 쪽과 받는 쪽 모두 있어야 한다.
 *   실제 데이터 통신. 연결 확립.
 *   
 * ServerSocket : 접속을 대기하는 역할.
 *  접속 대기만 한다.
 *  접속 성공 후에는 Socket을 통해 통신한다.
 *  3way handshake를 통해 연결 통로를 확보한다.
 *  서버 프로그램을 개발할 때 쓰이는 클래스
 *  
 *  ** socket 개념은 원래 c언어 개념 
 */

public class SimpleServer1 {

	public static void main(String[] args) throws IOException {
		
		ServerSocket ss = new ServerSocket(5432);
		Socket soc = null;
		OutputStream os = null; 
		DataOutputStream dos = null; 
		
		while(true) {
			soc = ss.accept();//5432로 연결 요청이 들어오면, 요청을 승낙하고 socket 생성. 
			os = soc.getOutputStream();//socket이 가진 기본 연결 기능을 가져오는 표현.
			dos = new DataOutputStream(os);
			dos.writeUTF("server accept test...");
			dos.close();
			os.close();
		}//while 
	}//main
}//class

