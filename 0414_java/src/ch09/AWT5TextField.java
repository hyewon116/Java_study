package ch09;

import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.Frame;
import java.awt.TextField;

public class AWT5TextField {
	
	public Frame frm;
	public BorderLayout border;
	public TextField tf;
	
	public AWT5TextField(String str) {
		frm = new Frame(str);
		tf = new TextField("최초의 문자열 셋팅");
	}
	
	public void makeGUI() {
		frm.setSize(500, 500);
		frm.setBackground(Color.orange);
		frm.setVisible(true);
		
		frm.add(tf, BorderLayout.NORTH);
	}
	
	public static void main(String[] args) {
		
		AWT5TextField test = new AWT5TextField("First Window");
		test.makeGUI();

	}//main

}//class
