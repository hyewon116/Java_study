package ch17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC2OV {

	public static void main(String[] args) 
			throws ClassNotFoundException, SQLException {
		//1단계 : 오라클이 제공한 접속 프로그램을 자바 메모리에 로딩. 
		//Class.forName: 이름으로 클래스 파일을 찾아서 메모리에 로딩하는 메소드
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//2단계 : 오라클이 제공한 방법으로 접속(ip address/port, id, pwd)
		String id = "c##scott", pwd = "tiger";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";  //oracle db가 사용하는 주소:1521
		Connection con = DriverManager.getConnection(url, id, pwd);
		//Connection,DriverManager - import 필요
		//3단계 : Query(sql) 전송 
		//Statement : sql을 담는 전송 바구니.
		//Statement = 반드시 java.sql 을 import!!!
		Statement stmt = con.createStatement();
		String sql = "select empno, ename, job, sal, deptno from emp"; //★주의!!! sql(""사이)에 ;을 넣지 않는다.
		ResultSet rs = stmt.executeQuery(sql);
		//4단계 : 결과 확인. 
		//rs.next() = 첫 번째 행으로 이동
		while(rs.next()) {
//			System.out.print(rs.getInt(1) + " "); //= empno //sql은 1번지가 처음
//			System.out.print(rs.getString(2) + " ");// =ename
//			System.out.print(rs.getString(3) + " "); // =job
//			System.out.print(rs.getInt(4) + " "); // =sal
//			System.out.println(rs.getInt(5) + " "); // =deptno
			System.out.print(rs.getString("empno") + " "); //숫자도 문자(String)로 받을 수 있음
			System.out.print(rs.getString("ename") + " "); 
			System.out.print(rs.getString("job") + " "); 
			System.out.print(rs.getString("sal") + " "); 
			System.out.println(rs.getString("deptno")); 
		}//while
		//5단계 : 접속 해제 : close 
		rs.close();
		stmt.close();
		con.close();
	}//main

}//class
