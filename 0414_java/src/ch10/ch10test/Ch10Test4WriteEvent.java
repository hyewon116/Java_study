package ch10.ch10test;

import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

//저장 버튼이 클릭되면, tfd1과 tfd2와 ta에서 데이터를 가져와서 저장한다. = 저장 객체 필요
public class Ch10Test4WriteEvent implements ActionListener {
	
	//저장 객체를 만듬. = ArrayList. 저장 단위는??? Object. (따로 만들 수 있음)
	ArrayList<BoardObj> list = new ArrayList<BoardObj>();
	TextField field1, field2;
	TextArea area;
	
	public Ch10Test4WriteEvent() {}
	public Ch10Test4WriteEvent(TextField tf1, TextField tf2, TextArea ta) {
		this.field1 = tf1;
		this.field2 = tf2;
		this.area = ta;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) { //저장 버튼이 클릭되면 실행.
		String cmd = e.getActionCommand();
		if(cmd.equals("SAVE")) {
			BoardObj obj = new BoardObj(field1.getText()
								, field2.getText(), area.getText());
			list.add(obj);
			field1.setText("");
			field2.setText(""); 
			area.setText("");
			
			System.out.println(list);
		}
	}//actirnPerformed
	
}//class
