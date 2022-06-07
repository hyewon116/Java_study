package ch10;

//종료 확인 창 뜨게 하는 법
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event8DialogEvent implements ActionListener{
	
	Dialog dialog;
	
	Event8DialogEvent(Dialog d) {
		this.dialog = d;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if(cmd.equals("Exit")) { //버튼에 설정한 이름 그대로 와야 함!
			dialog.setVisible(true);
		} else if(cmd.equals(" O K ")) {
			System.exit(0);
		}
		
	}//actionPerformed
}//class
