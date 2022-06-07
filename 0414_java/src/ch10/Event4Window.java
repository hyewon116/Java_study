package ch10;

import java.awt.Color;
//생성자는 딱 한번만 실행됨. ex) frame이 여러 개 만들어지면 안 되므로 생성자에 new를 위치시킴.
import java.awt.Frame;

public class Event4Window {
	
	Frame frm;
	Event4Window() {
		frm = new Frame("제목 옵니다.");
	}
	
	public void makeGui() {
		frm.setSize(300,300);
		frm.setBackground(Color.LIGHT_GRAY);
		frm.setVisible(true);
	}
	
	public void addEvent() {
		frm.addWindowListener(new Event4WindowEvent());
	}
	
	public static void main(String[] args) {
		Event4Window test = new Event4Window();
		test.makeGui();
		test.addEvent();
	
	}//main

}//class
