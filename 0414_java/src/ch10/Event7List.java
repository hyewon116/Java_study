package ch10;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.List;

public class Event7List {
	
	Frame frm;
	List list;//꼭 awt.list로 import!! (util 아님!)
	
	Event7List() {
		frm = new Frame("제목 옵니다.");
		list = new List(5, false); //5줄 짜리 
		                           //false : multipleMode : 하나씩 선택
		                           //true : 전부 선택됨
	}
	
	public void makeGui() {
		frm.setSize(300,300);
		frm.setBackground(Color.LIGHT_GRAY);
		frm.setVisible(true);
		
		frm.add(list, BorderLayout.CENTER);
		list.add("Apple");
		list.add("banana");
		list.add("Mango");
	}
	
	public void addEvent() {
		frm.addWindowListener(new WindowAdapterObject());
		list.addItemListener(new Event7ListEvent(list));
	}
	
	public static void main(String[] args) {
		Event7List test = new Event7List();
		test.makeGui();
		test.addEvent();
	
	}//main

}//class
