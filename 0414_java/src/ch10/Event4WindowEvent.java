package ch10;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Event4WindowEvent implements WindowListener{

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("창이 시작되었다는 의미."); //작동 의미 없음.
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("창을 지금 종료한다는 의미."); //이것만 작동
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("창이 종료되었다는 의미."); //작동 의미 없음.
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("창을 최소화했다는 의미."); //
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("창을 최소화를 취소했다는 의미.");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("사용자가 내 창을 클릭했다는 의미.");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("사용자가 다른 창을 클릭했다는 의미."); //다른 창 아무거나 클릭. //최소화해도 동작.
	}

	
}//class
