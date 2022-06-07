package ch10;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class Event8Dialog {

	Frame frm;
	MenuBar menuBar;
	Menu menu;
	MenuItem menuItem1, menuItem2, menuItem3;
	Dialog dia;
	Event8DialogEvent event;
	WindowAdapterObject closeEvent;
	Label label;
	Button btn;
	
	Event8Dialog() {
		frm = new Frame("메뉴");
		menuBar = new MenuBar(); //메뉴를 붙일 수 있는 공간
		menu = new Menu("Home");
		menuItem1 = new MenuItem("Open");
		menuItem2 = new MenuItem("Save");
		menuItem3 = new MenuItem("Exit");
		dia = new Dialog(frm, "confirm", true); //true : modal 
		//modal : sub창이 실행 중일 때, 메인 창을 클릭할 수 있는가? 
		//modal true : sub창이 실행 중일 때, 클릭 불가 
		//modal false : sub창이 실행 중일 때, 클릭 가능
		event = new Event8DialogEvent(dia); //Dialog를 만든 후에 event를 만들어야 함. 순서 기억!!
		closeEvent = new WindowAdapterObject();
		label = new Label("Relly Exit???");
		btn = new Button(" O K ");
		
	}//AWT9Menu()
	
	public void makeGui() {
		frm.setSize(300,300);  //frame을 만든 후에 사이즈를 정해야 함. 순서 기억!
		frm.setVisible(true);
		
		frm.setMenuBar(menuBar);
		menuBar.add(menu);
		menu.add(menuItem1);
		menu.add(menuItem2);
		menu.addSeparator();
		menu.add(menuItem3);
		
		dia.setSize(100, 90);
		dia.add(label, BorderLayout.NORTH);
		dia.add(btn, BorderLayout.SOUTH);
		
	}//makeGui
	
	public void addEvent() {
		frm.addWindowListener(closeEvent);
		menuItem3.addActionListener(event);
		dia.addWindowListener(closeEvent);  
		btn.addActionListener(event);
		
		//윈도우 창은 WindowListener.. 버튼 등은 ActionListener.. 헷갈리지 말자.
	}//addEvent
	
	public static void main(String[] args) {
		
		Event8Dialog test = new Event8Dialog();
		test.makeGui();
		test.addEvent();
		
	}//main
}//class
