package ch10;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class Event3MouseMotionEvent 
						implements MouseMotionListener, MouseWheelListener{
	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		System.out.println("마우스 휠이 굴러가네요.");
	}

	@Override
	public void mouseDragged(MouseEvent e) { //움직이는 동안 좌표찍기
		System.out.println("dragged : " + e.getX() + " : " + e.getY());
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("moved : " + e.getX() + " : " + e.getY());
	}


}
