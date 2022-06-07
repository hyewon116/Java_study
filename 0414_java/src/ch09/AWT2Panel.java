package ch09;

import java.awt.Color;

import java.awt.Frame;
import java.awt.Panel;

public class AWT2Panel {
	
	public Frame frm;
	public Panel p1;
	
	public AWT2Panel(String str) {
		frm = new Frame(str);
		p1 = new Panel();
	}
	
	public void makeGUI() {
		frm.setSize(500, 500);
		frm.setBackground(Color.orange);
		frm.setVisible(true);
		
		p1.setBackground(Color.lightGray);
		frm.add(p1);
	}
	
	public static void main(String[] args) {
		
		AWT2Panel test = new AWT2Panel("First Window");
		test.makeGUI();

	}//main

}//class
