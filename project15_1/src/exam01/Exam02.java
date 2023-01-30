package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Exam02 {
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("등록 성공");
		} catch(Exception e) {
			System.out.println("등록 실패");
		}
		
		 Connection con = null;
		 
		 try {
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "system";
			String pwd = "oracle";
			
			con = DriverManager.getConnection(url, user, pwd);
			System.out.println("연결 성공");
		} catch (Exception e) {
			// TODO: handle exception
			 System.out.println("연결 실패");
		}
		 
		 // 정적 쿼리를 이용하여 데이터 가져오기
		 Statement stmt = con.createStatement();
		 System.out.println("데이터 전송 객체 생성 성공");
		 
		 // 데이터 가져오기
		 // ResultSet : SQL 데이터 가져오는 객체
		 // executeQuery는 select일 때만 사용
		 ResultSet rs = stmt.executeQuery("select * from student");
		 
		 // rs.next() : 다음값이 있으면 true, 없으면 false
		 while(rs.next()) {
			 String name = rs.getString(1);
			 int kor = rs.getInt(2);
			 int eng = rs.getInt(3);
			 int math = rs.getInt(4);
			 int sum = rs.getInt(5);
			 double avg = rs.getDouble(6);
			 
			 System.out.println("### " + name + " 님 ###");
			 System.out.println("총점 : " + sum + "점");
			 System.out.println("평균 : " + avg + "점");
			 
		 }
	}
}
