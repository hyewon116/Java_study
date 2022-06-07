package ch14.test;

import java.awt.FileDialog;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MemoPadEvent extends WindowAdapter implements ActionListener { //Adapter = Listener를 구현한 것.

	FileDialog fileDialog4Open, fileDialog4Save;
	TextArea text;
		
	MemoPadEvent(FileDialog fd1, FileDialog fd2, TextArea ta) {
		fileDialog4Open = fd1;
		fileDialog4Save = fd2;
		text = ta;
	}//생성자
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if(cmd.equals("Save")) {
			fileDialog4Save.setVisible(true);
			File path = null;
			try {
				path = fileDialog4Save.getFiles()[0]; //선언과 생성 분리
			} catch (ArrayIndexOutOfBoundsException ae) {
				System.out.println("파일 선택을 취소하셨습니다.");
				return;
			} 
			PrintWriter pw = null;
			try {
				pw = new PrintWriter(path);
				pw.println(text.getText());
			} catch (IOException ioe) {
				ioe.printStackTrace();
			} finally {
			pw.close();
			}//finally
		}//if("Save") 
		else if(cmd.equals("Open")) {
			fileDialog4Open.setVisible(true);
			File openPath = null;
			try {
				openPath = fileDialog4Open.getFiles()[0];
			} catch(ArrayIndexOutOfBoundsException ae) {
				System.out.println("파일 선택을 취소하셨습니다.");
				return;
			}//try 
			
			FileReader fr = null;
			BufferedReader br = null;
			try {
				fr = new FileReader(openPath);
				br = new BufferedReader(fr);
				StringBuilder sb = new StringBuilder("");
				String readLine = br.readLine();
				while(readLine != null) {
					sb.append(readLine + "\n");
					readLine = br.readLine();
				}//while
				text.setText(sb.toString());
			} catch(IOException ioe) {
				ioe.printStackTrace();
			} finally {
				try {
					br.close();
					fr.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}//finally
		}//else if("Open")
		else if(cmd.equals("Exit")) {
			System.exit(0);
		}//else if("Exit")
	}//actionPerformed
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}//windowClosing
	

}//class
