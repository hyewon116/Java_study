package ch052;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ch052Ex19 {

	public static void main(String[] args) {

		 Frame frm = new Frame("Anonymous Inner Class");
		 frm.setSize(500, 500);
		 frm.setBackground(Color.PINK);
		 frm.setVisible(true);
		
		 frm.addWindowListener(
				 new WindowAdapter() { //여기서 ctr + space로 windowclosing 소환함
					 @Override
					public void windowClosing(WindowEvent e) {
						System.exit(0);
					}//windowClosing
				 }//new WindowAdapter
		 );//frm.addWindowListener
		 
		 
	}//main

}//class
