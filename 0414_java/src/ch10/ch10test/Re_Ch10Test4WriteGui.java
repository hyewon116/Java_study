package ch10.ch10test;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;

import ch10.WindowAdapterObject;

public class Re_Ch10Test4WriteGui {
	
	Frame frm;
	Label la1, la2, la3;
	TextField tfd1, tfd2;
	TextArea ta; 
	Button btn;
	Re_Ch10Test4WriteEvent event;

	public Re_Ch10Test4WriteGui() {
		
		frm = new Frame("게시판!!");
		la1 = new Label("Title");
		la2 = new Label("Write");
		la3 = new Label("Contents");
		tfd1 = new TextField();
		tfd2 = new TextField();
		ta = new TextArea(5, 100);
		btn = new Button("SAVE");
		event = new Re_Ch10Test4WriteEvent(tfd1, tfd2, ta);
	}
	
	public void makeGui() {
		
		frm.setLayout(null);
		frm.setSize(300,300);
		frm.setVisible(true);
		
		la1.setBounds(10, 35, 60, 30);     	frm.add(la1);
		tfd1.setBounds(75, 35, 120, 30);		frm.add(tfd1);
		la2.setBounds(10, 70, 60, 30);     	frm.add(la2);
		tfd2.setBounds(75, 70, 120, 30);		frm.add(tfd2);
		la3.setBounds(10, 105, 60, 30);		frm.add(la3);
		ta.setBounds(10, 140, 255, 100); 	frm.add(ta);
		btn.setBounds(215, 245, 50, 30);	frm.add(btn);
		
		frm.setBackground(Color.DARK_GRAY);
		setEvent();
	}
	
	public void setEvent() {
		frm.addWindowListener(new WindowAdapterObject());
		btn.addActionListener(event);
	}
	
}
