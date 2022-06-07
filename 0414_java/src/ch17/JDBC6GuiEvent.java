package ch17;

import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC6GuiEvent implements ActionListener {
	
	TextField textfield1;
	TextField textfield2;
	TextArea textarea;
	String user ="c##scott", password = "tiger";
	String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
	String sql = "insert into testboard "
			+ "values(tno_seq.nextval, ?, ?, ?, sysdate)";
	Connection con;
	PreparedStatement psmt; 
	
	JDBC6GuiEvent(TextField tf1, TextField tf2, TextArea ta){
		this.textfield1 = tf1;
		this.textfield2 = tf2; 
		this.textarea = ta; 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾지 못하였습니다.");
		}
	}//constructor

	public void actionPerformed(ActionEvent e) {
		
		String cmd = e.getActionCommand();
		if(cmd.equals("SAVE")) {
			System.out.println("제목 : " + textfield1.getText());
			System.out.println("작성자 : " + textfield2.getText());
			System.out.println("내용 : " + textarea.getText());
			
			try {
			con = DriverManager.getConnection(url, user, password);
			psmt = con.prepareStatement(sql);
			psmt.setString(1, textfield1.getText());
			psmt.setString(2, textfield2.getText());
			psmt.setString(3, textarea.getText());
			int successCount = psmt.executeUpdate();
			System.out.println("successCount : " + successCount);
			} catch (SQLException sqle) {
				System.out.println("DB 접속 오류...");
			} finally {
				try {
					psmt.close();
					con.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}//finally
		
		}//if
	
	}//actionPerformed

}//class
