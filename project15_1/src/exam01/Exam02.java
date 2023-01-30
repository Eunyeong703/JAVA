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
			System.out.println("��� ����");
		} catch(Exception e) {
			System.out.println("��� ����");
		}
		
		 Connection con = null;
		 
		 try {
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "system";
			String pwd = "oracle";
			
			con = DriverManager.getConnection(url, user, pwd);
			System.out.println("���� ����");
		} catch (Exception e) {
			// TODO: handle exception
			 System.out.println("���� ����");
		}
		 
		 // ���� ������ �̿��Ͽ� ������ ��������
		 Statement stmt = con.createStatement();
		 System.out.println("������ ���� ��ü ���� ����");
		 
		 // ������ ��������
		 // ResultSet : SQL ������ �������� ��ü
		 // executeQuery�� select�� ���� ���
		 ResultSet rs = stmt.executeQuery("select * from student");
		 
		 // rs.next() : �������� ������ true, ������ false
		 while(rs.next()) {
			 String name = rs.getString(1);
			 int kor = rs.getInt(2);
			 int eng = rs.getInt(3);
			 int math = rs.getInt(4);
			 int sum = rs.getInt(5);
			 double avg = rs.getDouble(6);
			 
			 System.out.println("### " + name + " �� ###");
			 System.out.println("���� : " + sum + "��");
			 System.out.println("��� : " + avg + "��");
			 
		 }
	}
}
