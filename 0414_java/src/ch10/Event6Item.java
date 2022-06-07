package ch10;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;

public class Event6Item {
	
	Frame frm;
	Checkbox box1, box2, radio1, radio2;	
	Choice choice1;
	CheckboxGroup group;
	
	Event6Item() {
		frm = new Frame("설문");
		choice1 = new Choice();
		box1 = new Checkbox("Apple");	box2 = new Checkbox("Orange", true); //true = 기본 체크됨!!
		group = new CheckboxGroup();
		radio1 = new Checkbox("Soccer", false, group);  
		radio2 = new Checkbox("Baseball", true, group);
		//라디오 버튼 만들기 
		// 1) CheckboxGroup 생성
		// 2) Checkbox(이름, 디폴트 체크 여부, 그룹에 속해있음을 표시)
	}
	public void makeGui() {
		frm.setSize(500, 500);
		frm.setVisible(true);
		frm.setLayout(null);
		
		choice1.setBounds(10, 35, 200, 50);
		frm.add(choice1);
		choice1.add("KOREA"); choice1.add("USA"); choice1.add("UK");
		
		box1.setBounds(10, 100, 100, 30);
		box2.setBounds(120, 100, 100, 30);
		frm.add(box1);
		frm.add(box2);
		
		radio1.setBounds(10, 150, 100, 30);
		radio2.setBounds(120, 150, 100, 30);
		frm.add(radio1);
		frm.add(radio2);
		
		frm.setBackground(Color.PINK);
	}//makeGui
	
	public void addEvent() {
		frm.addWindowListener(new WindowAdapterObject());
		choice1.addItemListener(new Event6ItemEvent());
		box1.addItemListener(new Event6ItemEvent());
		box2.addItemListener(new Event6ItemEvent());
		radio1.addItemListener(new Event6ItemEvent());
		radio2.addItemListener(new Event6ItemEvent());
	}//addEvent
	
	public static void main(String[] args) {
		
		Event6Item test = new Event6Item();
		test.makeGui();
		test.addEvent();
		
		
	}//main

}//class
