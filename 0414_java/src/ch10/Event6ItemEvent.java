package ch10;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Event6ItemEvent implements ItemListener{

	@Override
	public void itemStateChanged(ItemEvent e) {
		System.out.println(e.getItem());
		System.out.println(e.getStateChange()); // 체크&체크 해제 여부 확인 : 1,2 같이 출력
	}
	
}
