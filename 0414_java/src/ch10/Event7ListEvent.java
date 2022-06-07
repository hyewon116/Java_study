package ch10;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.List;

public class Event7ListEvent implements ItemListener{
	
	List list; 
	Event7ListEvent (List list) {
		this.list = list;
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) { 
	//	System.out.println(e.getItem()); //번지를 리턴.
		int idx = Integer.parseInt(e.getItem().toString()); //getItem은 object를 반환하므로 toString 필요.
		System.out.println(list.getItem(idx));
	}

}//class
