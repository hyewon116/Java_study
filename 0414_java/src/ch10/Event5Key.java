package ch10;

import java.awt.BorderLayout;
import java.awt.Color;
//생성자는 딱 한번만 실행됨. ex) frame이 여러 개 만들어지면 안 되므로 생성자에 new를 위치시킴.
import java.awt.Frame;
import java.awt.TextField;

public class Event5Key {
	
	Frame frm;
	TextField tf;
	
	Event5Key() {
		frm = new Frame("제목 옵니다.");
		tf = new TextField();
	}
	
	public void makeGui() {
		frm.setSize(300,300);
		frm.setBackground(Color.LIGHT_GRAY);
		frm.setVisible(true);
		frm.add(tf, BorderLayout.NORTH);
	}
	
	public void addEvent() {
		frm.addWindowListener(new WindowAdapterObject());
		tf.addKeyListener(new Event5KeyEvent());
	}
	
	public static void main(String[] args) {
		Event5Key test = new Event5Key();
		test.makeGui();
		test.addEvent();
	
	}//main

}//class
