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
			System.out.println("��� ����");
			
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "system";
			String pwd = "oracle";
			
			con = DriverManager.getConnection(url, user, pwd);
			System.out.println("���� ����");
		}catch(Exception e) {
			System.out.println("����");
		}
		
		System.out.print("������ �̸� �Է� : ");
		String name = sc.next();
		
		Statement stmt = con.createStatement();
		
		int result = stmt.executeUpdate
				("delete from student where name='"+name+"'");
		
		if(result >= 1) {
			System.out.println(name + "���� ������ �����Ǿ����ϴ�.");
		} else {
			System.out.println("ã���ô� " + name + "���� ������ �����ϴ�.");
		}
	}
}