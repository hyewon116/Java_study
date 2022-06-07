package ch09;

import java.awt.Color;
/*
 * AWT : Abstract Window Toolkit : 윈도우 화면을 만드는 도구상자
 *  - container : 다른 객체를 담는 일종의 그림판 (Frame, Panel)
 *  - layout : 그림판 위에 객체의 위치를 정해주는 개념
 *  - Components : 그림판 위에 올라가는 객체들 (Button, CheckBox 등)
 *  - menu : 메뉴 : MenuBar, Menu, MenuItem
 */
/* 
 * Frame 주의 사항
 * - 반드시 setVisiable(true); 
 * - Frame은 두 개 이상 같이 사용 안 됨.
 * - add()를 통해서 다른 components를 붙일 수 있음.
 * - 
 */
import java.awt.Frame;

public class AWT1Frame {
	
	public Frame frm;
	
	public AWT1Frame(String str) {
		frm = new Frame(str);
	}
	
	public void makeGUI() {
		frm.setSize(500, 500);
		frm.setBackground(Color.orange);
		frm.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		AWT1Frame test = new AWT1Frame("First Window");
		test.makeGUI();

	}//main

}//class
