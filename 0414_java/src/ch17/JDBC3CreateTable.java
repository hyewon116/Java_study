package ch17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC3CreateTable {

	public static void main(String[] args) 
			throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String user = "c##scott", password = "tiger";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection con = DriverManager.getConnection(url, user, password);
		//DriverManager : 똑같은 드라이버를 두 개 이상 중복 로딩하지 않도록 관리하는 객체.
		
		Statement stmt = con.createStatement();
		String sql = "create table testboard (t_no number(5) primary key"
				+ ", t_title varchar2(90)"
				+ ", t_writer varchar2(60)"
				+ ", t_cnts varchar(300)"
				+ ", t_date date)";
		
		int successCount = stmt.executeUpdate(sql); //1:성공, 0:실패.
		System.out.println("create table : " + successCount);
		//stmt.execute... : select -> ResultSet
		//                  insert/update/delete -> 성공 건수 
		
		stmt.close();
		con.close();
		
	}//main

}//class

/*
 * create sequence tno_seq
 * start with 1 
 * increment by 1
 * maxvalue 99999
 * nocycle;
 */
