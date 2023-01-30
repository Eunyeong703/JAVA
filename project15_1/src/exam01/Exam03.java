package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
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
		 
		 // ���� ������ �̿��Ͽ� ������ ��������, ���� ���� ��ü ����
		 Statement stmt = con.createStatement();
		 System.out.println("������ ���� ��ü ���� ����");
		 
		 // ������ �Է� �ޱ�
		 System.out.print("�̸� �Է� : ");
		 String name = sc.next();
		 System.out.print("���� ���� �Է� : ");
		 int kor = sc.nextInt();
		 System.out.print("���� ���� �Է� : ");
		 int eng = sc.nextInt();
		 System.out.print("���� ���� �Է� : ");
		 int math = sc.nextInt();
		 
		 int sum = kor + eng + math;
		 double avg = sum / 3.0;
		 
		 // �Էµ� ���� DB�� ������ �����ϱ�
		 // insert, delete, update�� ������� �ݿ��� ���ڵ��� ���� ��ȯ�Ѵ�.
		 // executeUpdate() : insert, delete, update �� ���
		 // sql���� �ۼ��� ���ڿ��� �������� ';'�� �����ؾ��Ѵ�. �� �׷��� ���� �߻�
		 String sql = "insert into student values('"+name+"', "+kor+", "+eng+", "
		 		+ ""+math+", "+sum+", "+avg+")";
		 int result = stmt.executeUpdate(sql);
		 System.out.println(result + "���� ���ԵǾ����ϴ�.");
	}
}