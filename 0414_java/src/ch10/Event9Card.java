package ch10;

//클릭하면 화면이 바뀌게 하는 법

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;

public class Event9Card {

	Frame frm;
	MenuBar menuBar; 
	Menu menu;
	MenuItem menuItem1, menuItem2, menuItem3;
	CardLayout card;
	Panel pan1, pan2, pan3;
	Event9CardEvent event;
	
	Event9Card() {
		frm = new Frame("메뉴");
		menuBar = new MenuBar();
		menu = new Menu("Home");
		menuItem1 = new MenuItem("Regist");
		menuItem2 = new MenuItem("List");
		menuItem3 = new MenuItem("Exit");
		card = new CardLayout();
		pan1 = new Panel();
		pan2 = new Panel();
		pan3 = new Panel();
		event = new Event9CardEvent(card, frm);
		
	}//AWT9Menu()
	
	public void makeGui() {
		frm.setLayout(card);//CardLayout 적용.
		frm.setSize(300,300);
		frm.setVisible(true);
		
		frm.setMenuBar(menuBar);
		menuBar.add(menu);
		menu.add(menuItem1);
		menu.add(menuItem2);
		menu.addSeparator();
		menu.add(menuItem3);
		
		pan1.setBackground(Color.RED);
		pan2.setBackground(Color.PINK);
		pan3.setBackground(Color.ORANGE);
		frm.add(pan1);		frm.add(pan2);		frm.add(pan3);
		
	}//makeGui
	
	public void addEvent() {
		frm.addWindowListener(new WindowAdapterObject());
		menuItem1.addActionListener(event);
		menuItem2.addActionListener(event);
		
	}//addEvent

	public static void main(String[] args) {
		
		Event9Card test = new Event9Card();
		test.makeGui();
		test.addEvent();

	}//main

}//class
