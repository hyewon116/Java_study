package ch17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC3Insert {

	public static void main(String[] args)
			throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");

		String user = "c##scott", password = "tiger";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection con = DriverManager.getConnection(url, user, password);

		Statement stmt = con.createStatement();
		String sql = "insert into testboard "
				+ "values(tno_seq.nextval, '제목', '작성자', '내용', sysdate)";

		int successCount = stmt.executeUpdate(sql);//1:성공, 0:실패.
		System.out.println("insert : " + successCount);
		//stmt.execute... : select->ResultSet.
		//stmt.execute... : insert/update/delete->성공 건수.

		stmt.close();
		con.close();

	}//main

}//class