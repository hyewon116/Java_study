package ch10.ch10test;

import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Re_Ch10Test4WriteEvent implements ActionListener {
	
	ArrayList<Re_BoardObj> list = new ArrayList<Re_BoardObj>();
	TextField tfd1, tfd2;
	TextArea ta;
	
	Re_Ch10Test4WriteEvent () {}
	Re_Ch10Test4WriteEvent (TextField tfd1, TextField tfd2, TextArea ta) {
		this.tfd1 = tfd1;
		this.tfd2 = tfd2;
		this.ta = ta;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals("SAVE")) {
			Re_BoardObj obj = new Re_BoardObj(tfd1.getText(), 
					tfd2.getText(), ta.getText());
			
			list.add(obj);
			tfd1.setText("");
			tfd2.setText(""); 
			ta.setText("");
			
			System.out.println(list);	
		}
	}
}
