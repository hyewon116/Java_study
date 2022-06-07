package ch17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC7Prepared {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String user = "c##scott", password = "tiger";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection con = DriverManager.getConnection(url, user, password);
		
		String sql = "insert into testboard "
				+ "values(tno_seq.nextval, ?, ?, ?, sysdate)";
		PreparedStatement psmt = con.prepareStatement(sql);
		//PreparedStatement : sql 하나를 만들어놓고, 일부 데이터만 변경해서 반복으로 수행 가능
		
		psmt.setString(1, "hi"); // 1 = 물음표의 위치
		psmt.setString(2, "bts"); // 2 = 물음표의 위치 
		psmt.setString(3, "thanks everyone~"); // 3 = 물음표 위치
		int i = psmt.executeUpdate();
		System.out.println("수행 결과 : " + i);
		
		psmt.setString(1, "hello");
		psmt.setString(2, "mumin"); 
		psmt.setString(3, "nice to meet you"); 
		i = psmt.executeUpdate();
		System.out.println("수행 결과2 : " + i);
		
		psmt.close();
		con.close();

	}//main

}//class
