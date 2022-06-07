package ch17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.OracleTypes; //import 타입 주의!!
import oracle.jdbc.internal.OracleCallableStatement; //import 타입 주의!!

public class JDBC8Callable3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");

		String user = "c##scott", password = "tiger";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection con = DriverManager.getConnection(url, user, password);
		
		String sql = "{call testproc2(?)}";
		OracleCallableStatement csmt 
					= (OracleCallableStatement) con.prepareCall(sql);
		csmt.registerOutParameter(1, OracleTypes.CURSOR); //1번 물음표의 타입 설정
		csmt.executeUpdate();
		ResultSet rs = csmt.getCursor(1);
		while(rs.next()) {
			System.out.print(rs.getString("empno") + " ");
			System.out.print(rs.getString("ename") + " ");
			System.out.print(rs.getString("job") + " ");
			System.out.print(rs.getString("sal") + " ");
			System.out.println(rs.getString("deptno") + " ");
		}//while
		csmt.close();
		con.close();
		
	}//main

}//class






