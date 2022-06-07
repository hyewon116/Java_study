package ch17;

//프로시저 호출

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC8Callable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");

		String user = "c##scott", password = "tiger";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection con = DriverManager.getConnection(url, user, password);
		
		String sql = "{call testproc1}";
		CallableStatement csmt = con.prepareCall(sql);
		
		int i = csmt.executeUpdate();
		System.out.println("성공 여부 : " + i);
		
		csmt.close();
		con.close();
	}//main
}//class

/*
create or replace procedure testproc1
is
begin
    insert into testboard values(tno_seq.nextval, 'test', 'tester'
            , 'this is test', sysdate);
end;
 */
