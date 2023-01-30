package exam01;

import java.sql.Connection;
import java.sql.DriverManager;

public class Exam01 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("등록 성공");
		} catch(Exception e) {
			System.out.println("등록 실패");
		}
		
		Connection con = null;
		
		try {
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
			String user = "system";
			String pwd = "oracle";
			
			con = DriverManager.getConnection(url, user, pwd);
			System.out.println("연결 성공");
		} catch(Exception e) {
			System.out.println("연결 실패");
		}
	}
}
