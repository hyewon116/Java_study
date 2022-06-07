package ch09;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;

/*
 * FlowLayout : 컴포넌트를 좌에서 우로, 위에서 아래로, 물흐르듯이 배치한다.
 * 
 */

public class AWT7Flow {
	
	Frame frm; 
	FlowLayout flow;
	TextField tf1, tf2, tf3;
	
	public AWT7Flow() {
		frm = new Frame("창의 제목 입력하는 곳");
		flow = new FlowLayout();
		tf1 = new TextField("텍스트 필드의 처음 보여지는 값");
		tf2 = new TextField("텍스트 필드2");
		tf3 = new TextField("텍스트 필드3");
	}
	
	public void makeGui() {
		frm.setSize(200, 200);
		frm.setVisible(true);
		frm.setBackground(Color.PINK);
		frm.setLayout(flow);
		
		frm.add(tf1);  frm.add(tf2);  frm.add(tf3);
	}

	public static void main(String[] args) {
		
		AWT7Flow test = new AWT7Flow();
		test.makeGui();
	}

}
