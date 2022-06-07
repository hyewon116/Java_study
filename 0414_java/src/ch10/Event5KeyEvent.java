package ch10;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Event5KeyEvent implements KeyListener{
	
	//키보드를 누르고 있으면 pressed&typed 계속 발생. 키를 떼야 Released 발생.
	//Released 적극 활용!!
	@Override
	public void keyTyped(KeyEvent e) {
	//	System.out.println("keyTyped!!!!!!!!!!!");
	}

	@Override
	public void keyPressed(KeyEvent e) {
	//	System.out.println("keyPressed");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("========> keyReleased");
		System.out.println(e.getKeyCode()); //중요!!★★getKeyCode 
		//ascii code 번호 출력 //10 = enter //32 = space bar
		System.out.println(e.getKeyChar()); 
		
	}
	
	
}//class
