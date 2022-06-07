package ch10;

import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Event3MouseEvent implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) { //Clicked은 dragged 등이랑 같이 쓰면 오류가 나서, 잘 안씀.
		System.out.println("==========> clicked");
	}
	@Override
	public void mousePressed(MouseEvent e) { //마우스 누른 상태일 때 
		System.out.println("1. pressed"); 
	}
	@Override
	public void mouseReleased(MouseEvent e) { //마우스를 뗐을 때 
		System.out.println("2. mouseReleased");
	}
	@Override
	public void mouseEntered(MouseEvent e) {
	//	System.out.println("프레임의 안으로 마우스 커서가 들어왔습니다.");
	}
	@Override
	public void mouseExited(MouseEvent e) {
	//	System.out.println("마우스가 프레임 밖으로 나갔습니다.");
	}
}//class
