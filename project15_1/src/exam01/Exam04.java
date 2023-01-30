package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Exam04 {
	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("등록 성공");
			
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "system";
			String pwd = "oracle";
			
			con = DriverManager.getConnection(url, user, pwd);
			System.out.println("연결 성공");
		}catch(Exception e) {
			System.out.println("실패");
		}
		
		System.out.print("삭제할 이름 입력 : ");
		String name = sc.next();
		
		Statement stmt = con.createStatement();
		
		int result = stmt.executeUpdate
				("delete from student where name='"+name+"'");
		
		if(result >= 1) {
			System.out.println(name + "님의 정보가 삭제되었습니다.");
		} else {
			System.out.println("찾으시는 " + name + "님의 정보가 없습니다.");
		}
	}
}