package ch10.ch10test;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextField;

import ch10.WindowAdapterObject;

public class Ch10Test1 {
	
	Frame frm;
	TextField tf1, tf2;
	Button btn1, btn2;
	Ch10Test1Event evnt; 
	
	Ch10Test1() {
		frm = new Frame("Up & Down");
		tf1 = new TextField("click down button");
		tf2 = new TextField();
		btn1 = new Button("Up");
		btn2 = new Button("Down");
		evnt = new Ch10Test1Event(tf1, tf2);
	}//Ch10Test1()
	
	public void makeGui() {
		frm.setSize(500, 500);
		frm.setBackground(Color.PINK);
		frm.setVisible(true);
	
		frm.setLayout(null);
		
		tf1.setBounds(10, 35, 200, 30);
		tf2.setBounds(10, 70, 200, 30);
		btn1.setBounds(215, 35, 100, 30);
		btn2.setBounds(215, 70, 100, 30);
		
		frm.add(tf1);		frm.add(tf2);
		frm.add(btn1);		frm.add(btn2);
		
		frm.addWindowListener(new WindowAdapterObject()); //ch10에 있는 WindowAdapterObject.java 파일로 연결
		btn1.addActionListener(evnt);
		btn2.addActionListener(evnt);
	}//makeGui
	
}//class






