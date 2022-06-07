package ch09;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;

/*
 * NullLayout : 기존의 Layout을 없애고 자유롭게 배치한다.
 *  - Frame이 기본 Layout이 BorderLayout이므로, 기존 Layout을 지운다.
 */

public class AWT8null {
	
	Frame frm; 
	TextField tf1, tf2, tf3;
	
	public AWT8null() {
		frm = new Frame("창의 제목 입력하는 곳");
		tf1 = new TextField("텍스트 필드의 처음 보여지는 값");
		tf2 = new TextField("텍스트 필드2");
		tf3 = new TextField("텍스트 필드3");
	}
	
	public void makeGui() {
		frm.setSize(500, 500);
		frm.setVisible(true);
		frm.setBackground(Color.PINK);
		
		frm.setLayout(null);
		frm.add(tf1);  frm.add(tf2);  frm.add(tf3);
		tf1.setBounds(10, 50, 100, 100); //앞의 두 개가 시작 x, y 좌표 //뒤의 두 개가 좌우, 상하 크기
		tf2.setBounds(115, 50, 100, 100); 
		tf3.setBounds(115, 155, 100, 100); //컴포넌트의 위치를 직접 지정
	}

	public static void main(String[] args) {
		
		AWT8null test = new AWT8null();
		test.makeGui();
	}

}
