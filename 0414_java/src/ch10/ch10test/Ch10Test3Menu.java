package ch10.ch10test;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

import ch10.WindowAdapterObject;

public class Ch10Test3Menu {

	/*
	 * 메뉴 + 파일 다이얼로그
	 *  -> 메뉴바 만들기
	 *  -> 파일 불러오기할 수 있는 파일 다이얼로그 만들기 
	 *  
	 */
	Frame frm;
	MenuBar menuBar;
	Menu menu;
	MenuItem menuItem1, menuItem2, menuItem3;
	FileDialog openFile;
	Ch10Test3Event event;

	Ch10Test3Menu(){
		frm = new Frame("메뉴 이벤트");  // 창 제목
		menuBar = new MenuBar(); 
		menu = new Menu("Home"); 
		menuItem1 = new MenuItem("Open");
		menuItem2 = new MenuItem("Save");
		menuItem3 = new MenuItem("Exit");
		openFile = new FileDialog(frm, "My File Open"); //(부모창, "파일 다이얼로그 제목")
		event = new Ch10Test3Event(openFile);
		
	}//AWT9Menu()

	public void makeGui() {
		frm.setSize(300, 300);
		frm.setBackground(Color.PINK);
		frm.setVisible(true);

		frm.setMenuBar(menuBar);
		menuBar.add(menu);
		menu.add(menuItem1);
		menu.add(menuItem2);
		menu.addSeparator(); // 구분선 표시 -> 자유롭게 위치 변경 가능
		menu.add(menuItem3);
		
		addEvent();
		
	}//makeGui
	
	public void addEvent() {
		frm.addWindowListener(new WindowAdapterObject()); // 창에서 x 표시 누르면 꺼짐.
		menuItem1.addActionListener(event);
		menuItem3.addActionListener(event); // exit 메뉴 누르면 꺼짐.
	}//addEvent

}//AWT9Menu









